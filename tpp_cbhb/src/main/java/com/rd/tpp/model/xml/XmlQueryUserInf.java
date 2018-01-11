package com.rd.tpp.model.xml;

import java.io.Serializable;

/**
 *  用户信息查询返回数据xml对象实体
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年6月20日 上午9:51:16
 */
@SuppressWarnings("serial")
public class XmlQueryUserInf implements Serializable {
	
	/**
	 * 开户行
	 */
	private String capCorg;
	
	/**
	 * 卡号
	 */
	private String capCrdNo;
	
	/**
	 * 绑定手机号
	 */
	private String mblNo;
	
	/**
	 * 姓名
	 */
	private String usrNm;

	/**
	 * 获取capCorg
	 * @return capCorg
	 */
	public String getCapCorg() {
		return capCorg;
	}

	/**
	 * 设置capCorg
	 * @param capCorg 要设置的capCorg
	 */
	public void setCapCorg(String capCorg) {
		this.capCorg = capCorg;
	}

	/**
	 * 获取capCrdNo
	 * @return capCrdNo
	 */
	public String getCapCrdNo() {
		return capCrdNo;
	}

	/**
	 * 设置capCrdNo
	 * @param capCrdNo 要设置的capCrdNo
	 */
	public void setCapCrdNo(String capCrdNo) {
		this.capCrdNo = capCrdNo;
	}

	/**
	 * 获取mblNo
	 * @return mblNo
	 */
	public String getMblNo() {
		return mblNo;
	}

	/**
	 * 设置mblNo
	 * @param mblNo 要设置的mblNo
	 */
	public void setMblNo(String mblNo) {
		this.mblNo = mblNo;
	}

	/**
	 * 获取usrNm
	 * @return usrNm
	 */
	public String getUsrNm() {
		return usrNm;
	}

	/**
	 * 设置usrNm
	 * @param usrNm 要设置的usrNm
	 */
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

}
