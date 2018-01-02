package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 余额查询
 * 
 * @author Administrator
 * 
 */
public class CreateRequestBalanceQueryDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initBalanceQueryReportDemo();

        String msg = ReportDemo.encryptionBalanceQueryDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrYuechaxunCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
