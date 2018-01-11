package com.allin.mtp.util;

import com.allin.mtp.constant.Const;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author xishengchun on 2017-09-24.
 */
public class AllinMTPUtil {

    private static Logger logger = Logger.getLogger(AllinMTPUtil.class);

    public static String postFor(String value) throws IOException {
        List<NameValuePair> paramList = new ArrayList<>();
        paramList.add(new BasicNameValuePair("msgPlain", value));
        System.out.println("requestXML:" + value);

        // 新建http请求
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(AllinMTPConfig.getSubmitUrl());

        httpPost.setEntity(new UrlEncodedFormEntity(paramList, Const.UTF8));
        HttpResponse response = httpClient.execute(httpPost);
        System.out.println("response ==" + response);
        HttpEntity entity = response.getEntity();

        String resultHtml = EntityUtils.toString(entity, "UTF-8");
        return resultHtml;
    }



    public static String getReqTraceNum() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return df.format(new Date());
    }

    public static Date getBeginOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getEndOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 返回时间
     *
     * @return
     */
    public static String getDateString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(new Date());
    }

    public static String getDateString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(date);
    }

    /**
     * 返回时间
     *
     * @return
     */
    public static String getTimeString() {
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        return df.format(new Date());
    }

    /**
     * 生成批次号
     * @param num
     * 大于0,小于100
     * @return
     */
    public static String getBatchNo(int num) {
        String dateString = getDateString();
        String strNum = "";
        if (num < 10) {
            strNum = "0" + num;
        } else {
            strNum = String.valueOf(num);
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("O_D_")
                .append(dateString)
                .append("_")
                .append(strNum)
                .append("_")
                .append(AllinMTPConfig.getInstId())
                .append("_ST")
        ;

        return buffer.toString();
    }

    /**
     * 生成批量还款的行
     * @return
     */
    public static String appendForRepayment() {

        return "";
    }

    /**
     * 解析批量回盘的文件行
     * @return
     */
    public static String parseForRepayment() {

        return "";
    }


}
