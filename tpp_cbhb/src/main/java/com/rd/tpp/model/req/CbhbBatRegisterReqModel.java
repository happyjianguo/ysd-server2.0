package com.rd.tpp.model.req;

import java.io.Serializable;
import java.util.List;

/**
 * 渤海批量注册请求参数封装
 * @author wyw
 *
 */
public class CbhbBatRegisterReqModel  extends BaseReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4979008597366344899L;

	private List<CbhbBatRegisterReqDetailModel> userList;
	
	public List<CbhbBatRegisterReqDetailModel> getUserList() {
		return userList;
	}
	public void setUserList(List<CbhbBatRegisterReqDetailModel> userList) {
		this.userList = userList;
	}
	
	
	
}
