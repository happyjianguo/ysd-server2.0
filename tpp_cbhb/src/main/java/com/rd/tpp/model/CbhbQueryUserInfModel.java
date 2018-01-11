package com.rd.tpp.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.model.xml.XmlQueryUserInf;
import com.rd.tpp.util.StringUtils;

/**
 * 
 * 4.1 用户信息查询（后台方式）
 * 
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
public class CbhbQueryUserInfModel extends CbhbBaseModel {

	private static final long serialVersionUID = -3639191443537894840L;
	
	/**
	 * Log
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbQueryTransStatModel.class);

	/**
	 * 手机号 String(11)
	 */
	private String mobileNo;

	/**
	 * 账户存管平台客户号 String(16)
	 */
	private String plaCustId;

	/**
	 * 证件类型 String(2)
	 */
	private String identType;

	/**
	 * 证件号码 String(50)
	 */
	private String identNo;

	/**
	 * 返回数据 String(256)
	 */
	private String respData;
	private List<XmlQueryUserInf> userlist ;//respData 解析

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", 
			"PlaCustId", "MobileNo", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "RespCode", "RespDesc",
			"IdentType", "IdentNo", "PlaCustId", "RespData", "mac" };

	/**
	 * 构造器
	 */
	public CbhbQueryUserInfModel() {
		super();
		this.setSaveRequest(false);
		this.setBizType(CbhbConstant.BIZ_TYPE_QUERY_USER_INF);
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbQueryUserInfModel valid...");
	}
	
	@Override
	public void response(Map<String, String> map) {
		this.setIdentType(StringUtils.isNull(map.get("IdentType")));
		this.setIdentNo(StringUtils.isNull(map.get("IdentNo")));
		this.setRespData(StringUtils.isNull(map.get("RespData")));
		super.response(map);
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public String getIdentType() {
		return identType;
	}

	public void setIdentType(String identType) {
		this.identType = identType;
	}

	public String getIdentNo() {
		return identNo;
	}

	public void setIdentNo(String identNo) {
		this.identNo = identNo;
	}

	public String getRespData() {
		return respData;
	}

	public void setRespData(String respData) {
		this.respData = respData;
	}

	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

	public List<XmlQueryUserInf> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<XmlQueryUserInf> userlist) {
		this.userlist = userlist;
	}


}
