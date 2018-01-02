package com.rd.tpp.model.req;

import java.io.Serializable;

/**
 * 
 * @author wyw
 *
 */
public class CbhbBatRegisterReqDetailModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5971316688600878117L;
   
	private String identType;//证件类型
	
	private String identNo;// 证件号码
	
	private String mobileNo;// 手机号
	
	private String openBankId;//开户银行代号
	
	private String openAcctId;//开户银行账号

	private String usrName;//真实姓名
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

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	
	
	
}
