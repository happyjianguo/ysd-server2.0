package com.rd.tpp.model.req;

/**
 * 商户充值请求
 * @author wyw
 *
 */
public class CbhbMercRechargeReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2180235858076981259L;
	
	
	private double transAmt;//充值金额
	

	private String merAccTyp;// 充值账户  810营销账户   820预付款账户


	public double getTransAmt() {
		return transAmt;
	}


	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}


	public String getMerAccTyp() {
		return merAccTyp;
	}


	public void setMerAccTyp(String merAccTyp) {
		this.merAccTyp = merAccTyp;
	}
	
	
	
	
}
