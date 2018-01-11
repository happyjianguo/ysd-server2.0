package com.ysd.pay.constants;

/**
 * Created by chiang on 2016/6/30.
 */
public class Constant {
    private Constant() {
        throw new AssertionError("No com.ims.manage.constants.Constant instances for you!");
    }

    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";
    public static final String CONTENT_TYPE_XML = "application/xml;charset=utf-8";

    public static final String RESULT_CODE_KEY = "code";
    public static final String RESULT_MSG_KEY = "msg";

    public static final String RESULT_CODE_EXCEPTION = "exception";
    public static final String RESULT_MSG_EXCEPTION = "系统错误";

    public static final String RESULT_CODE_NO_LOGIN = "noLogin";
    public static final String RESULT_MSG_NO_LOGIN = "未登入";

    public static final String RESULT_CODE_SUCCESS = "success";
    public static final String RESULT_MSG_SUCCESS = "成功";

    public static final String RESULT_CODE_FAILURE = "fail";
    public static final String RESULT_MSG_FAILURE = "失败";

}
