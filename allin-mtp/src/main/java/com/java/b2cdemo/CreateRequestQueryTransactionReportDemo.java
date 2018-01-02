package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestQueryTransactionReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initQueryTransactionReportDemo();
		
		String msg = ReportDemo.encryptionQueryTransactionDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionQueryTransactionDemo(msg);
		System.out.println(agreementsignDaterow);

	}
	
}
