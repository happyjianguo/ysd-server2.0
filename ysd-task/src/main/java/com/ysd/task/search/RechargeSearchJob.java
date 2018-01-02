package com.ysd.task.search;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.aipg.transquery.TransQueryReq;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.dao.BankSearchMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.UserAccountRecharge;
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
public class RechargeSearchJob {

    private Logger logger = LogManager.getLogger(RechargeSearchJob.class);


    private AtomicBoolean isRunning = new AtomicBoolean(false);


    @Autowired
    private BankSearchMapper bankSearchMapper;

    @Autowired
    private RechargeService rechargeService;
    @Autowired
    private UserAccountRechargeMapper userAccountRechargeMapper;

    @Autowired
    private AppConfig appConfig;

    /**
     * 订单查询
     */
    //@Scheduled(cron = "${recharge.end.job.cron}")
    public void search() {


        boolean b = false;
        try{
            logger.info("runtime:{}", appConfig.getRuntimeEnv());

            if(isRunning.compareAndSet(false,true)){
                logger.info("search not end recharge order...");


                //Thread.sleep(10000);


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


                UserAccountRecharge uar= userAccountRechargeMapper.selectById( bs.getOrderId().intValue());
                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",uar.getMoney());
                map.put("feeAmt", "0");
                map.put("tradeNo", uar.getTradeNo());
                rechargeService.rechargeSuccess(map);

                bs.setStatus("1");
                bankSearchMapper.updateById(bs);
            }else{
                logger.debug("订单失败");

                if(bs.getRetryNum()>=2){

                    //人工干预
                    /*UserAccountRecharge uar= userAccountRechargeMapper.selectById( bs.getOrderId().intValue());
                    Map<String,Object> map= new HashMap<String ,Object>();
                    map.put("tranAmt",uar.getMoney());
                    map.put("feeAmt", "0");
                    map.put("tradeNo", uar.getTradeNo());
                    rechargeService.rechargeBack(map);*/

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
