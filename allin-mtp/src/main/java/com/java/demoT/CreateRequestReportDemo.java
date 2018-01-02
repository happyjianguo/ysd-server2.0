/**
 * 
 * 组装报文，签名，加密DEMO
 * @author leo.xu
 */
package com.java.demoT;

import com.mind.platform.system.base.DataRow;

public class CreateRequestReportDemo {
	
	public static void main(String[] args) {
		
		// 初始化请求报文数据
		DataRow requestDataRowDto = ReportDemo.initReportDemo();
		
		// 签名加密的请求报文requestReport
		System.out.println(ReportDemo.encryptionDemo(requestDataRowDto));
	}

}
