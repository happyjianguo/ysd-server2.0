package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

public class CreateRequestSingRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initSingReportDemo();

        String msg = ReportDemo.encryptionSingDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrQianyueCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
