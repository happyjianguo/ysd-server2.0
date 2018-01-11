package com.java.demoBatch;

public class BatchMistakeDemo
{
	public static void main(String[] agrs) 
	{
		try
		{
			byte[] by = BatchUtil
			.singmsg(
					"LC",
					"70000001",
					"20141028",
					"2000",
					"2",
					"O_D_20141028_28_70000001_CT",
					"http://192.168.1.63:8180/AppStsWeb/service/mismatchedTxFileUpload.action",
					"C:\\Users\\yanyang\\Desktop\\O_D_20141028_28_70000001_CT.txt",
					"O_D_20141028_28_70000001_CT.txt");
	
			String outmsg = new String(by, "UTF-8");
			
			System.out.println("resp:"+outmsg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
