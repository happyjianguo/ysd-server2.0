package com.ysd.user.exception;

import com.ysd.base.exception.YsdException;

/**
 * @author xishengchun on 2017-09-13.
 */
public class AgencyException extends YsdException {

    public AgencyException() {
        super();
    }

    public AgencyException(String message) {
        super(message);
    }

    public AgencyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgencyException(Throwable cause) {
        super(cause);
    }

    protected AgencyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
