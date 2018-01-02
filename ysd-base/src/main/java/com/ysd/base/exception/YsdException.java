package com.ysd.base.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xishengchun on 2017-09-10.
 * 基础的异常类。可以通过set方法,设置当前异常的相关参数
 * logger.error("异常:{}", e.getExceptionField(), e);
 */
public class YsdException extends RuntimeException {

    private final static SerializerFeature[] feature = {
            SerializerFeature.WriteNullStringAsEmpty,//如果字符串类型为null则输出""
            SerializerFeature.WriteMapNullValue, //输出null字段
            SerializerFeature.WriteNullNumberAsZero,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.QuoteFieldNames
    };

    /**
     * 异常相关参数
     */
    private Map<String, Object> exceptionFieldMap = new HashMap<>();

    public YsdException() {
        super();
    }

    public YsdException(String message) {
        super(message);
    }

    public YsdException(String message, Throwable cause) {
        super(message, cause);
    }

    public YsdException(Throwable cause) {
        super(cause);
    }

    protected YsdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * 抛出异常的时候,可以设置更多的异常数据
     * @param key
     * @param value
     * @return
     */
    public YsdException set(String key, Object value) {
        exceptionFieldMap.put(key, value);
        return this;
    }

    /**
     * 返回json格式错误值
     * @return
     */
    public String getExceptionField() {
        if (exceptionFieldMap.size() > 0) {
            return JSON.toJSONString(exceptionFieldMap, feature);
        } else {
            return "";
        }
    }

    public Map<String, Object> getExceptionFieldMap() {
        return exceptionFieldMap;
    }


}
