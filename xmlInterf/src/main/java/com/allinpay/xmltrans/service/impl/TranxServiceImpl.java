package com.allinpay.xmltrans.service.impl;

import com.aipg.acquery.AcQueryReq;
import com.aipg.ahquery.AHQueryReq;
import com.aipg.common.AipgReq;
import com.aipg.common.AipgRsp;
import com.aipg.common.InfoReq;
import com.aipg.rnp.Rnpa;
import com.aipg.rnp.Rnpc;
import com.aipg.rnp.Rnpr;
import com.aipg.rtreq.Trans;
import com.aipg.synreq.SCloseReq;
import com.aipg.transquery.TransQueryReq;
import com.allinpay.XmlTools;
import com.allinpay.exception.AllinPayException;
import com.allinpay.util.AllinPayUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.BankType;
import com.allinpay.xmltrans.constant.TransCode;
import com.allinpay.xmltrans.pojo.TranxContext;
import com.allinpay.xmltrans.service.TranxService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author xishengchun on 2017-09-24.
 */
public class TranxServiceImpl implements TranxService {

    private TranxContext tranxContext = TranxContext.getInstance();

    @Override
    public AipgRsp bindCard(Rnpa rnpa) {
        String xml = "";
        AipgReq aipgReq = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.BIND_CARD.code);
        aipgReq.setINFO(info);
        rnpa.setMERCHANT_ID(tranxContext.getMerchantId());
        if (!Bank.valid(rnpa.getBANK_CODE())) {
            throw new AllinPayException("实名付申请失败:申请的银行不支持")
                    .set("bankCode", rnpa.getBANK_CODE())
                    ;
        }

        if (StringUtils.isBlank(rnpa.getACCOUNT_TYPE())) {
            rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
        }

        if (StringUtils.isBlank(rnpa.getACCOUNT_NO())) {
            throw new AllinPayException("实名付申请失败:卡号不能为空")
                    ;
        }

        if (StringUtils.isBlank(rnpa.getACCOUNT_NAME())) {
            throw new AllinPayException("实名付申请失败:持卡人姓名不能为空");
        }

        if (StringUtils.isBlank(rnpa.getACCOUNT_PROP())) {
            rnpa.setACCOUNT_PROP("0");
        }

        if (StringUtils.isBlank(rnpa.getID_TYPE())) {
            throw new AllinPayException("实名付申请失败:证件类型不能为空");
        }

        if (StringUtils.isBlank(rnpa.getID())) {
            throw new AllinPayException("实名付申请失败:证件号不能为空");
        }

        if (StringUtils.isBlank(rnpa.getTEL())) {
            throw new AllinPayException("实名付申请失败:手机号不能为空");
        }

        aipgReq.addTrx(rnpa);
        xml = XmlTools.buildXml(aipgReq, true);
        String resp = AllinPayUtil.sendToTlt(xml, false);
        AipgRsp aipgRsp = AllinPayUtil.handleResult(TransCode.BIND_CARD.code, resp);
        return aipgRsp;
    }

    @Override
    public AipgRsp confirmSmsForBindCard(Rnpc rnpc) {
        AipgReq aipgReq = new AipgReq();
        if (StringUtils.isBlank(rnpc.getSRCREQSN())) {
            throw new AllinPayException("实名付结果查询失败:原流水号不能为空");
        }
        InfoReq info = AllinPayUtil.makeReq(TransCode.BIND_CARD_CONFIRM.code, rnpc.getSRCREQSN());
        aipgReq.setINFO(info);

        rnpc.setMERCHANT_ID(tranxContext.getMerchantId());
        if (StringUtils.isBlank(rnpc.getVERCODE())) {
            throw new AllinPayException("短信验证码不能为空");
        }
        aipgReq.addTrx(rnpc);
        String xml = XmlTools.buildXml(aipgReq, true);
        String resp = AllinPayUtil.sendToTlt(xml, false);
        AipgRsp aipgRsp = AllinPayUtil.handleResult(TransCode.BIND_CARD_CONFIRM.code, resp);
        return aipgRsp;
    }

    @Override
    public AipgRsp repeatSmsForBindCard(Rnpr rnpr) {
        String xml = "";
        AipgReq aipgReq = new AipgReq();

        if (StringUtils.isBlank(rnpr.getSRCREQSN())) {
            throw new AllinPayException("实名付结果查询失败:原流水号不能为空");
        }

        InfoReq info = AllinPayUtil.makeReq(TransCode.BIND_CARD_REPEAT.code, rnpr.getSRCREQSN());
        aipgReq.setINFO(info);
        rnpr.setMERCHANT_ID(tranxContext.getMerchantId());
        aipgReq.addTrx(rnpr);

        xml = XmlTools.buildXml(aipgReq, true);
        String resp = AllinPayUtil.sendToTlt(xml, false);
        AipgRsp aipgRsp = AllinPayUtil.handleResult(TransCode.BIND_CARD_REPEAT.code, resp);
        return aipgRsp;
    }

    @Override
    public AipgRsp queryBindCard(Rnpr rnpr) {
        String xml = "";
        AipgReq aipgReq = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.BIND_CARD_QUERY.code);
        aipgReq.setINFO(info);

        rnpr.setMERCHANT_ID(tranxContext.getMerchantId());
        if (StringUtils.isBlank(rnpr.getSRCREQSN())) {
            throw new AllinPayException("实名付结果查询失败:原流水号不能为空");
        }

        aipgReq.addTrx(rnpr);

        xml = XmlTools.buildXml(aipgReq, true);
        String resp = AllinPayUtil.sendToTlt(xml, false);
        AipgRsp aipgRsp = AllinPayUtil.handleResult(TransCode.BIND_CARD_QUERY.code, resp);
        return aipgRsp;
    }

    @Override
    public AipgRsp recharge(Trans trans,String reqSN) {
        return transCash(TransCode.TRANS_RECHARGE.code, "19900", trans,reqSN);
    }

    @Override
    public AipgRsp deposit(Trans trans,String reqSN) {
        return transCash(TransCode.TRANS_DEPOSIT.code, "09900", trans,reqSN);
    }

    /**
     * 充值,提现通用方法
     * busicode值需要确认
     *
     * @param trans
     * @return
     */
    private AipgRsp transCash(String trxCode, String busicode, Trans trans,String reqSN) {
        String xml = "";
        AipgReq aipg = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(trxCode,reqSN);
        aipg.setINFO(info);

        if (StringUtils.isBlank(busicode)) {
            throw new AllinPayException("业务代码不能为空")
                    .set("trxCode", trxCode)
                    ;
        }

        if (StringUtils.isBlank(trans.getACCOUNT_NAME())) {
            throw new AllinPayException("持卡人不能为空")
                    .set("trxCode", trxCode)
                    ;
        }

        if (StringUtils.isBlank(trans.getACCOUNT_NO())) {
            throw new AllinPayException("银行卡号不能为空")
                    .set("trxCode", trxCode)
                    ;
        }

        if (!NumberUtils.isNumber(trans.getAMOUNT())) {
            throw new AllinPayException("金额无效")
                    .set("trxCode", trxCode)
                    ;
        }

        if (StringUtils.isBlank(trans.getTEL())) {
            throw new AllinPayException("手机号不能为空");
        }

        if (StringUtils.isBlank(trans.getID_TYPE())) {
            throw new AllinPayException("请设置证件类型");
        }

        if (StringUtils.isBlank(trans.getID())) {
            throw new AllinPayException("请设置证件号")
                    ;
        }

        if (StringUtils.isBlank(trans.getACCOUNT_PROP())) {
            trans.setACCOUNT_PROP("0");
        }

        trans.setBUSINESS_CODE(busicode);
        trans.setMERCHANT_ID(tranxContext.getMerchantId());
        trans.setSUBMIT_TIME(AllinPayUtil.getDateString());
        trans.setCURRENCY("CNY");
        aipg.addTrx(trans);
        xml = XmlTools.buildXml(aipg, true);
        String s = AllinPayUtil.sendToTlt(xml, false);
        return AllinPayUtil.handleResult(trxCode, s);
    }

    @Override
    public AipgRsp queryTrans(TransQueryReq transQueryReq) {
        AipgReq aipgReq = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.TRANS_QUERY.code);
        aipgReq.setINFO(info);

        aipgReq.addTrx(transQueryReq);
        transQueryReq.setMERCHANT_ID(tranxContext.getMerchantId());

        // 交易状态条件, 0成功,1失败, 2全部,3退票
        //  如果开始时间和结束时间不为空，该字段生效，不可为空
//        transQueryReq.setSTATUS(1);

        // 0.按完成日期1.按提交日期，默认为1
//        transQueryReq.setTYPE(1);
        if (StringUtils.isBlank(transQueryReq.getQUERY_SN())) {
            transQueryReq.setSTART_DAY(transQueryReq.getSTART_DAY());
            transQueryReq.setEND_DAY(transQueryReq.getEND_DAY());
        } else {
            //transQueryReq.setQUERY_SN(transQueryReq.getQUERY_SN());
        }
        String xml = XmlTools.buildXml(aipgReq, true);
        String s = AllinPayUtil.sendToTlt(xml, false);
        return AllinPayUtil.handleResult(TransCode.TRANS_QUERY.code, s);


/*
        String xml="";
        AipgReq aipgReq=new AipgReq();


        dr.setQUERY_SN(reqsn);
        dr.setSTATUS(1);
        dr.setTYPE(1) ;
//		dr.setSTATUS(2);
        if(reqsn==null||"".equals(reqsn)){
            dr.setSTART_DAY(startDate);
            dr.setEND_DAY(endDate);
        }
        xml=XmlTools.buildXml(aipgReq,true);
        dealRet(sendToTlt(xml,isTLTFront,url));

        */
    }


    @Override
    public AipgRsp merAcctBalance(AHQueryReq ahquery) {
        AipgReq aipg = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.ACCOUNT_BALANCE_QUERY.code);//交易码
        aipg.setINFO(info);

        ahquery.setACCTNO(tranxContext.getAllinpayUserName());//商户在通联的虚拟账号
        if (StringUtils.isBlank(ahquery.getSTARTDAY())) {
            throw new AllinPayException("历史余额查询失败:开始日期不能为空");
        }

        if (StringUtils.isBlank(ahquery.getENDDAY())) {
            throw new AllinPayException("历史余额查询失败:结束日期不能为空");
        }

        aipg.addTrx(ahquery);
        String xml = XmlTools.buildXml(aipg, true);
        String s = AllinPayUtil.sendToTlt(xml, false);
        return AllinPayUtil.handleResult(TransCode.ACCOUNT_BALANCE_QUERY.code, s);
    }

    @Override
    public AipgRsp queryAccount(AcQueryReq acQueryReq) {
        AipgReq aipg = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.ACCOUNT_QUERY.code);//交易码
        aipg.setINFO(info);

        if (acQueryReq != null && StringUtils.isNotBlank(acQueryReq.getACCTNO())) {
            aipg.addTrx(acQueryReq);
        }

        String xml = XmlTools.buildXml(aipg, true);
        String s = AllinPayUtil.sendToTlt(xml, false);
        return AllinPayUtil.handleResult(TransCode.ACCOUNT_QUERY.code, s);
    }

    @Override
    public AipgRsp unBindCard(SCloseReq closeReq) {

        AipgReq aipg = new AipgReq();
        InfoReq info = AllinPayUtil.makeReq(TransCode.UNBIND_CARD.code);//交易码
        aipg.setINFO(info);

        closeReq.setMERCHANT_ID(tranxContext.getMerchantId());


        if (StringUtils.isBlank(closeReq.getACCT())) {// 账号
            throw new AllinPayException("签约解除失败:账号不能为空");
        }

        if (StringUtils.isBlank(closeReq.getMEMID())) {// 商户客户ID
            throw new AllinPayException("签约解除失败:商户客户ID不能为空");
        }

        if (StringUtils.isBlank(closeReq.getAGREEMENTNO())) {// 协议号
            throw new AllinPayException("签约解除失败:协议号不能为空");
        }

        String xml = XmlTools.buildXml(aipg, true);
        String s = AllinPayUtil.sendToTlt(xml, false);
        return AllinPayUtil.handleResult(TransCode.ACCOUNT_QUERY.code, s);
    }
}
