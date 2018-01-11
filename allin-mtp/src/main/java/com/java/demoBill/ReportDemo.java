package com.java.demoBill;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryptionWZTFive.DataGramUtil;

public class ReportDemo {
	
	/**
	 * 
	 * 账单查询
	 */
	public static DataRow initBillQueryReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","20121028103029123456");
		RequestListRow.put("bill_company_id","20121028103029123456");
		RequestListRow.put("bill_num","20121028");
		RequestListRow.put("bill_info","103029");
		RequestListRow.put("resp_url","123123123123");
		RequestListRow.put("addtnl_data1","20121028103029123456");
		RequestListRow.put("addtnl_data2","20121028103029123456");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 
	 * 账单支付
	 * 
	 */
	public static DataRow initBillPayReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","20121028103029123456");
		RequestListRow.put("acct_type","20121028103029123456");
		RequestListRow.put("acct_num","20121028");
		RequestListRow.put("bill_company_id","103029");
		RequestListRow.put("bill_num","123123123123");
		RequestListRow.put("bill_info","20121028103029123456");
		RequestListRow.put("cur_type","20121028103029123456");
		RequestListRow.put("amt_tran","20121028");
		RequestListRow.put("qur_brk_trace_num","103029");
		RequestListRow.put("qur_date","123123123123");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 
	 * 账单支付
	 * 
	 */
	public static DataRow initTraceQueryReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","20121028103029123456");
		RequestListRow.put("org_req_trace_num","20121028103029123456");
		RequestListRow.put("org_trans_date","20121028");
		RequestListRow.put("addtnl_data","103029");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	

	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionBillQueryDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestBillQueryCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionBillQueryDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseBillQueryCryptoMsg(decryMsg);
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
	public static String encryptionBillPayDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestBillPayCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionBillPayDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseBillPayCryptoMsg(decryMsg);
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
	public static String encryptionTraceQueryDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestTraceQueryCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionTraceQueryDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseTraceQueryCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	

	
	
}
