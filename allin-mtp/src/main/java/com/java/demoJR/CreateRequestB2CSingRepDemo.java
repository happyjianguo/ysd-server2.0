package com.java.demoJR;

import com.hitrust.hap.exception.HapException;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;

/**
 * 开户快捷
 * 
 * @author Administrator
 * 
 */

public class CreateRequestB2CSingRepDemo
{
    public static void main(String[] agrs) throws HapException
    {
        DataRow requestDataRowDto = ReportDemo.initB2CSingReportDemo();

        String msg = ReportDemo.encryptionSingDemo(requestDataRowDto);
        System.out.println(msg);
        DataRow agreementsignDaterow = DataGramB2cUtil.parseResponseJrQianyueCryptoMsg(msg);
        System.out.println(agreementsignDaterow);
    }

}
