package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestReverseTransactionReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initReverseTransactionReportDemo();
		
		String msg = ReportDemo.encryptionReverseTransactionDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionReverseTransactionDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
