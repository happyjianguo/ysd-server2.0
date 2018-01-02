package com.ysd.task.repayment;

import com.allin.mtp.constant.MTPBank;
import com.allin.mtp.model.SummaryRepayment;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.service.impl.MTPTranxServiceImpl;
import com.allin.mtp.util.AllinMTPConfig;
import com.allin.mtp.util.AllinMTPUtil;
import com.ysd.account.criteria.MtpRepaymentBatchFileCriteria;
import com.ysd.account.criteria.MtpRepaymentRecordCriteria;
import com.ysd.account.dao.MtpRepaymentBatchFileMapper;
import com.ysd.account.dao.MtpRepaymentRecordMapper;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.MtpRepaymentBatchFile;
import com.ysd.account.entity.MtpRepaymentRecord;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author xishengchun on 2017-12-13.
 * 批量还款
 */
@Component
public class BatchRepaymentJob {

    private Logger logger = LogManager.getLogger(BatchRepaymentJob.class);

    @Autowired
    private MtpRepaymentRecordMapper mtpRepaymentRecordMapper;

    @Autowired
    private MtpRepaymentBatchFileMapper mtpRepaymentBatchFileMapper;

    @Autowired
    private UserMapper userMapper;

    private AtomicBoolean isRunning = new AtomicBoolean(false);


    private MTPTranxService mtpTranxService = new MTPTranxServiceImpl();

    @Scheduled(cron = "${mtp.batch.repayment.submit.cron}")
    @Transactional(rollbackFor = Exception.class)
    public void job() {

        boolean bb = false;
        try{

            if(isRunning.compareAndSet(false,true)){
                logger.info("beatch upload not end  ...");


                Map<String,Object> map = buildBatchFile();

                if( map == null){
                    return ;
                }

                MtpRepaymentBatchFile mtpRepaymentBatchFile = (MtpRepaymentBatchFile)map.get("mtpRepaymentBatchFile");
                if(mtpRepaymentBatchFile == null){
                    return;
                }

                SummaryRepayment summaryRepayment = new SummaryRepayment();
                summaryRepayment.setTransDate(mtpRepaymentBatchFile.getTransDate());
                summaryRepayment.setTotalUnits(mtpRepaymentBatchFile.getTotalUnits().toString());
                summaryRepayment.setTotalDiscount(mtpRepaymentBatchFile.getTotalDiscount().toString());
                summaryRepayment.setTotalCount(mtpRepaymentBatchFile.getTotalCount().toString());
                summaryRepayment.setBatchNo(mtpRepaymentBatchFile.getBatchNo());
                summaryRepayment.setTotalAmount(mtpRepaymentBatchFile.getTotalAmount().toString());
                try {
                    boolean b = mtpTranxService.batchRepayment(summaryRepayment);
                    // 文件提交成功,则更新批量文件数据的状态
                    if (b) {
                        MtpRepaymentBatchFile update = new MtpRepaymentBatchFile();
                        update.setId(mtpRepaymentBatchFile.getId());
                        update.setStatus(1);
                        mtpRepaymentBatchFileMapper.updateById(update);
                    }else{
                        MtpRepaymentBatchFile update = new MtpRepaymentBatchFile();
                        update.setId(mtpRepaymentBatchFile.getId());
                        update.setStatus(-1);
                        mtpRepaymentBatchFileMapper.updateById(update);

                        List<MtpRepaymentRecord> updates = ( List<MtpRepaymentRecord>)map.get("updates");
                        for (MtpRepaymentRecord update_r : updates) {
                            update_r.setMtpRepaymentStatus(0);// -1:废弃;0:新创建,未提交;1：已经提交;2:回盘成功3:回盘失败;
                            mtpRepaymentRecordMapper.updateById(update_r);
                        }
                    }
                } catch (Exception e) {
                    logger.error("生成批量还款文件失败", e);
                }


            }else{
                logger.debug("batch upload job is not end...");
                bb = true;
                return;
            }

        }catch (Exception ex){
            ex.printStackTrace();
            logger.error(ex);

        }finally {
            if(!bb){
                isRunning.set(false);
            }
        }


    }

    /**
     * 生成文件
     * 将文件中的提现记录更新成提交中
     * @return
     * 返回BatchNo,即文件名称
     */

    public Map<String,Object> buildBatchFile() {

        Map<String,Object> map = new HashMap<String,Object>();

        // 查询未提交的提现申请数据
        MtpRepaymentRecordCriteria mtpRepaymentRecordCriteria = new MtpRepaymentRecordCriteria();
        mtpRepaymentRecordCriteria.createCriteria()
                .andMtpRepaymentStatusEqualTo(0)
        ;
        List<MtpRepaymentRecord> mtpRepaymentRecords = mtpRepaymentRecordMapper.selectByCriteria(mtpRepaymentRecordCriteria);
        if (CollectionUtils.isEmpty(mtpRepaymentRecords)) {
            return null;
        }


        List<MtpRepaymentRecord> updates = new ArrayList<MtpRepaymentRecord>();
//        20171120000000012903||201709271201281985|0|0|03040000|1|1234551234567890166||156|100|0|0||03040000|78280000123||||
//      申请方交易流水号|二级商户号|通联会员号|还款类型|支付模式|银行编码|账号类型|账号|联行号|交易币种|交易金额|营销金额|交易份额|现金账户代码|结算账户银行编码|结算账户账号|合作商户编码|联合商户编码|联合商户购买类交易机构交易流水|附加信息1
        StringBuffer repaymentBuffer = new StringBuffer();
        int count = 0;
        BigDecimal totalRepaymentCash = new BigDecimal(0);
        for (MtpRepaymentRecord mtpRepaymentRecord : mtpRepaymentRecords) {

            // 查询用户信息
            User user = userMapper.selectById(mtpRepaymentRecord.getUserId());
            if (user == null) {
                continue;
            }
            String mtpSignNum = user.getMtpSignNum();
            // 通联会员号为空,则不做处理
            if (StringUtils.isBlank(mtpSignNum)) {
                continue;
            }
            String bank = mtpRepaymentRecord.getBank();


            totalRepaymentCash = totalRepaymentCash.add(mtpRepaymentRecord.getCredited());

            count++;
            // 申请方交易流水号,每次都重新生成这个流水号,防止需要重复处理的数据
            String allinSubmitTradeNo = AllinMTPUtil.getReqTraceNum();
            repaymentBuffer.append(allinSubmitTradeNo)
                    // 二级商户号
                    .append("|").append(StringUtils.EMPTY)
                    // 通联会员号
                    .append("|").append(user.getMtpSignNum())
                    // 还款类型 0.还款；1.普通赎回；2.退款；3.强赎；4.现金分红；机构上送仅支持0、1
                    .append("|").append("0")
                    // 支付模式 0.银行卡支付；2.余额账户支付；3.现金账户支付；4.机构自付；目前支持0、2、4。
                    .append("|").append("0")
                    // 银行编码
                    .append("|").append(MTPBank.getBankIdByCode(bank))
                    // 账号类型 1：借记卡；2：贷记卡；3：存折；4：证券资金账户5：手机号 6：对公账户
                    .append("|").append("1")
                    // 账号
                    .append("|").append(mtpRepaymentRecord.getAccount())
                    // 联行号
                    .append("|").append(StringUtils.EMPTY)
                    // 交易币种
                    .append("|").append("156")
                    // 交易金额
                    .append("|").append(toFen(mtpRepaymentRecord.getCredited()))
                    // 营销金额
                    .append("|").append("0")
                    // 交易份额
                    .append("|").append("0")
                    // 现金账户代码
                    .append("|").append(StringUtils.EMPTY)
                    // 结算账户银行编码,固定值
                    .append("|").append("03040000")
                    // 结算账户账号,固定值
                    .append("|").append("78380000123")
                    // 合作商户编码
                    .append("|").append(StringUtils.EMPTY)
                    // 联合商户编码
                    .append("|").append(StringUtils.EMPTY)
                    // 联合商户购买类交易机构交易流水
                    .append("|").append(StringUtils.EMPTY)
                    // 附加信息1
                    .append("|").append(StringUtils.EMPTY)
                    .append(IOUtils.LINE_SEPARATOR)
            ;

            // 更新提现申请的状态成已提成
            MtpRepaymentRecord update = new MtpRepaymentRecord();
            update.setId(mtpRepaymentRecord.getId());
            update.setAllinSubmitTradeNo(allinSubmitTradeNo);
            update.setMtpRepaymentStatus(1);// -1:废弃;0:新创建,未提交;1：已经提交;2:回盘成功3:回盘失败;
            mtpRepaymentRecordMapper.updateById(update);
            updates.add(update);
        }
        map.put("updates",updates);

        FileOutputStream fileOutputStream = null;
        try {
            // 当天计算的批次号
            // 查询当天已经生成的批次号
            MtpRepaymentBatchFileCriteria mtpRepaymentBatchFileCriteria = new MtpRepaymentBatchFileCriteria();
            mtpRepaymentBatchFileCriteria.createCriteria()
                    .andCreateTimeBetween(AllinMTPUtil.getBeginOfToday(), AllinMTPUtil.getEndOfToday());

            long num = mtpRepaymentBatchFileMapper.countByCriteria(mtpRepaymentBatchFileCriteria);
            String newBatchNo = AllinMTPUtil.getBatchNo((int) num);
            String filePath = AllinMTPConfig.getBatchRepaymentBuildFilePath() + "/" + newBatchNo;
            File file = new File(filePath);
            fileOutputStream = new FileOutputStream(file);
            IOUtils.write(repaymentBuffer.toString(), fileOutputStream);

            // 保存到批量文件提交表中
            MtpRepaymentBatchFile mtpRepaymentBatchFile = new MtpRepaymentBatchFile();
            mtpRepaymentBatchFile.setBatchNo(newBatchNo);
            mtpRepaymentBatchFile.setTransDate(AllinMTPUtil.getDateString(AllinMTPUtil.getBeginOfToday()));
            mtpRepaymentBatchFile.setProductNum(AllinMTPConfig.getProductNum());
            mtpRepaymentBatchFile.setCreateTime(new Date());
            mtpRepaymentBatchFile.setTotalUnits(BigDecimal.ZERO);
            mtpRepaymentBatchFile.setTotalDiscount(BigDecimal.ZERO);
            mtpRepaymentBatchFile.setTotalAmount(toFen(totalRepaymentCash.setScale(2)));// TODO
            mtpRepaymentBatchFile.setStatus(0);// 批量还款文件的处理状态;-1:废弃;0:新创建,未提交;1：已经提交;2:回盘成功3:回盘失败;
            mtpRepaymentBatchFile.setTotalCount(new BigDecimal(count));
            mtpRepaymentBatchFileMapper.insert(mtpRepaymentBatchFile);

            map.put("mtpRepaymentBatchFile",mtpRepaymentBatchFile);

            return map;
        } catch(Exception e) {
            logger.error("生成文件失败", e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                logger.error("关闭文件流失败", e);
            }
        }
        return null;
    }

    private BigDecimal toFen(BigDecimal value) {
        return value.multiply(new BigDecimal(100)).setScale(0);
    }


}
