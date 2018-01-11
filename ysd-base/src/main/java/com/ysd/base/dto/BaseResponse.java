package com.ysd.base.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * 响应内容基础信息
 */
public class BaseResponse implements java.io.Serializable{
    private String resultCode = "success";
    private String resultMsg = "操作成功";

    // 如果不想重新再创建vo,可以通过extras附加信息。
    private Map<String, Object> extras = new HashMap<>();


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    public BaseResponse(){

    }

    public BaseResponse(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public static BaseResponse success(){
        return new BaseResponse("success","ok");
    }

    public static BaseResponse fail(){
        return new BaseResponse("fail","操作失败");
    }

    public static BaseResponse fail(String error){
        return new BaseResponse("fail", error);
    }

    public static BaseResponse fail(String errCode,String errMsg){
        return new BaseResponse(errCode, errMsg);
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
