package com.ysd.task.search;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.aipg.transquery.TransQueryReq;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.dao.AccountCashMapper;
import com.ysd.account.dao.BankSearchMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.AccountCash;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.pay.service.CashService;
import com.ysd.pay.service.RechargeService;
import com.ysd.task.config.AppConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by yujian on 2017/9/27.
 */
@Component
public class CashSearchJob {

    private Logger logger = LogManager.getLogger(RechargeSearchJob.class);


    private AtomicBoolean isRunning = new AtomicBoolean(false);


    @Autowired
    private BankSearchMapper bankSearchMapper;

    @Autowired
    private CashService cashService;
    @Autowired
    private AccountCashMapper accountCashMapper;

    @Autowired
    private AppConfig appConfig;

    /**
     * 订单查询
     */
    //@Scheduled(cron = "${cash.end.job.cron}")
    public void search() {


        logger.info("runtime:{}", appConfig.getRuntimeEnv());
        boolean b = false;
        try{

            if(isRunning.compareAndSet(false,true)){
                logger.info("search not end recharge order...");


                //Thread.sleep(10000);

                List<BankSearch> aList = bankSearchMapper.selectCashNotEnd();

                if(aList==null || aList.size()<=0){
                    logger.debug("cash bank search list is null");
                    return;
                }


                for(BankSearch bs : aList){
                    deal(bs);
                }

                //isRunning.set(false);
            }else{
                logger.debug("recharge job is not end...");
                b = true;
                return;
            }

        }catch (Exception ex){
            ex.printStackTrace();
            logger.error(ex);

        }finally {
            if(!b){
                isRunning.set(false);
            }

        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    private void deal(BankSearch bs){
        TranxService tranxService = new TranxServiceImpl();

        TransQueryReq req = new TransQueryReq();
        req.setQUERY_SN(bs.getBankOrderId());

        logger.debug("setQUERY_SN:{}",req.getQUERY_SN());
        AipgRsp aipgRsp =  tranxService.queryTrans(req);

        InfoRsp info = aipgRsp.getINFO();
        String infoRetCode = info.getRET_CODE();

        if ("0000".equals(infoRetCode)) {
            QTransRsp ret = (QTransRsp) aipgRsp.findObj(QTransRsp.class);

            QTDetail detail = (QTDetail)ret.getDetails().get(0);
            String resultCode = detail.getRET_CODE();


            if ("0000".equals(resultCode)) {
                logger.debug("订单成功");


                AccountCash uar= accountCashMapper.selectById( bs.getOrderId().intValue());
                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",uar.getTotal());
                map.put("feeAmt", String.valueOf(uar.getFee()));
                map.put("cashId", uar.getTradeNo());
                map.put("status", "1");
                cashService.cashNotify(map);

                bs.setStatus("1");
                bankSearchMapper.updateById(bs);
            }else{
                logger.debug("订单失败");

                if(bs.getRetryNum()>=2){

                    AccountCash uar= accountCashMapper.selectById( bs.getOrderId().intValue());
                    Map<String,Object> map= new HashMap<String ,Object>();
                    map.put("tranAmt",uar.getTotal());
                    map.put("feeAmt", String.valueOf(uar.getFee()));
                    map.put("cashId", uar.getTradeNo());
                    map.put("status", "2");
                    cashService.cashNotify(map);

                    bs.setRetryNum((byte)3);
                    bs.setStatus("2");
                    bankSearchMapper.updateById(bs);
                }else{
                    bs.setRetryNum((byte)(bs.getRetryNum().intValue()+1));
                    bankSearchMapper.updateById(bs);
                }

            }
        }else{
            if(bs.getRetryNum()>=2){
                bs.setRetryNum((byte)3);
                bs.setStatus("2");
                bankSearchMapper.updateById(bs);
            }else{
                bs.setRetryNum((byte)(bs.getRetryNum().intValue()+1));
                bankSearchMapper.updateById(bs);
            }
        }
        logger.debug(aipgRsp);
    }


}
