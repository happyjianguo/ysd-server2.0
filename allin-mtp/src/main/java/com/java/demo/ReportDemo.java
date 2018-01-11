package com.java.demo;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryptionWZT.DataGramUtil;

public class ReportDemo {
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initB2cPayReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "5000");
		HeadListRow.put("mchnt_id", "1000000000000001");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("bus_num", "0000");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("order_num","20121028103029123456");
		RequestListRow.put("bus_num","1001");
		RequestListRow.put("cur_type","100");
		RequestListRow.put("amt_tran","156");
		RequestListRow.put("reqs_url","");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","01");
		RequestListRow.put("addtnl_data2","311501197703030315");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initTelPayReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("mchnt_id", "88880000");
		HeadListRow.put("mchnt_trans_date", "20121028");
		HeadListRow.put("mchnt_trans_time", "103029");
		HeadListRow.put("version_num", "1.0");
		RequestListRow.put("mchnt_order_num","20121028103029123456");
		RequestListRow.put("mchnt_trace_num","20121028103029123456");
		RequestListRow.put("amt_tran","03020000");
		RequestListRow.put("cur_type","156 ");
		RequestListRow.put("web_url","");
		RequestListRow.put("resp_url","");
		RequestListRow.put("addtnl_data1","01");
		RequestListRow.put("addtnl_data2","311501197703030315");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initSalesReturnReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("mchnt_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("bus_num", "0002");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("mchnt_trace_num","20121028103029123456");
		RequestListRow.put("org_mchnt_trace_num","20121028103029123456");
		RequestListRow.put("org_mchnt_order_num","20121028103029123456");
		RequestListRow.put("org_trans_date","20121028103029123456 ");
		RequestListRow.put("cur_type","20121028");
		RequestListRow.put("amt_tran","103029");
		RequestListRow.put("resp_url","20121028");
		RequestListRow.put("addtnl_data1","100");
		RequestListRow.put("addtnl_data2","100");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initMarginPayQueryReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("mchnt_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("bus_num", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("mchnt_trace_num","20121028103029123456");
		RequestListRow.put("org_mchnt_trace_num","20121028103029123456");
		RequestListRow.put("org_mchnt_order_num","20121028103029123456");
		RequestListRow.put("org_trans_date","20121028");
		RequestListRow.put("addtnl_data1","103029");
		RequestListRow.put("addtnl_data2","123123123123");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	

	
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionB2cPayDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestB2cPayCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionB2cPayDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseB2cPayCryptoMsg(decryMsg);
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
	public static String encryptionTelPayDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestTelPayCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionTelPayDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseTelPayCryptoMsg(decryMsg);
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
	public static String encryptionSalesReturnDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestSalesReturnCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionSalesReturnDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseSalesReturnCryptoMsg(decryMsg);
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
	public static String encryptionMarginPayQueryDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestMarginPayQueryCryptoMsg(requestDataRowDto);
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
	public static DataRow decryptionMarginPayQueryDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseResponseMarginPayQueryCryptoMsg(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	

	
	
}
