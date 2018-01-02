package com.rd.tpp.model.req;

import java.io.Serializable;
import java.util.List;

/**
 * 渤海还款接口参数请求参数封装
 * @author wyw
 *
 */
public class CbhbRepayReqModel extends BaseReq implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -691573087010791881L;

	private String borrowId;//标id
	
	private String repayTyp;//1正常还款  2担保还款
	
	private String repay_inst_tot;//分期还款总期数
	
	private String repay_inst_cur; //分期还款当前期数
	
	private String merPriv;//备注
	
	private double feeAmt;//收取借款人的手续费
	
	private String borrCustId;//借款人存管账户id
	
	private double borrowerAmt;//标的金额
	
	List<CbhbRepayReqDetailModel> repayDetailList;//还款明细


	
	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public String getRepayTyp() {
		return repayTyp;
	}

	public void setRepayTyp(String repayTyp) {
		this.repayTyp = repayTyp;
	}

	public String getRepay_inst_tot() {
		return repay_inst_tot;
	}

	public void setRepay_inst_tot(String repay_inst_tot) {
		this.repay_inst_tot = repay_inst_tot;
	}

	public String getRepay_inst_cur() {
		return repay_inst_cur;
	}

	public void setRepay_inst_cur(String repay_inst_cur) {
		this.repay_inst_cur = repay_inst_cur;
	}

	public String getMerPriv() {
		return merPriv;
	}

	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}

	public double getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(double feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getBorrCustId() {
		return borrCustId;
	}

	public void setBorrCustId(String borrCustId) {
		this.borrCustId = borrCustId;
	}

	public double getBorrowerAmt() {
		return borrowerAmt;
	}

	public void setBorrowerAmt(double borrowerAmt) {
		this.borrowerAmt = borrowerAmt;
	}

	public List<CbhbRepayReqDetailModel> getRepayDetailList() {
		return repayDetailList;
	}

	public void setRepayDetailList(List<CbhbRepayReqDetailModel> repayDetailList) {
		this.repayDetailList = repayDetailList;
	}

	
}
