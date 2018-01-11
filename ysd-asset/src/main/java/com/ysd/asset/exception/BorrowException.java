package com.ysd.asset.exception;

import com.ysd.base.exception.YsdException;

/**
 * @author xishengchun on 2017-09-17.
 */
public class BorrowException extends YsdException {

    public BorrowException() {
        super();
    }

    public BorrowException(String message) {
        super(message);
    }

    public BorrowException(String message, Throwable cause) {
        super(message, cause);
    }

    public BorrowException(Throwable cause) {
        super(cause);
    }

    protected BorrowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
