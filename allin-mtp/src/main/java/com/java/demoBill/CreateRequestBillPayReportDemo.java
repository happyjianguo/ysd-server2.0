package com.java.demoBill;


import com.mind.platform.system.base.DataRow;

public class CreateRequestBillPayReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initBillPayReportDemo();
		
		String msg = ReportDemo.encryptionBillPayDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionBillPayDemo(msg);
		System.out.println(agreementsignDaterow);

	}
	
}
