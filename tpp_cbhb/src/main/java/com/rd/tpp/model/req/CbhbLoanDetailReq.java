package com.rd.tpp.model.req;

import java.io.Serializable;

/**
 * 放款请求明细
 * @author wyw
 *
 */
public class CbhbLoanDetailReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6021621267760930773L;
	
	private String plaCustId;//存管用户标识
	
	private double transAmt;//投标金额
	
	private String freezeId;//冻结标识

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public String getFreezeId() {
		return freezeId;
	}

	public void setFreezeId(String freezeId) {
		this.freezeId = freezeId;
	}

}
