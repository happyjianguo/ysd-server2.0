package com.aipg.rnp;

public class RnprRet {

    private String RET_CODE;
    private String ERR_MSG;

    public RnprRet(String RET_CODE, String ERR_MSG) {
        this.RET_CODE = RET_CODE;
        this.ERR_MSG = ERR_MSG;
    }

    public RnprRet(){

    }

    public String getRET_CODE() {
        return RET_CODE;
    }

    public void setRET_CODE(String RET_CODE) {
        this.RET_CODE = RET_CODE;
    }

    public String getERR_MSG() {
        return ERR_MSG;
    }

    public void setERR_MSG(String ERR_MSG) {
        this.ERR_MSG = ERR_MSG;
    }
}
