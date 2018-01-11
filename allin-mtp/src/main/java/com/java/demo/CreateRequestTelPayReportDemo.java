package com.java.demo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestTelPayReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initTelPayReportDemo();
		
		String msg = ReportDemo.encryptionTelPayDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionTelPayDemo(msg);
		System.out.println(agreementsignDaterow);

	}
	
}
