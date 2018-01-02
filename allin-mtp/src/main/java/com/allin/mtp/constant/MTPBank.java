package com.allin.mtp.constant;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xishengchun on 2017-09-24.
 * 可用的银行
 */
public enum MTPBank {
    ICBC("01020000", "中国工商银行"),
    ABC("01030000", "中国农业银行"),
    BOC("01040000", "中国银行"),
    CCB("01050000", "中国建设银行"),
    CMB("03080000", "招商银行"),
    CGB("03060000", "广发银行"),
    CIB("03090000", "兴业银行"),
    CMBC("03050000", "民生银行"),
    BCOM("03010000", "交通银行"),
    SPDB("03100000", "浦发银行"),
    CITIC("03020000", "中信银行"),
    PSBC("01000000", "邮储银行"),
    CEB("03030000", "光大银行"),
    PAB("04105840", "平安银行"),
    HXB("03040000", "华夏银行"),
    ;

    public String code, name;
    MTPBank(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 判断是否在枚举范围内
     * @param code
     * @return
     */
    public static boolean valid(String code) {
        MTPBank[] values = MTPBank.values();
        for (MTPBank value : values) {
            if (value.code.equals(code)) {
                return true;
            }
        }
        return false;
    }
    private static Map<String,String> bankIds = new HashMap<String,String>();
    private static Map<String,String> bankCodes = new HashMap<String,String>();
    static{
        bankIds.put("01020000","ICBC");
        bankIds.put("01030000","ABC");
        bankIds.put("01040000","BOC");
        bankIds.put("01050000","CCB");
        bankIds.put("03080000","CMB");

        bankIds.put("03060000","CGB");
        bankIds.put("03090000","CIB");
        bankIds.put("03050000","CMBC");
        bankIds.put("03010000","BCOM");
        bankIds.put("03100000","SPDB");
        bankIds.put("03020000","CITIC");
        bankIds.put("01000000","PSBC");
        bankIds.put("03030000","CEB");
        bankIds.put("04105840","PAB");
        bankIds.put("03040000","HXB");
        ///////////////////////////
        bankCodes.put("ICBC","01020000");
        bankCodes.put("ABC","01030000");
        bankCodes.put("BOC","01040000");
        bankCodes.put("CCB","01050000");
        bankCodes.put("CMB","03080000");

        bankCodes.put("CGB","03060000");
        bankCodes.put("CIB","03090000");
        bankCodes.put("CMBC","03050000");
        bankCodes.put("BCOM","03010000");
        bankCodes.put("SPDB","03100000");
        bankCodes.put("CITIC","03020000");
        bankCodes.put("PSBC","01000000");
        bankCodes.put("CEB","03030000");
        bankCodes.put("PAB","04105840");
        bankCodes.put("HXB","03040000");
    }

    /*public static String getBankCodeById(String bankId){
        if(StringUtils.isBlank(bankId)){
            return null;
        }else{
            return bankIds.get(bankId);
        }
    }*/

    public static String getBankIdByCode(String bankCode){
        if(StringUtils.isBlank(bankCode)){
            return null;
        }else{
            return bankCodes.get(bankCode);
        }
    }

}
