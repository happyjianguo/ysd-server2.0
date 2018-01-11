package com.rd.tpp.model.req;

import java.util.List;

/**
 * 放款请求
 * @author wyw
 *
 */
public class CbhbLoanReq extends BaseReq {
	private static final long serialVersionUID = -2649290316184258888L;
	
	private String borrowId;//放款标的
	
	private double feeAmt;//手续费
	
	private double transAmt;//实际满标金额

	private double borrowerAmt;//标的金额
	
	private double borrCustId;//借款人用户标识

	private List<CbhbLoanDetailReq> detailList;//放款明细

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public double getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(double feeAmt) {
		this.feeAmt = feeAmt;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getBorrowerAmt() {
		return borrowerAmt;
	}

	public void setBorrowerAmt(double borrowerAmt) {
		this.borrowerAmt = borrowerAmt;
	}

	public double getBorrCustId() {
		return borrCustId;
	}

	public void setBorrCustId(double borrCustId) {
		this.borrCustId = borrCustId;
	}

	public List<CbhbLoanDetailReq> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<CbhbLoanDetailReq> detailList) {
		this.detailList = detailList;
	}
}
