package com.java.demo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestB2cPayReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initB2cPayReportDemo();
		
		String msg = ReportDemo.encryptionB2cPayDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionB2cPayDemo(msg);
		System.out.println(agreementsignDaterow);

	}
	
}
