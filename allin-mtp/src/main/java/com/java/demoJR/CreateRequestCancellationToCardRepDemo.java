package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 撤销 card
 * 
 * @author Administrator
 * 
 */
public class CreateRequestCancellationToCardRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initCancellationToCardReportDemo();

        String msg = ReportDemo.encryptionCancellationDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrCexiaoCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }
}
