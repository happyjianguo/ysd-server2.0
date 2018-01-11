package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 换手机号
 * 
 * @author Administrator
 * 
 */
public class CreateRequestChangePhoneRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initChangePhoneReportDemo();

        String msg = ReportDemo.encryptionChangePhoneDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrHuanshoujiCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
