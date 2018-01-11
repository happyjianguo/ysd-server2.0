package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestAgreementCancelSignReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initAgreementCancelSignReportDemo();
		
		String msg = ReportDemo.encryptionAgreementCancelSignDemo(requestDataRowDto);
		
		DataRow agreementsignDaterow = ReportDemo.decryptionAgreementCancelSignDemo(msg);
		DataRow agreementsignDaterow1 = ReportDemo.decryptionAgreementCancelSignDemo(msg);
		System.out.println(agreementsignDaterow);

	}
	
}
