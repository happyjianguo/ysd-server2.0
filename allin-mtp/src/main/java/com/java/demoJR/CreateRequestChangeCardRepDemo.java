package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 换卡
 * 
 * @author Administrator
 * 
 */
public class CreateRequestChangeCardRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initChangeCardReportDemo();

        String msg = ReportDemo.encryptionChangeCardDemo(requestDataRowDto);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrKabiangengCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }

}
