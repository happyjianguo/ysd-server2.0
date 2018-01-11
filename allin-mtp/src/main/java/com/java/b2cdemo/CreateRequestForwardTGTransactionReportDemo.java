package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestForwardTGTransactionReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initForwardTransactionReportDemo();
		
		String msg = ReportDemo.encryptionForwardTGTransactionDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionForwardTGTransactionDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
