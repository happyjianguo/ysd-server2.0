package com.allin.mtp.service;

import com.allin.mtp.model.*;

import java.util.List;

/**
 * @author xishengchun on 2017-09-24.
 *         通联接口封装
 */
public interface MTPTranxService {

    /**
     * 快捷签约
     * @param request
     * @return
     * @throws Exception
     */
    JrQianyueResponse bindCard(JrQianyueRequest request) throws Exception;


    /**
     * 快捷签约的短信上送
     * @param msgVerifyRequest
     * @return
     * @throws Exception
     */
    MsgVerifyResponse sendSmsForBindCard(MsgVerifyRequest msgVerifyRequest) throws Exception;

    /**
     * 购买申请
     */
    BuyProductResponse buyProduct(BuyProductRequest buyProductRequest) throws Exception;

    /**
     * 解析异步通知
     * @param resultXML
     * @return
     * @throws Exception
     */
    BuyProductResponse notifyBuyProduct(String resultXML) throws Exception;


    /**
     *
     * 批量还款.相当于提现
     * @param summaryRepayment
     * 批量文件的汇总信息
     * 需要上传的批量文件路径
     * @return
     * true:成功
     * false:失败
     */
    boolean batchRepayment(SummaryRepayment summaryRepayment) throws Exception;

    /**
     * 下载还款文件
     * @return
     * @throws Exception
     */
    boolean downloadRepayment(String transDate, String batchNo) throws Exception;

}
