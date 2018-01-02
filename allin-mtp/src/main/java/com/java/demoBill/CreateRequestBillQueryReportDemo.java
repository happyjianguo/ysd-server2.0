package com.java.demoBill;


import com.mind.platform.system.base.DataRow;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.nio.charset.Charset;

public class CreateRequestBillQueryReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initBillQueryReportDemo();
		
		String msg = ReportDemo.encryptionBillQueryDemo(requestDataRowDto);

        HttpPost httpPost = new HttpPost("http://116.228.64.55:28082/AppStsWeb/service/acquireAction.action");
        StringEntity stringEntity = new StringEntity(msg, Charset.forName("utf-8"));
        httpPost.setEntity(stringEntity);

        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpResponse response = httpClient.execute(httpPost);
            String s = response.toString();
            System.out.println("s:" + s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataRow agreementsignDaterow = ReportDemo.decryptionBillQueryDemo(msg);
//		DataRow agreementsignDaterow1 = ReportDemo.decryptionBillQueryDemo(msg);
//		System.out.println(agreementsignDaterow);
	}
	
}
