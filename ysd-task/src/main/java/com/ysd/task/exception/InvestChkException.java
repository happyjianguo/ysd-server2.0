package com.ysd.task.exception;

import com.ysd.base.exception.YsdException;

/**
 * @author xishengchun on 2017-09-16.
 */
public class InvestChkException extends YsdException {

    public InvestChkException() {
        super();
    }

    public InvestChkException(String message) {
        super(message);
    }

    public InvestChkException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvestChkException(Throwable cause) {
        super(cause);
    }

    protected InvestChkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
