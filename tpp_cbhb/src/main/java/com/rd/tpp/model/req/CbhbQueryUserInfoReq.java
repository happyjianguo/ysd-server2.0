package com.rd.tpp.model.req;

/**
 * 用户信息查询请求参数
 * @author wyw
 *
 */
public class CbhbQueryUserInfoReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4144589009971324087L;
	
	private String  mobileNo;//手机号

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}
