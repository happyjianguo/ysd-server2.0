package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 取现
 * 
 * @author Administrator
 * 
 */
public class CreateRequestCashDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initCashReportDemo();

        String msg = ReportDemo.encryptionCashDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrQuxianCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
