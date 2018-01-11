package com.rd.tpp.model.req;
/**
 * 大额充值户 开户
 * @author wyw
 *
 */
public class CbhbRechargeOpenReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6034787311677895750L;
  
	 private String txnTyp;// 1新开 2修改
	 
	 private String accountTyp="1";//1非渤海对公账户
	 
	 private String accountNo ;//行外对公账户
	 
	 private String accountName;//行外对公账户户名
	 
	 private String accountBk;// 支行清算行 行号

	public String getTxnTyp() {
		return txnTyp;
	}

	public void setTxnTyp(String txnTyp) {
		this.txnTyp = txnTyp;
	}

	public String getAccountTyp() {
		return accountTyp;
	}

	public void setAccountTyp(String accountTyp) {
		this.accountTyp = accountTyp;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountBk() {
		return accountBk;
	}

	public void setAccountBk(String accountBk) {
		this.accountBk = accountBk;
	}
	 
	 
}
