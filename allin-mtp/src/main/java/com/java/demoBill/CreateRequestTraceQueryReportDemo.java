package com.java.demoBill;


import com.mind.platform.system.base.DataRow;

public class CreateRequestTraceQueryReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initTraceQueryReportDemo();
		
		String msg = ReportDemo.encryptionTraceQueryDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionTraceQueryDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}
