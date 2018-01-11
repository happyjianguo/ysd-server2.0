package com.java.b2cdemo;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

public class ReportDemo {
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initAgreementSignReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","01");
		RequestListRow.put("acct_num","9555500210021111");
		RequestListRow.put("hld_name","张三");
		RequestListRow.put("cer_type","01");
		RequestListRow.put("cer_num","311501197703030315");
		RequestListRow.put("tel_num","1313131313");
		RequestListRow.put("reqs_url", "");
		RequestListRow.put("resp_url", "");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initAgreementCancelSignReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","");
		RequestListRow.put("acct_num","9555500210021111 ");
		RequestListRow.put("sign_num","1313131313");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initForwardTransactionReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("product_num","03020000");
		RequestListRow.put("bnk_id","9555500210021111 ");
		RequestListRow.put("acct_type","");
		RequestListRow.put("sign_num","123123123123");
		RequestListRow.put("acct_num","01");
		RequestListRow.put("cur_type","156");
		RequestListRow.put("amt_tran","300");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initForwardTGTransactionReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("product_num","03020000");
		RequestListRow.put("bnk_id","9555500210021111 ");
		RequestListRow.put("acct_type","");
		RequestListRow.put("sign_num","123123123123");
		RequestListRow.put("acct_num","01");
		RequestListRow.put("cur_type","156");
		RequestListRow.put("amt_tran","300");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initReverseTransactionReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("product_num","01");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","");
		RequestListRow.put("acct_num","9555500210021111 ");
		RequestListRow.put("sign_num","123123123123");
		RequestListRow.put("org_req_trace_num","156");
		RequestListRow.put("org_trans_date","300");
		RequestListRow.put("cur_type","200");
		RequestListRow.put("amt_tran","");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initQueryTransactionReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("org_req_trace_num","03020000");
		RequestListRow.put("org_order_num","9555500210021111 ");
		RequestListRow.put("org_trans_date","20121028192234");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initFileNoticeReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("brk_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("bus_num", "0000");
		RequestListRow.put("brk_trace_num","20121028103029123456");
		RequestListRow.put("org_trace_num","0000");
		RequestListRow.put("date_settlmt","03020000");
		RequestListRow.put("addtnl_data","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("response",RequestListRow);
		
		return TransactionDataRow;
	}
	
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionAgreementSignDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestAgreementSignCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionAgreementSignDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseAgreementSignCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionAgreementCancelSignDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestAgreementCancelSignCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}

	public static String encryptionMsgVerifyDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestMsgVerifyCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionAgreementCancelSignDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseAgreementCancelSignCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionForwardTransactionDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestForwardTransactionCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionForwardTransactionDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseForwardTransactionCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionForwardTGTransactionDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestForwardTransactionTGCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionForwardTGTransactionDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseForwardTransactionTGCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionReverseTransactionDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestReverseTransactionCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionReverseTransactionDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseReverseTransactionCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionQueryTransactionDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestQueryTransactionCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionQueryTransactionDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseQueryTransactionCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionFileNoticeDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramB2cUtil.createRequestFileNoticeCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionFileNoticeDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramB2cUtil.parseResponseFileNoticeCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	
	
}
