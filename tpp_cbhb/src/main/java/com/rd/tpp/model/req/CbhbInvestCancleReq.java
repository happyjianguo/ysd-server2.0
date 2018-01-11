package com.rd.tpp.model.req;

/**
 * 用户投资撤销请求
 * @author wyw
 *
 */
public class CbhbInvestCancleReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5119755522249564506L;
	
	private String oldTransId;//原账户存管平台流水 投标时返回参数

	private String SmsCode;//短信验证码

	private double TransAmt;//原投标金额 

	private String freezeId;//冻结编号 投标时返回参数


	public String getOldTransId() {
		return oldTransId;
	}

	public void setOldTransId(String oldTransId) {
		this.oldTransId = oldTransId;
	}

	public String getSmsCode() {
		return SmsCode;
	}

	public void setSmsCode(String smsCode) {
		SmsCode = smsCode;
	}

	public double getTransAmt() {
		return TransAmt;
	}

	public void setTransAmt(double transAmt) {
		TransAmt = transAmt;
	}

	public String getFreezeId() {
		return freezeId;
	}

	public void setFreezeId(String freezeId) {
		this.freezeId = freezeId;
	}


}
