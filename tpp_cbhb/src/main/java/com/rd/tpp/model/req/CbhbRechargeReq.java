package com.rd.tpp.model.req;

/**
 * 渤海用户充值请求参数
 * @author wyw
 *
 */
public class CbhbRechargeReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1153006448997579595L;
	
	private double amount;//充值金额
	
	private double merFeeAmt;//手续费

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(double merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}
	
	

}
