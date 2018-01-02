package com.allinpay.xmltrans.constant;

/**
 * @author xishengchun on 2017-09-24.
 * 银行卡类型
 */
public enum BankType {

    BANK_CARD("00", "银行卡"),
    CREDIT_CARD("01", "信用卡"),
    BANK_BOOK("02", "存折"),
    ;

    public String code, name;
    BankType(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
