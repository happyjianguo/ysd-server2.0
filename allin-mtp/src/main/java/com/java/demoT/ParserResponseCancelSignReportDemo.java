/**
 * 报文解密，验签，解析处理DEMO
 * @author leo.xu
 */
package com.java.demoT;

import com.mind.platform.system.base.DataRow;

public class ParserResponseCancelSignReportDemo {
	
	public static void main(String[] args) {
		
		//初始化需要签名加密的报文数据，以DataRow方式返回
		DataRow requestDataRowDto = ReportDemo.initCancelSignReportDemo();
		
		//进行报文的组装，签名，加密处理，返回密文requestXml
		String requestXml = ReportDemo.encryptionCancelSignDemo(requestDataRowDto);
		
		/*
		 * 报文解密，验签，解析处理
		 * 
		 * 生成DataRow为解析出信息的包装类
		 */
		DataRow row = ReportDemo.decryptionCancelSignDemo(requestXml);
		

	}

}
