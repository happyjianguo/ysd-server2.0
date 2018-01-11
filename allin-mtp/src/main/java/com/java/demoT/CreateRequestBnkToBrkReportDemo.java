/**
 * 
 * 组装报文，签名，加密DEMO
 * @author leo.xu
 */
package com.java.demoT;

import com.mind.platform.system.base.DataRow;

public class CreateRequestBnkToBrkReportDemo {
	
	public static void main(String[] args) {
		
		// 初始化请求报文数据
		DataRow requestDataRowDto = ReportDemo.initBnkToBrkReportDemo();
		
		// 签名加密的请求报文requestReport
		ReportDemo.encryptionBnkToBrkDemo(requestDataRowDto);
	}

}
