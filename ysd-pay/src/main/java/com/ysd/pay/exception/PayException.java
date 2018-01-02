package com.ysd.pay.exception;

import com.ysd.base.exception.YsdException;

/**
 * @author xishengchun on 2017-09-09.
 */
public class PayException extends YsdException {

    public PayException() {
        super();
    }

    public PayException(String message) {
        super(message);
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayException(Throwable cause) {
        super(cause);
    }

    protected PayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
