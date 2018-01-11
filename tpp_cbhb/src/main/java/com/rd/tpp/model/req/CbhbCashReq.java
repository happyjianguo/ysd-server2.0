package com.rd.tpp.model.req;

/**
 * 渤海取现请求参数
 * @author wyw
 *
 */
public class CbhbCashReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6334639149999147202L;
	
	private double amount;//取现金额
	
	private double servFee;//取现手续费

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getServFee() {
		return servFee;
	}

	public void setServFee(double servFee) {
		this.servFee = servFee;
	}
	
	

}
