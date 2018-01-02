package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestForwardTransactionReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initForwardTransactionReportDemo();
		
		String msg = ReportDemo.encryptionForwardTransactionDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionForwardTransactionDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
