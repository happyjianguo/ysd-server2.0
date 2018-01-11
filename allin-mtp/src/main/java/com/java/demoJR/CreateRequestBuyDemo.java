package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 直接投标
 * 
 * @author Administrator
 * 
 */
public class CreateRequestBuyDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initBuyReportDemo();

        String msg = ReportDemo.encryptionAccountBuyDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrToubiaoCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
