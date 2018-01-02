package com.ysd.pay.constants;

/**
 * session key
 */
public  enum SessionKey {

    ;

    public String code, value;
    SessionKey(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.code;
    }
}