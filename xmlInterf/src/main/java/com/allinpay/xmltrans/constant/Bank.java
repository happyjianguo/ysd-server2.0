package com.allinpay.xmltrans.constant;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xishengchun on 2017-09-24.
 * 可用的银行
 */
public enum Bank {
    ICBC("0102", "中国工商银行"),
    ABC("0103", "中国农业银行"),
    BOC("0104", "中国银行"),
    CCB("0105", "中国建设银行"),
    CMB("0308", "招商银行"),
    CGB("0306", "广发银行"),
    CIB("0309", "兴业银行"),
    CMBC("0305", "民生银行"),
    BCOM("0301", "交通银行"),
    SPDB("0310", "浦发银行"),
    CITIC("0302", "中信银行"),
    PSBC("0403", "邮储银行"),
    CEB("0303", "光大银行"),
    PAB("0307", "平安银行"),
    HXB("0304", "华夏银行"),
    ;

    public String code, name;
    Bank(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 判断是否在枚举范围内
     * @param code
     * @return
     */
    public static boolean valid(String code) {
        Bank[] values = Bank.values();
        for (Bank value : values) {
            if (value.code.equals(code)) {
                return true;
            }
        }
        return false;
    }
    private static Map<String,String> bankIds = new HashMap<String,String>();
    private static Map<String,String> bankCodes = new HashMap<String,String>();
    static{
        bankIds.put("0102","ICBC");
        bankIds.put("0103","ABC");
        bankIds.put("0104","BOC");
        bankIds.put("0105","CCB");
        bankIds.put("0308","CMB");

        bankIds.put("0306","CGB");
        bankIds.put("0309","CIB");
        bankIds.put("0305","CMBC");
        bankIds.put("0301","BCOM");
        bankIds.put("0310","SPDB");
        bankIds.put("0302","CITIC");
        bankIds.put("0403","PSBC");
        bankIds.put("0303","CEB");
        bankIds.put("0307","PAB");
        bankIds.put("0304","HXB");
        ///////////////////////////
        bankCodes.put("ICBC","0102");
        bankCodes.put("ABC","0103");
        bankCodes.put("BOC","0104");
        bankCodes.put("CCB","0105");
        bankCodes.put("CMB","0308");

        bankCodes.put("CGB","0306");
        bankCodes.put("CIB","0309");
        bankCodes.put("CMBC","0305");
        bankCodes.put("BCOM","0301");
        bankCodes.put("SPDB","0310");
        bankCodes.put("CITIC","0302");
        bankCodes.put("PSBC","0403");
        bankCodes.put("CEB","0303");
        bankCodes.put("PAB","0307");
        bankCodes.put("HXB","0304");
    }

    public static String getBankCodeById(String bankId){
        if(StringUtils.isBlank(bankId)){
            return null;
        }else{
            return bankIds.get(bankId);
        }
    }

    public static String getBankIdByCode(String bankCode){
        if(StringUtils.isBlank(bankCode)){
            return null;
        }else{
            return bankCodes.get(bankCode);
        }
    }

}
