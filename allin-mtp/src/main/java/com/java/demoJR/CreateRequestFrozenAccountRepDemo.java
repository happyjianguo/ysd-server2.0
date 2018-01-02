package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 冻结
 * 
 * @author Administrator
 * 
 */
public class CreateRequestFrozenAccountRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initFrozenAccountReportDemo();

        String msg = ReportDemo.encryptionAccountChangeDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrZhanghubiangengCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
