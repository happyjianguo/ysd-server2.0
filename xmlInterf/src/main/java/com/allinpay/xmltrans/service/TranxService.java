package com.allinpay.xmltrans.service;

import com.aipg.acquery.AcQueryReq;
import com.aipg.ahquery.AHQueryReq;
import com.aipg.common.AipgRsp;
import com.aipg.rnp.Rnpa;
import com.aipg.rnp.Rnpc;
import com.aipg.rnp.Rnpr;
import com.aipg.rtreq.Trans;
import com.aipg.synreq.SCloseReq;
import com.aipg.transquery.TransQueryReq;

/**
 * @author xishengchun on 2017-09-24.
 *         通联接口封装
 */
public interface TranxService {

    /**
     * 实名付申请
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail761.html
     * @param rnpa
     * @return
     *  对象中的reqSN 注意:请求中的REQ_SN,实名付确认(包括重发)的的时候会使用REQ_SN
     */
    AipgRsp bindCard(Rnpa rnpa);

    /**
     * 实名付确认。
     * 即:发送短信
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail775.html
     * @param rnpc
     * @return
     */
    AipgRsp confirmSmsForBindCard(Rnpc rnpc);

    /**
     * 实名付确认。
     * 即:发送短信重发
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail774.html
     * @param rnpr
     * @return
     */
    AipgRsp repeatSmsForBindCard(Rnpr rnpr);

    /**
     * 实名付申请结果查询
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail776.html
     * @param rnpr
     * @return
     */
    AipgRsp queryBindCard(Rnpr rnpr);


    /**
     * 充值,实时单笔代收
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail742.html
     * @param trans
     * @return
     */
    AipgRsp recharge(Trans trans,String reqSN);

    /**
     * 提现,实时单笔代付
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail743.html
     * @param trans
     * @return
     */
    AipgRsp deposit(Trans trans,String reqSN);

    /**
     * 批量代收批量代付单笔实时代收付均适用, 该接口只返回处理完毕的交易记录，不返回处理中的记录
     * 2.可以按照时间段查询
     * TransQueryReq.QUERY_SN:按照原流水号查询
     * TransQueryReq.START_DAY,END_DAY:按照时间段查询,若不填QUERY_SN则必填,日期格式:YYYYMMDDHHmmss
     * TransQueryReq.STATUS:交易状态条件, 0成功,1失败, 2全部,3退票; 如果开始时间和结束时间不为空，该字段生效，不可为空
     * TransQueryReq.TYPE:0.按完成日期1.按提交日期，默认为1;如果使用0查询，未完成交易将查不到
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail134.html
     * @return
     */
    AipgRsp queryTrans(TransQueryReq transQueryReq);

    /**
     * 查询商户在通联的虚拟账户的历史余额信息，一般用于查询虚拟账户余额，也就是余额查询接口
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail152.html
     * @param ahQueryReq
     * STARTDAY:yyyyMMdd
     * ENDDAY:yyyyMMdd
     * @return
     */
    AipgRsp merAcctBalance(AHQueryReq ahQueryReq);

    /**
     * 账户信息查询
     * @param acQueryReq
     * 接口说明:
     * http://113.108.182.3:8282/techsp/helper/filedetail/tlt/filedetail151.html
     * @return
     */
    AipgRsp queryAccount(AcQueryReq acQueryReq );

    /**
     * 解绑卡
     * @param closeReq
     * @return
     */
    AipgRsp unBindCard(SCloseReq closeReq);



}
