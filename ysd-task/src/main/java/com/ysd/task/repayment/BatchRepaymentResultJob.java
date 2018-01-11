package com.ysd.task.repayment;

import com.allin.mtp.model.RepaymentResult;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.service.impl.MTPTranxServiceImpl;
import com.allin.mtp.util.AllinMTPConfig;
import com.ysd.account.criteria.AccountCashCriteria;
import com.ysd.account.criteria.MtpRepaymentBatchFileCriteria;
import com.ysd.account.criteria.MtpRepaymentRecordCriteria;
import com.ysd.account.dao.AccountCashMapper;
import com.ysd.account.dao.MtpRepaymentBatchFileMapper;
import com.ysd.account.dao.MtpRepaymentRecordMapper;
import com.ysd.account.entity.AccountCash;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.MtpRepaymentBatchFile;
import com.ysd.account.entity.MtpRepaymentRecord;
import com.ysd.pay.service.CashService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author xishengchun on 2017-12-13.
 * 批量还款
 */
@Component
public class BatchRepaymentResultJob {

    private Logger logger = LogManager.getLogger(BatchRepaymentResultJob.class);

    @Autowired
    private AccountCashMapper accountCashMapper;

    @Autowired
    private MtpRepaymentRecordMapper mtpRepaymentRecordMapper;

    @Autowired
    private MtpRepaymentBatchFileMapper mtpRepaymentBatchFileMapper;

    @Autowired
    private CashService cashService;

    private MTPTranxService mtpTranxService = new MTPTranxServiceImpl();

    private AtomicBoolean isRunning = new AtomicBoolean(false);


    @Scheduled(cron = "${mtp.batch.repayment.download.cron}")
    @Transactional(rollbackFor = {Exception.class})
    public void job() {


        boolean bb = false;
        try{

            if(isRunning.compareAndSet(false,true)){
                logger.info("search not end recharge order...");



                // 查询提交成功的批量还款文件,检查是否有还款结果
                MtpRepaymentBatchFileCriteria mtpRepaymentBatchFileCriteria = new MtpRepaymentBatchFileCriteria();
                mtpRepaymentBatchFileCriteria.createCriteria()
                        .andStatusEqualTo(1)
                ;
                List<MtpRepaymentBatchFile> mtpRepaymentBatchFiles = mtpRepaymentBatchFileMapper.selectByCriteria(mtpRepaymentBatchFileCriteria);
                if (CollectionUtils.isEmpty(mtpRepaymentBatchFiles)) {
                    return;
                }

                try {
                    for (MtpRepaymentBatchFile mtpRepaymentBatchFile : mtpRepaymentBatchFiles) {
                        boolean b = mtpTranxService.downloadRepayment(mtpRepaymentBatchFile.getTransDate(), mtpRepaymentBatchFile.getBatchNo());
                        if (!b) {
                            logger.warn("回盘文件下载失败:{}", mtpRepaymentBatchFile.getBatchNo());
                            continue;
                        }
                        String batchNo = mtpRepaymentBatchFile.getBatchNo();
                        String backBatchNo = batchNo.replaceAll("ST", "RST");
                        MtpRepaymentBatchFile update = new MtpRepaymentBatchFile();
                        update.setId(mtpRepaymentBatchFile.getId());
                        update.setBackBatchNo(backBatchNo);
                        update.setBackTime(new Date());
                        if (b) {
                            handleLines(backBatchNo);
                            update.setStatus(2);
                        } else {
                            logger.warn("下载文件失败");
                            update.setStatus(3);
                        }
                        mtpRepaymentBatchFileMapper.updateById(update);
                    }
                } catch(Exception e) {
                    logger.error("下载还款结果文件异常", e);
                }

            }else{
                logger.debug("recharge job is not end...");
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
     * 读取行,进行业务处理
     * @param backBatchNo
     */
    public void handleLines(String backBatchNo) {
        String filePath = AllinMTPConfig.getResultRepaymentFilePath() + "/" + backBatchNo;

        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            List<String> lines = IOUtils.readLines(fileInputStream, "utf-8");
            if (CollectionUtils.isEmpty(lines)) {
                return;
            }

            // 索引从1开始,第1行是状态,不需要处理
            for (int i = 1; i < lines.size(); i++) {
                RepaymentResult repaymentResult = parseLine(lines.get(i));
                if (repaymentResult != null) {
                    String tradeNo = repaymentResult.getTradeNo();
                    // 还款成功
                    if (repaymentResult.ok()) {
                        updateRepayment(2, tradeNo, repaymentResult.getAllinTradeNo());
                        AccountCash accountCash = getAccountCash(tradeNo);
                        if (accountCash != null) {
                            updateAccountCash(accountCash, "1");
                        } else {
                            // do nothing
                        }
                    } else {
                        updateRepayment(3, tradeNo, repaymentResult.getAllinTradeNo());
                        AccountCash accountCash = getAccountCash(tradeNo);
                        updateAccountCash(accountCash, "2");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            logger.error("处理还款批量文件异常,文件找不到", e);
        } catch (Exception e) {
            logger.error("处理还款批量文件异常", e);
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    logger.error("处理还款批量,关闭流失败", e);
                }
            }
        }
    }


    /**
     *
     * @param tradeNo
     * 提交到通联的流水号
     * @return
     */
    private AccountCash getAccountCash(String tradeNo) {

        MtpRepaymentRecordCriteria mtpRepaymentRecordCriteria = new MtpRepaymentRecordCriteria();
        mtpRepaymentRecordCriteria.createCriteria()
                .andAllinSubmitTradeNoEqualTo(tradeNo)
        ;
        // 根据通联流水号,查询提现订单号
        List<MtpRepaymentRecord> mtpRepaymentRecords = mtpRepaymentRecordMapper.selectByCriteria(mtpRepaymentRecordCriteria);
        if (CollectionUtils.isNotEmpty(mtpRepaymentRecords)) {
            MtpRepaymentRecord mtpRepaymentRecord = mtpRepaymentRecords.get(0);
            AccountCashCriteria accountCashCriteria = new AccountCashCriteria();
            accountCashCriteria.createCriteria().andTradeNoEqualTo(mtpRepaymentRecord.getTradeNo());
            List<AccountCash> accountCashes = accountCashMapper.selectByCriteria(accountCashCriteria);
            if (CollectionUtils.isNotEmpty(accountCashes)) {
                return accountCashes.get(0);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    /**
     * 更新还款数据
     * @param repaymentStatus
     * @param tradeNo
     * 提交到通联的流水号
     */
    private void updateRepayment(int repaymentStatus, String tradeNo, String allinTradeNo) {
        MtpRepaymentRecord mtpRepaymentRecord = new MtpRepaymentRecord();
        mtpRepaymentRecord.setMtpRepaymentStatus(repaymentStatus);
        mtpRepaymentRecord.setAllinTradeNo(allinTradeNo);
        MtpRepaymentRecordCriteria mtpRepaymentRecordCriteria = new MtpRepaymentRecordCriteria();
        mtpRepaymentRecordCriteria.createCriteria()
                .andAllinSubmitTradeNoEqualTo(tradeNo)
        ;
        mtpRepaymentRecordMapper.updateByCriteria(mtpRepaymentRecord, mtpRepaymentRecordCriteria);
    }

    /**
     * 更新流水表
     * @param accountCash
     * @param status
     */
    private void updateAccountCash(AccountCash accountCash, String status) {
        Map<String, Object> param = new HashMap<>();
        param.put("cashId", accountCash.getTradeNo());
        param.put("status", status);
        cashService.cashNotify(param);
    }

    /**
     * 解析行
     * @param line
     * 申请方交易流水号|受理方交易流水号|二级商户号|通联会员号|还款类型|支付模式|银行编码
     * |账号类型|账号|联行号|交易币种|交易金额|营销金额|交易份额|现金账户代码|结算账户银行编码|结算账户账号|
     * 扩展字段1|扩展字段2|扩展字段3|清算日期|交易返回码|交易返回信息|附加信息1
     * @return
     */
    private RepaymentResult parseLine(String line) {
        if (StringUtils.isBlank(line)) {
            return null;
        }
        String[] values = line.split("\\|");
        RepaymentResult repaymentResult = new RepaymentResult();
        repaymentResult.setTradeNo(values[0]);
        repaymentResult.setAllinTradeNo(values[1]);
        repaymentResult.setSignNum(values[3]);
        repaymentResult.setRespCode(values[21]);
        repaymentResult.setRespMsg(values[22]);
        repaymentResult.setClearingDate(values[20]);
        return repaymentResult;
    }

}
