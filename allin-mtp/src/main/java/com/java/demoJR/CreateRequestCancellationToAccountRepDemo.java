package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 撤销 到户
 * 
 * @author Administrator
 * 
 */
public class CreateRequestCancellationToAccountRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initCancellationToAccountReportDemo();

        String msg = ReportDemo.encryptionCancellationDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrCexiaoCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
