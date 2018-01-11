package com.java.demoJR;

import encryption.STSTxData;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;

import java.io.*;

public class BatchUtil
{
    public static byte[] singmsg(String instId, String productNum, String tradeDate, String totalAmount,
            String totalCount, String totalUnits, String totalDiscount, String batchNo, String url, String filePath,
            String fileName)
    {
        BufferedReader bf = null;
        PostMethod filePost = null;
        byte[] resinfo = null;
        StringWriter writer = null;
        InputStreamReader reader = null;
        try
        {
            // String[] s = fileName.split("\\.");

            writer = new StringWriter();

            File targetFile = new File(filePath);

            bf = new BufferedReader(new FileReader(targetFile));
            reader = new InputStreamReader(new FileInputStream(targetFile), "UTF-8");
            char[] buffer = new char[4096];
            int n = 0;
            while (-1 != (n = reader.read(buffer)))
            {
                writer.write(buffer, 0, n);
            }

            String fileContent = writer.toString();
            String signedMsg = STSTxData.signMsgPriKey(fileContent, STSTxData.getPrivateKeyB2c());
            System.out.println(signedMsg);
            String paras = "inst_id=" + instId + "&product_num=" + productNum + "&trans_date=" + tradeDate
                    + "&total_amount=" + totalAmount + "&total_count=" + totalCount + "&total_units=" + totalUnits
                    + "total_discount" + totalDiscount + "&batch_no=" + batchNo;
            try
            {
                filePost = new PostMethod(url);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            filePost.setQueryString(paras);
            Part[] parts = { new FilePart("upload_file", targetFile), new StringPart("sign_code", signedMsg) };
            filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));

            HttpClient client = new HttpClient();
            client.getHttpConnectionManager().getParams().setConnectionTimeout(50000);
            int status = client.executeMethod(filePost);

            if (status == HttpStatus.SC_OK)
            {
                resinfo = filePost.getResponseBody();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (bf != null)
            {
                try
                {
                    bf.close();
                    if (filePost != null) filePost.releaseConnection();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                if (filePost != null)
                {
                    filePost.releaseConnection();
                }
            }

            if (reader != null) try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        return resinfo;
    }

    private static String getFileName(String fullFileName)
    {
        return fullFileName.substring(fullFileName.lastIndexOf("\\") + 1);
    }

}
