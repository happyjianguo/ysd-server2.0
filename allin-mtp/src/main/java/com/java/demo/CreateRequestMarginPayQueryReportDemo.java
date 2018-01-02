package com.java.demo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestMarginPayQueryReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initMarginPayQueryReportDemo();
		
		String msg = ReportDemo.encryptionMarginPayQueryDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionMarginPayQueryDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
