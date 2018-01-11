package com.allinpay.exception;

import com.ysd.base.exception.YsdException;

/**
 * @author xishengchun on 2017-09-24.
 */
public class AllinPayException extends YsdException {

    public AllinPayException() {
        super();
    }

    public AllinPayException(String message) {
        super(message);
    }

    public AllinPayException(String message, Throwable cause) {
        super(message, cause);
    }

    public AllinPayException(Throwable cause) {
        super(cause);
    }

    protected AllinPayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
