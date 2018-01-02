/**
 * 模拟报文信息处理类
 * @author leo.xu
 */
package com.java.demoT;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import com.mind.platform.system.msg.msgformat.MsgFormat;
import com.mind.platform.system.msg.msgparsor.MsgParsor;
import encryption.DataGramSTSUtil;
import encryption.DataGramUtil;

public class ReportDemo {
	
	/**
	 * 初始化DEMO数据，报文信息范例
	 * @return DEMO数据，以DataRow方式返回
	 */
	public static DataRow initReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("bus_num","0001");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","01");
		RequestListRow.put("acct_num","9555500210021111");
		RequestListRow.put("hld_name","张三");
		RequestListRow.put("cer_type","01");
		RequestListRow.put("cer_num","1313131313");
		RequestListRow.put("tel_num","13916021155");
		RequestListRow.put("inst_acct_num","200");
		RequestListRow.put("reqs_url", "");
		RequestListRow.put("resp_url", "");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	public static DataRow initCancelSignReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "1.0");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("bus_num", "0000");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","01");
		RequestListRow.put("acct_num","9555500210021111");
		RequestListRow.put("inst_acct_num","1313131313");
		RequestListRow.put("resp_url","200");
		RequestListRow.put("addtnl_data1","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	public static DataRow initBnkToBrkReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("processing_code", "1020");
		HeadListRow.put("inst_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("ver_num", "0000");
		RequestListRow.put("req_trace_num","20121028103029123456");
		RequestListRow.put("brc_id","0000");
		RequestListRow.put("bus_num","9555500210021111");
		RequestListRow.put("bnk_id","03020000");
		RequestListRow.put("acct_type","1");
		RequestListRow.put("acct_num","9555500210021111");
		RequestListRow.put("inst_acct_num","1313131313");
		RequestListRow.put("cur_type","1");
		RequestListRow.put("amt_tran","200");
		RequestListRow.put("trace_fee","1");
		RequestListRow.put("resp_url","20121028192234");
		RequestListRow.put("addtnl_data","20121028192234");
		TransactionDataRow.put("head", HeadListRow);
		TransactionDataRow.put("request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	public static DataRow initBrkToBnkReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("Processing_code", "1020");
		HeadListRow.put("brk_id", "70020000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("Bus_num", "0000");
		RequestListRow.put("Brk_trace_num","20121028103029123456");
		RequestListRow.put("Brc_id","0000");
		RequestListRow.put("acct_num","9555500210021111");
		RequestListRow.put("Bnk_id","03020000");
		RequestListRow.put("Stock_num","1313131313");
		RequestListRow.put("Cur_type","01");
		RequestListRow.put("amt_tran","800.90");
		RequestListRow.put("Trace_fee","200");
		RequestListRow.put("Tun_num","201001010101101010");
		RequestListRow.put("addtnl_data","20121028192234");
		TransactionDataRow.put("Head", HeadListRow);
		TransactionDataRow.put("Request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	public static DataRow initQueryReportDemo(){
		
		DataRow TransactionDataRow = new CMData();
		DataRow HeadListRow = new CMData(), RequestListRow = new CMData();
		HeadListRow.put("Processing_code", "1020");
		HeadListRow.put("brk_id", "88880000");
		HeadListRow.put("trans_date", "20121028");
		HeadListRow.put("trans_time", "103029");
		HeadListRow.put("Bus_num", "0000");
		RequestListRow.put("Brk_trace_num","20121028103029123456");
		RequestListRow.put("Brc_id","0000");
		RequestListRow.put("Org_trace_num","22222222222222222222");
		RequestListRow.put("addtnl_data","20121028192234");
		TransactionDataRow.put("Head", HeadListRow);
		TransactionDataRow.put("Request",RequestListRow);
		
		return TransactionDataRow;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseRequestCryptoMsg2Object(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionCancelSignDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseRequestCancelSignCryptoMsg2Object(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionBnkToBrkDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseRequestBnkToBrkCryptoMsg2Object(decryMsg);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionBrkToBnkDemo(String decryMsg){
		DataRow sts = new CMData();
		MsgParsor aParsor = new MsgParsor();
		try {
			sts = DataGramSTSUtil.parseRequestCryptoMsg2Object(decryMsg, "BRKTOBNK", "0001", aParsor);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return sts;
	}
	
	/**
	 * 报文解密，验签，解析处理METHOD
	 * @param decryMsg 密文信息
	 * @return 生成DataRow为解析出信息的包装类
	 */
	public static DataRow decryptionQueryDemo(String decryMsg){
		DataRow sts = new CMData();
		try {
			sts = DataGramUtil.parseRequestQueryCryptoMsg2Object(decryMsg);
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
	public static String encryptionDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionCancelSignDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestCancelSignCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionBnkToBrkDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestBnkToBrkCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionBrkToBnkDemo(DataRow requestDataRowDto){
		String requestReport = null;
		MsgFormat aFormat = new MsgFormat();
		try {
			requestReport = DataGramSTSUtil.createReponseSTSCryptoMsg(requestDataRowDto, "BRKTOBNK", "0001", aFormat);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}
	
	/**
	 * 组装报文，签名，加密DEMO METHOD
	 * @param requestDataRowDto 请求报文初始化信息DTO
	 * @return 签名加密的请求报文，返回requestReport
	 */
	public static String encryptionQueryDemo(DataRow requestDataRowDto){
		String requestReport = null;
		try {
			requestReport = DataGramUtil.createRequestQueryCryptoMsg(requestDataRowDto);
			System.out.println(requestReport);
		} catch (HapException e) {
			e.printStackTrace();
		}
		return requestReport;
	}

}
