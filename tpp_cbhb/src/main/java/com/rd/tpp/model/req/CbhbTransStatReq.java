package com.rd.tpp.model.req;

/**
 * 交易状态查询
 * @author wyw
 *
 */
public class CbhbTransStatReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1252515174332369705L;
	
	private String queryTransType;//交易类型  如 （CreditRightsChange 债权转让）

	public String getQueryTransType() {
		return queryTransType;
	}

	public void setQueryTransType(String queryTransType) {
		this.queryTransType = queryTransType;
	}
	
    
}
