package com.java.demo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestSalesReturnReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initSalesReturnReportDemo();
		
		String msg = ReportDemo.encryptionSalesReturnDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionSalesReturnDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
