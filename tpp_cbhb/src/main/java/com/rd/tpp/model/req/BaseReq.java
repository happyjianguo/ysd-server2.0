package com.rd.tpp.model.req;

import java.io.Serializable;

import com.rd.tpp.model.CbhbBaseModel;
import com.rd.tpp.util.StringUtils;

/**
 * 请求参数基类
 * @author wyw
 *
 */
public class BaseReq implements Serializable {

	private static final long serialVersionUID = 1438554759228342447L;
	
	private String plaCustId;//渤海用户标识
	
	private String merBillNo;//流水号订单号
	
	private String pageReturnUrl;//同步页面请求返回

	private String bgRetUrl;//后台通知url

	private String merPriv;//商户保留域 

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public String getMerBillNo() {
		return merBillNo;
	}

	public void setMerBillNo(String merBillNo) {
		this.merBillNo = merBillNo;
	}

	public String getPageReturnUrl() {
		return pageReturnUrl;
	}

	public void setPageReturnUrl(String pageReturnUrl) {
		this.pageReturnUrl = pageReturnUrl;
	}

	public String getBgRetUrl() {
		return bgRetUrl;
	}

	public void setBgRetUrl(String bgRetUrl) {
		this.bgRetUrl = bgRetUrl;
	}

	public String getMerPriv() {
		return merPriv;
	}

	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}
	
	public void flushModel(CbhbBaseModel baseModel){
		if(StringUtils.isNotBlank(getMerBillNo())){
			baseModel.setMerBillNo(getMerBillNo());
		}
		if(StringUtils.isNotBlank(getPageReturnUrl())){
			baseModel.setPageReturnUrl(getPageReturnUrl());
		}
		if(StringUtils.isNotBlank(getBgRetUrl())){
			baseModel.setBgRetUrl(getBgRetUrl());
		}
		if(StringUtils.isNotBlank(getPlaCustId())){
			baseModel.setPlaCustId(getPlaCustId());
		}
		if(StringUtils.isNotBlank(getMerPriv())){
			baseModel.setMerPriv(getMerPriv());
		}
	}
}
