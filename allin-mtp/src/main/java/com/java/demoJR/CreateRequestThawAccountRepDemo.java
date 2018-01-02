package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 解冻
 * 
 * @author Administrator
 * 
 */
public class CreateRequestThawAccountRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initThawAccountReportDemo();

        String msg = ReportDemo.encryptionAccountChangeDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrZhanghubiangengCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
