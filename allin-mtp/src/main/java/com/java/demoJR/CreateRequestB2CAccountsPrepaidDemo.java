package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 充值B2C
 * 
 * @author Administrator
 * 
 */
public class CreateRequestB2CAccountsPrepaidDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initB2CAccountsPrepaidReportDemo();

        String msg = ReportDemo.encryptionAccountsPrepaidDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrChongzhiCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
