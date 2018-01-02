package com.java.demoJR;

/**
 * 托管赎回
 * 
 * @author Administrator
 * 
 */
public class BatchRedemptionDemo
{
    public static void main(String[] agrs)
    {
        try
        {
            byte[] by = BatchUtil.singmsg("70000001", "123321", "20150331", "1000", "2", "2", "",
                    "O_D_20150331_00_70000001_ST",
                    "http://127.0.0.1:8080/AppStsWeb/service/redemptionTxFileUpload.action",
                    "C:\\Users\\Administrator\\Desktop\\O_D_20150331_00_70000001_ST.txt",
                    "O_D_20150331_00_70000001_ST.txt");

            String outmsg = new String(by, "UTF-8");

            System.out.println("resp:" + outmsg);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
