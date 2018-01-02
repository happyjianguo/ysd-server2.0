
/**
 * 渤海接口异常类
 */
package com.rd.tpp.exception;


@SuppressWarnings("serial")
public class CbhbException extends RuntimeException {

	/**
	 * 跳转url
	 */
	protected String url;
	/**
	 * 返回类型
	 */
	protected int type;
	/**
	 * 页面按钮名字
	 */
	protected String buttonName;
	
	public CbhbException() {
		super();
	}

	public CbhbException(String message) {
		super(message);
		this.type = 1;
	}

	/**
	 * 获取url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置url
	 * @param url 要设置的url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取type
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * 设置type
	 * @param type 要设置的type
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * 获取buttonName
	 * @return buttonName
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * 设置buttonName
	 * @param buttonName 要设置的buttonName
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
}
