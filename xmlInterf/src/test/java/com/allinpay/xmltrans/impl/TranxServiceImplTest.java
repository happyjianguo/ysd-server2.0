package com.allinpay.xmltrans.impl;

import com.aipg.acquery.AcQueryReq;
import com.aipg.ahquery.AHQueryReq;
import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rnp.Rnpa;
import com.aipg.rnp.RnpaRet;
import com.aipg.rnp.Rnpc;
import com.aipg.rnp.RnpcRet;
import com.aipg.rtreq.Trans;
import com.aipg.synreq.SCloseReq;
import com.aipg.synreq.SCloseRsp;
import com.aipg.transquery.TransQueryReq;
import com.allinpay.util.AllinPayUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.BankType;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author xishengchun on 2017-09-24.
 */
public class TranxServiceImplTest {

    private Logger logger = LogManager.getLogger(TranxServiceImplTest.class);

    private TranxService tranxService = new TranxServiceImpl();

    @Test
    public void testBindCard() {
        Rnpa rnpa = new Rnpa();
        rnpa.setID_TYPE(IDType.ID_CARD.code);
        rnpa.setID("330825198505313111");
        rnpa.setBANK_CODE(Bank.ABC.code);
        rnpa.setACCOUNT_NO("6228430329520075072");
        rnpa.setACCOUNT_NAME("席胜春");
        rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
        rnpa.setACCOUNT_PROP("0");
        rnpa.setTEL("18662376333");

        /*rnpa.setBANK_CODE(Bank.CCB.code);
        rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
        rnpa.setACCOUNT_NO("6227001334800010808");
        rnpa.setACCOUNT_NAME("周晶");
        rnpa.setACCOUNT_PROP("0");
        rnpa.setID_TYPE(IDType.ID_CARD.code);
        rnpa.setID("321081198212200320");
        rnpa.setTEL("15651046053");*/

        /*rnpa.setBANK_CODE(Bank.CCB.code);
        rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
        rnpa.setACCOUNT_NO("6217001450000065714");
        rnpa.setACCOUNT_NAME("岳野");
        rnpa.setACCOUNT_PROP("0");
        rnpa.setID_TYPE(IDType.ID_CARD.code);
        rnpa.setID("230103198801265513");
        rnpa.setTEL("15521039744");*/

        AipgRsp aipgRsp = tranxService.bindCard(rnpa);
        InfoRsp info = aipgRsp.getINFO();
        String infoRetCode = info.getRET_CODE();
        String errMsg = info.getERR_MSG();

        logger.debug("reqSN:{}", aipgRsp.getINFO().getREQ_SN());
        if ("0000".equals(infoRetCode)) {
            logger.debug("提交成功");
            RnpaRet ret = (RnpaRet) aipgRsp.findObj(RnpaRet.class);
            logger.error("交易结果:{}", ret.getRET_CODE(), ret.getERR_MSG());
        } else {
            logger.error("响应码:{}, 原因:{}", infoRetCode, errMsg);

        }
    }

    @Test
    public void testBindCardConfirm() {
        Rnpc rnpc = new Rnpc();
        rnpc.setSRCREQSN("200604000000445-1507453567098");
        rnpc.setVERCODE("9999");
        AipgRsp aipgRsp = tranxService.confirmSmsForBindCard(rnpc);
        RnpcRet obj = (RnpcRet) aipgRsp.findObj(RnpcRet.class);
        logger.debug("obj:{}", obj.getERR_MSG());
    }

    @Test
    public void testRecharge() {
//        Trans trans = new Trans();
//        trans.setACCOUNT_NAME("席胜春");
//        trans.setACCOUNT_NO("6228430329520075072");
//        trans.setACCOUNT_PROP("0");
//        trans.setAMOUNT("100");
//        trans.setBANK_CODE(Bank.ABC.code);
//        trans.setCURRENCY("CNY");
//        trans.setCUST_USERID("18662376333");
//        trans.setTEL("18662376333");
//        AipgRsp recharge = tranxService.recharge(trans, "");
//
//        // 查询实名付的代收结果(即充值)
//        TransQueryReq transQueryReq = new TransQueryReq();
//        transQueryReq.setQUERY_SN(recharge.getINFO().getREQ_SN());
//        AipgRsp aipgRsp = tranxService.queryTrans(transQueryReq);
    }

    @Test
    public void testDeposit() {
//        Trans trans = new Trans();
//        trans.setACCOUNT_NAME("席胜春");
//        trans.setACCOUNT_NO("6228430329520075072");
//        trans.setACCOUNT_PROP("0");
//        trans.setAMOUNT("1");
//        trans.setBANK_CODE(Bank.ABC.code);
//        trans.setCURRENCY("CNY");
//        trans.setCUST_USERID("18662376333");
//        trans.setTEL("18662376333");
//        AipgRsp deposit = tranxService.deposit(trans, "");
//
//        // 查询实名付的代付结果(即充值)
//        // 查询条件说明,请查看接口文档:
//        // http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail134.html
//        /*TransQueryReq transQueryReq = new TransQueryReq();
//        transQueryReq.setQUERY_SN(deposit.getINFO().getREQ_SN());
//        AipgRsp aipgRsp = tranxService.queryTrans(transQueryReq);*/
    }

    @Test
    public void testMerAccBalance() {
        AHQueryReq queryReq = new AHQueryReq();
        queryReq.setSTARTDAY("20170925");
        queryReq.setENDDAY("20170925");
        tranxService.merAcctBalance(queryReq);
    }

    @Test
    public void queryAccount() {
        AcQueryReq acQueryReq = null;
        tranxService.queryAccount(acQueryReq);
    }

    @Test
    public void testUnBind() {
//        SCloseReq sCloseReq = new SCloseReq();
//        AipgRsp aipgRsp = tranxService.unBindCard(sCloseReq);
//
//        InfoRsp info = aipgRsp.getINFO();
//        String infoRetCode = info.getRET_CODE();
//        String errMsg = info.getERR_MSG();
//
//        logger.debug("reqSN:{}", aipgRsp.getINFO().getREQ_SN());
//        if ("0000".equals(infoRetCode)) {
//            logger.debug("提交成功");
//            SCloseRsp ret = (SCloseRsp) aipgRsp.findObj(SCloseRsp.class);
//            String contractno = ret.getCONTRACTNO();// 合同号
//            String argeementNo = ret.getAGREEMENTNO();// 协议号
//            String memId = ret.getMEMID();// 商户客户ID
//            String acct = ret.getACCT();// 客户账号
//            String status = ret.getSTATUS();// 状态
//
//            logger.error("交易结果:{}", ret.getCONTRACTNO(), ret.getAGREEMENTNO());
//        } else {
//            logger.error("响应码:{}, 原因:{}", infoRetCode, errMsg);
//
//        }
    }
}
