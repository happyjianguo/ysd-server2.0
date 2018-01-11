package com.rd.tpp.model.req;

/**
 * 查询非渤海对公或者 对私账户大额充值户
 * @author wyw
 *
 */
public class CbhbCorChargeAccountReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1765340327350000303L;

	private String accountTyp="2";//1-对私  2对公
	
	private String accountNo;//对公或者 对私 客户号  

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
	
	
	
}
