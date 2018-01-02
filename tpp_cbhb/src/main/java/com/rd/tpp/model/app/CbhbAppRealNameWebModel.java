package com.rd.tpp.model.app;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;


/**
 * 渤海app注册接口
 */
public class CbhbAppRealNameWebModel extends CbhbAppBaseModel {
	private static final long serialVersionUID = -3490767058364137487L;

	/**
	 * Log
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbAppRealNameWebModel.class);
	
	/**
	 * 银行预留手机号
	 */
	private String MobileNo;

	/**
	 * 证件类型  
	 */
	private String IdentType;

	/**
	 * 证件号码 String(50)
	 */
	private String IdentNo;

	/**
	 * 姓名 String(50)
	 */
	private String UsrName;

	/**
	 * 新老用户标识 0：新用户；1：老用户
	 */
	private String UsrFlag;

	/**
	 * 开户银行代号 String(8)
	 */
	private String OpenBankId;

	/**
	 * 开户银行账号 String(40)
	 */
	private String OpenAcctId;

	/**
	 * 商户保留域
	 */
	private String MerPriv;

	private String Fee_Amt;
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"PartnerId",
			"MerBillNo", "MobileNo", "BackUrl", "FrontUrl", "IdentType",
			"IdentNo", "UsrName", "UsrFlag", "OpenBankId", "OpenAcctId",
			"MerPriv"};
	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "PartnerId",
			"MerBillNo", "PlaCustId", "OpenBankId", "OpenAcctId", "IdentType", "IdentNo",
			"UsrName", "MobileNo", "MerPriv", "Fee_Amt", "Version_No",
			"Biz_Type", "RpCode", "RpDesc", "Mac", "Sign_Type"};

	
	/**
	 * 构造器
	 */
	public CbhbAppRealNameWebModel() {
		super();
		this.setTransid("CBHBNetLoanRegister");
		this.setFrontUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/app/registerReturn.html");
		this.setBackUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/app/registerNotify.html");
	}
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if(StringUtils.isBlank(this.getMobileNo())){
			throw new CbhbException("渤海银行请求手机号不能为空");
		}
	}
	
	/**
	 * 回调参数封装
	 */
	public void response(Map<String, String> map) {
		super.response(map);
		this.setPlaCustId(StringUtils.isNull(map.get("PlaCustId")));
		this.setOpenBankId(StringUtils.isNull(map.get("OpenBankId")));
		this.setOpenAcctId(StringUtils.isNull(map.get("OpenAcctId")));
		this.setIdentType(StringUtils.isNull(map.get("IdentType")));
		this.setIdentNo(StringUtils.isNull(map.get("IdentNo")));
		this.setUsrName(StringUtils.isNull(map.get("UsrName")));
		this.setMobileNo(StringUtils.isNull(map.get("MobileNo")));
		this.setFee_Amt(StringUtils.isNull(map.get("Fee_Amt")));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
		
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getIdentType() {
		return IdentType;
	}
	public void setIdentType(String identType) {
		IdentType = identType;
	}
	public String getIdentNo() {
		return IdentNo;
	}
	public void setIdentNo(String identNo) {
		IdentNo = identNo;
	}
	public String getUsrName() {
		return UsrName;
	}
	public void setUsrName(String usrName) {
		UsrName = usrName;
	}
	public String getUsrFlag() {
		return UsrFlag;
	}
	public void setUsrFlag(String usrFlag) {
		UsrFlag = usrFlag;
	}
	public String getOpenBankId() {
		return OpenBankId;
	}
	public void setOpenBankId(String openBankId) {
		OpenBankId = openBankId;
	}
	public String getOpenAcctId() {
		return OpenAcctId;
	}
	public void setOpenAcctId(String openAcctId) {
		OpenAcctId = openAcctId;
	}
	public String getMerPriv() {
		return MerPriv;
	}
	public void setMerPriv(String merPriv) {
		MerPriv = merPriv;
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
	public String getFee_Amt() {
		return Fee_Amt;
	}
	public void setFee_Amt(String fee_Amt) {
		Fee_Amt = fee_Amt;
	}
	
}
