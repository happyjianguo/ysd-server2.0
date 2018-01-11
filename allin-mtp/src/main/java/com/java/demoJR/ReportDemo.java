package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

public class ReportDemo
{
    /**
     * 开户
     * 
     * @return
     */
    public static DataRow initSingReportDemo()
    {
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        headListRow.put("processing_code", "1080");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "170000");
        headListRow.put("ver_num", "1.00");
        // REQUEST
        requestListRow.put("req_trace_num", "1000011001");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("hld_name", "kitty");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("cer_type", "01");
        requestListRow.put("cer_num", "362430199005213333");
        requestListRow.put("reqs_url", "123");
        requestListRow.put("resp_url", "123");
        requestListRow.put("addtnl_data1", "addtnl_data1");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 开户
     * 
     * @return
     */
    public static DataRow initB2CSingReportDemo()
    {
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        headListRow.put("processing_code", "1081");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "170000");
        headListRow.put("ver_num", "1.00");
        // REQUEST
        requestListRow.put("req_trace_num", "1000011001");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("hld_name", "kitty");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("cer_type", "01");
        requestListRow.put("cer_num", "362430199005213333");
        requestListRow.put("reqs_url", "123");
        requestListRow.put("resp_url", "123");
        requestListRow.put("addtnl_data1", "addtnl_data1");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 换卡
     * 
     * @return
     */
    public static DataRow initChangeCardReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1082");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150328");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");
        // REQUEST
        requestListRow.put("req_trace_num", "201503280001");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("hld_name", "0000");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("cer_type", "01");
        requestListRow.put("cer_num", "320123198910022033");
        requestListRow.put("sign_num", "201503251420023178");
        requestListRow.put("org_bnk_id", "03040000");
        requestListRow.put("org_acct_type", "1");
        requestListRow.put("org_acct_num", "12345661345123465");
        requestListRow.put("org_tel_num", "13913913939");

        requestListRow.put("reqs_url", "");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "addtnl_data1");

        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 快捷换卡
     * 
     * @return
     */
    public static DataRow initB2CChangeCardReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1083");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150328");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");
        // REQUEST
        requestListRow.put("req_trace_num", "201503280001");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("hld_name", "0000");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("cer_type", "01");
        requestListRow.put("cer_num", "320123198910022033");
        requestListRow.put("sign_num", "201503251420023178");
        requestListRow.put("org_bnk_id", "03040000");
        requestListRow.put("org_acct_type", "1");
        requestListRow.put("org_acct_num", "12345661345123465");
        requestListRow.put("org_tel_num", "13913913939");

        requestListRow.put("reqs_url", "");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "addtnl_data1");

        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 换手机号
     * 
     * @return
     */
    public static DataRow initChangePhoneReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1090");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150328");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");
        // REQUEST
        requestListRow.put("req_trace_num", "1876210");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("tel_num", "13913913939");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("org_tel_num", "13913913939");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "");

        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 解冻
     * 
     * @return
     */
    public static DataRow initThawAccountReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1182");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150326");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "18761810");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "123");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 冻结
     * 
     * @return
     */
    public static DataRow initFrozenAccountReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1181");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150326");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "18761810");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "123");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 销户
     * 
     * @return
     */
    public static DataRow initCancellationAccountReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // String sendType = req.getParameter("sendType").toString();
        headListRow.put("processing_code", "1180");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150326");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "18761810");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "123");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 取现
     * 
     * @return
     */
    public static DataRow initCashReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2280");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150324");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "18761981");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("bnk_id", "00000000");
        requestListRow.put("cur_type", "1");
        requestListRow.put("acct_type", "123455612345612345");
        requestListRow.put("acct_num", "156");
        requestListRow.put("amt_tran", "156");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("resp_url", "");
        requestListRow.put("url", "18761851314");
        requestListRow.put("addtnl_data1", "112345");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        return transactionDataRow;
    }

    /**
     * 撤销 card
     * 
     * @return
     */
    public static DataRow initCancellationToCardReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2282");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "187618513");
        requestListRow.put("sign_num", "201503310914181550");
        requestListRow.put("org_req_trace_num", "201503310001001");
        requestListRow.put("org_trans_date", "20150331");
        requestListRow.put("org_product_num", "2015033100001");
        requestListRow.put("org_order_num", "456");
        requestListRow.put("trans_units", "156");
        requestListRow.put("cur_type", "10");
        requestListRow.put("amt_tran", "100");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "123456");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 撤销 到户
     * 
     * @return
     */
    public static DataRow initCancellationToAccountReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2281");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "187618513");
        requestListRow.put("sign_num", "201503310914181550");
        requestListRow.put("org_req_trace_num", "201503310001001");
        requestListRow.put("org_trans_date", "20150331");
        requestListRow.put("org_product_num", "2015033100001");
        requestListRow.put("org_order_num", "456");
        requestListRow.put("trans_units", "156");
        requestListRow.put("cur_type", "10");
        requestListRow.put("amt_tran", "100");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "123456");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 充值代扣
     * 
     * @return
     */
    public static DataRow initAccountsPrepaidReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2080");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150330");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "201503260110");
        requestListRow.put("sign_num", "201503301707059067");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("cur_type", "156");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123467");
        requestListRow.put("amt_tran", "10000");
        requestListRow.put("trace_fee", "11");
        requestListRow.put("tel_num", "13913913939");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 充值B2C
     * 
     * @return
     */
    public static DataRow initB2CAccountsPrepaidReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2081");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150330");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "201503260110");
        requestListRow.put("sign_num", "201503301707059067");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("cur_type", "156");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123467");
        requestListRow.put("amt_tran", "10000");
        requestListRow.put("trace_fee", "11");
        requestListRow.put("tel_num", "13913913939");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 账户投标
     * 
     * @return
     */
    public static DataRow initAccountBuyReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2082");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "201503300001001");
        requestListRow.put("sign_num", "201503310914181550");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("cur_type", "156");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("amt_tran", "1000");
        requestListRow.put("trace_fee", "1234");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("order_num", "2015032600002");
        requestListRow.put("product_num", "123321");
        requestListRow.put("trans_units", "100");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "12313123");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 直接投标
     * 
     * @return
     */
    public static DataRow initBuyReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "2083");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150331");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "201503300001001");
        requestListRow.put("sign_num", "201503310914181550");
        requestListRow.put("bnk_id", "03040000");
        requestListRow.put("cur_type", "156");
        requestListRow.put("acct_type", "1");
        requestListRow.put("acct_num", "12345661345123465");
        requestListRow.put("amt_tran", "1000");
        requestListRow.put("trace_fee", "1234");
        requestListRow.put("tel_num", "18761851314");
        requestListRow.put("order_num", "2015032600002");
        requestListRow.put("product_num", "123321");
        requestListRow.put("trans_units", "100");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "12313123");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 
     * 余额查询
     * 
     * @return
     */
    public static DataRow initBalanceQueryReportDemo()
    {
        // HEAD
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = new CMData(), requestListRow = new CMData();
        // 组装报文头部信息
        headListRow.put("processing_code", "3002");
        headListRow.put("inst_id", "70000001");
        headListRow.put("trans_date", "20150326");
        headListRow.put("trans_time", "094000");
        headListRow.put("ver_num", "1.00");

        requestListRow.put("req_trace_num", "18761810");
        requestListRow.put("sign_num", "201503201447153206");
        requestListRow.put("bnk_id", "18761810");
        requestListRow.put("acct_type", "156");
        requestListRow.put("acct_num", "18761810234562341234");
        requestListRow.put("tel_num", "18769876787");
        requestListRow.put("resp_url", "");
        requestListRow.put("addtnl_data1", "");
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);

        return transactionDataRow;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionSingDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrQianyueCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionChangeCardDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrHuankaCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 换手机
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionChangePhoneDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrHuanshoujiCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 解冻/销户、冻结
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionAccountChangeDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrZhanghubiangengCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 取现
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionCashDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrQuxianCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 撤销到卡、到账
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionCancellationDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrCexiaoCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 充值
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionAccountsPrepaidDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrQuxianCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 投标
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionAccountBuyDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrToubiaoCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }

    /**
     * 组装报文，签名，加密DEMO METHOD-- 资金查询
     * 
     * @param requestDataRowDto 请求报文初始化信息DTO
     * @return 签名加密的请求报文，返回requestReport
     * @throws HapException
     */
    public static String encryptionBalanceQueryDemo(DataRow requestDataRowDto) throws HapException
    {
        String requestReport = DataGramB2cUtil.createRequestJrYuechaxunCryptoMsg(requestDataRowDto);
        System.out.println(requestReport);
        return requestReport;
    }
}
