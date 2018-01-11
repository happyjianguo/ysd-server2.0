
package com.rd.tpp.model.app;

import java.util.Map;

import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * App修改绑定银行卡(页面方式)  
 */
@SuppressWarnings("serial")
public class CbhbAppBindCardWebModel extends CbhbAppBaseModel{

	/**
	 * LOGGER
	 */
	/*private static final Logger LOGGER = LoggerFactory.getLogger(CbhbAppBindCardWebModel.class);*/
	
	//响应参数
	
	/**
	 * 开户银行代号     8  
	 */
	private String OpenBankId;
	
	/**
	 * 修改后银行账号    40 
	 */
	private String OpenAcctId;
	
	/**
	 * 证件类型  '00' –身份证 2
	 */
	private String IdentType;
	
	/**
	 * 证件号码  50 
	 */
	private String IdentNo;
	
	/**
	 * 姓名
	 */
	private String UsrName;
	
	/**
	 * 手机号
	 */
	private String MobileNo;
	
	/**
	 * 手续费
	 */
	private String Fee_Amt;
	
	/**
	 * 商户私有域
	 */
	private String MerPriv;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"PartnerId",
			"MerBillNo", "PlaCustId", "BackUrl", "FrontUrl","MerPriv"};
	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "PartnerId",
			"MerBillNo", "PlaCustId", "OpenBankId", "OpenAcctId", "IdentType", "IdentNo",
			"UsrName", "MobileNo", "Fee_Amt", "MerPriv", "Version_No",
			"Biz_Type", "RpCode", "RpDesc", "Mac", "Sign_Type"};

	/**
	 * 构造器
	 */
	public CbhbAppBindCardWebModel(){
		super();
		this.setTransid("CBHBNetLoanBindCardMessage");
		this.setFrontUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/app/bindCardReturn.html");
		this.setBackUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/app/bindCardNotify.html");
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if(StringUtils.isBlank(this.getPlaCustId())){
			throw new CbhbException("渤海银行请求用户PlaCustId不能为空");
		}
	}
	
	/**
	 * 响应回调
	 */
	@Override
	public void response(Map<String, String> map) {
		super.response(map);
		this.setOpenBankId(StringUtils.isNull(map.get("OpenBankId")));
		this.setOpenAcctId(StringUtils.isNull(map.get("OpenAcctId")));
		this.setIdentType(StringUtils.isNull(map.get("IdentType")));
		this.setIdentNo(StringUtils.isNull(map.get("IdentNo")));
		this.setUsrName(StringUtils.isNull(map.get("UsrName")));
		this.setMobileNo(StringUtils.isNull(map.get("MobileNo")));
		this.setFee_Amt(StringUtils.isNull(map.get("Fee_Amt")));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
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

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getFee_Amt() {
		return Fee_Amt;
	}

	public void setFee_Amt(String fee_Amt) {
		Fee_Amt = fee_Amt;
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
	
}
