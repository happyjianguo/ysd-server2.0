package com.java.demoBatch;

import encryption.STSTxData;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BatchReversetQueryDemo
{
    public static void main(String args[]) throws ClientProtocolException, IOException
    {
        String instId = "70000001";
        String bizType = "LC";
        String batchNo = "O_D_20141023_05_70000001_NT";
        String uploadDate = "20141023";
        String url = "http://192.168.1.63:8180/AppStsWeb/service/batchReverseTxQuery.action";
        String sign_code = instId + bizType + batchNo;
        /* 验签 */
        sign_code = STSTxData.signMsgPriKey(sign_code, STSTxData.getPrivateKeyB2c());
        System.out.println("加签数据:\n" + sign_code + "\n");

        List<NameValuePair> paramList = new ArrayList<NameValuePair>();
        paramList.add(new BasicNameValuePair("inst_id", instId));
        paramList.add(new BasicNameValuePair("bus_code", bizType));
        paramList.add(new BasicNameValuePair("batch_no", batchNo));
        paramList.add(new BasicNameValuePair("trans_date", uploadDate));
        paramList.add(new BasicNameValuePair("sign_code", sign_code));

        // 新建http请求
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new UrlEncodedFormEntity(paramList, Consts.UTF_8));
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity entity = response.getEntity();
        entity.getContent();
        String resultHtml = EntityUtils.toString(entity, "UTF-8");
        System.out.println("查询返回的状态:\n" + resultHtml);
        boolean check = true;
        // 判断是查询到结果
        int firstIndex = resultHtml.indexOf("\n");
        if (firstIndex < 0)
        {
            check = false;
            System.out.println(resultHtml);
        }
        // 如果查询成功，进行下一步拆分、验签
        if (check)
        {
            String firstLine = resultHtml.substring(0, firstIndex);
            String respCode = firstLine.substring(0, 4);
            String signCode = firstLine.substring(resultHtml.indexOf("|"));// 签名
            String detailMsg = resultHtml.substring(firstIndex);// 明文

            boolean flag = false;
            /** 验签 */
            try
            {
                if ("0000".equals(respCode) && signCode.trim().equals(""))
                {
                    flag = STSTxData.veriSign(signCode, detailMsg);
                    System.out.println("验签：" + flag);
                    if (!flag)
                    {
                        // 写回JSP界面
                        // resp.getWriter().write(("验签不通过!\n" +
                        // detailMsg).getBytes("utf-8"));
                        System.out.println("结果：\n" + "验签不通过!\n" + detailMsg);
                    }
                }
                // 写回JSP界面
                System.out.println("结果：\n" + respCode + "|交易成功\n" + detailMsg.trim());
            }
            catch (Exception e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
