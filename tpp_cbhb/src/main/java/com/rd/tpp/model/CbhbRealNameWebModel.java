package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;


/**
 * 2.2 新用户注册(页面方式)
 * @date 2017年6月7日
 */
public class CbhbRealNameWebModel extends CbhbBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2837176145890151688L;

	/**
	 * Log
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbRealNameWebModel.class);
	
	/**
	 * 开户类型 String(1)
	 */
	private String openType;

	/**
	 * 证件类型 String(2)
	 */
	private String identType;

	/**
	 * 证件号码 String(50)
	 */
	private String identNo;

	/**
	 * 姓名 String(50)
	 */
	private String usrName;

	/**
	 * 手机号 String(11)
	 */
	private String mobileNo;

	/**
	 * 开户银行代号 String(8)
	 */
	private String openBankId;

	/**
	 * 开户银行账号 String(40)
	 */
	private String openAcctId;

	/**
	 * 账户存管平台客户号 String(16)
	 */
	private String plaCustId;

	/**
	 * 手续费 Number(16)
	 */
	private String feeAmt;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"OpenType", "IdentType", "IdentNo", "UsrName", "MobileNo",
			"OpenBankId", "OpenAcctId", "PageReturnUrl", "BgRetUrl", "MerPriv","mac"};
	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", "PlaCustId", "RespCode",
			"RespDesc", "OpenBankId", "OpenAcctId", "IdentType", "IdentNo",
			"UsrName", "MobileNo", "FEE_AMT", "MerPriv", "mac"};

	
	/**
	 * 构造器
	 */
	public CbhbRealNameWebModel() {
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYPE_REAL_NAME_WEB);
		this.setPageReturnUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/register/return.html");
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/register/notify.html");
	}
	
	public void defalutSet(){
		if(StringUtils.isBlank(this.openType)){
			this.setOpenType("1");	
		}if(StringUtils.isBlank(this.identType)){
			this.setIdentType("1");
		}if(StringUtils.isBlank(this.identNo)){
			this.setIdentNo(StringUtils.EMPTY);
		}if(StringUtils.isBlank(this.usrName)){
			this.setUsrName(StringUtils.EMPTY);
		}	
	}
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbQueryUserInfModel valid...");
		if(StringUtils.isBlank(this.getMobileNo())){
			throw new CbhbException("渤海银行请求手机号不能为空");
		}
		if(StringUtils.isBlank(this.getOpenType())){
			throw new CbhbException("渤海银行请求开户类型不能为空");
		}
		if(StringUtils.isBlank(this.getPageReturnUrl())){
			throw new CbhbException("渤海银行请求页面返回url不能为空");
		}
		if(StringUtils.isBlank(this.getBgRetUrl())){
			throw new CbhbException("渤海银行请求后台通知url不能为空");
		}
		if("2".equals(this.getOpenType())){
			if(StringUtils.isBlank(this.getIdentType())){
				throw new CbhbException("渤海银行请求证件类型不能为空");
			}
			if(StringUtils.isBlank(this.getIdentNo())){
				throw new CbhbException("渤海银行请求证件号码不能为空");
			}
			if(StringUtils.isBlank(this.getUsrName())){
				throw new CbhbException("渤海银行请求姓名不能为空");
			}
			if(StringUtils.isBlank(this.getOpenBankId())){
				throw new CbhbException("渤海银行请求开户银行代号不能为空");
			}
			if(StringUtils.isBlank(this.getOpenAcctId())){
				throw new CbhbException("渤海银行请求开户银行账号不能为空");
			}
		}
	}
	
	/**
	 * 回调参数封装
	 */
	public void response(Map<String, String> map) {
		this.setPlaCustId(StringUtils.isNull(map.get("PlaCustId")));
		this.setOpenBankId(StringUtils.isNull(map.get("OpenBankId")));
		this.setOpenAcctId(StringUtils.isNull(map.get("OpenAcctId")));
		this.setIdentType(StringUtils.isNull(map.get("IdentType")));
		this.setIdentNo(StringUtils.isNull(map.get("IdentNo")));
		this.setUsrName(StringUtils.isNull(map.get("UsrName")));
		this.setMobileNo(StringUtils.isNull(map.get("MobileNo")));
		this.setFeeAmt(StringUtils.isNull(map.get("FEE_AMT")));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
		super.response(map);
		
	}
	/**
	 * 1-新用户 2-老用户平台绑定 3-老用户（只有证件信息）绑定
	 */
	public String getOpenType() {
		return openType;
	}

	public void setOpenType(String openType) {
		this.openType = openType;
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

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenBankId() {
		return openBankId;
	}

	public void setOpenBankId(String openBankId) {
		this.openBankId = openBankId;
	}

	public String getOpenAcctId() {
		return openAcctId;
	}

	public void setOpenAcctId(String openAcctId) {
		this.openAcctId = openAcctId;
	}

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
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

}
