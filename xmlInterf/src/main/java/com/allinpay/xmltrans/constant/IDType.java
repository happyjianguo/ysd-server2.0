package com.allinpay.xmltrans.constant;

/**
 * @author xishengchun on 2017-09-24.
 * 证件类型
 */
public enum IDType {
    ID_CARD("0", "身份证"),
    REGISTERED_BOOK("1", "户口簿"),
    PASSPORT("2", "护照"),
    OFFICER_CARD("3", "军官证"),
    SOLDIER_CARD("4", "士兵证"),
    HK_MACAO_TRAFFIC_PERMIT("5", "港澳居民来往内地通行证"),
    TAIWAN_TRAFFIC_PERMIT("6", "台湾同胞来往内地通行证"),
    TEMP_ID_CARD("7", "临时身份证"),
    RESIDENCE_PERMIT("8", "外国人居留证"),
    POLICE_CARD("9", "警官证"),
    OTHER("X", "其他证件"),
    ;
    public String code, name;
    IDType(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
