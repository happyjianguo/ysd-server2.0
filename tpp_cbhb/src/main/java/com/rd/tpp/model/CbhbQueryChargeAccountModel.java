package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * TODO 4.10大额充值账号查询（后台方式）
 * 查询非渤海行对公账户或对私用户的大额充值账号。
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月14日 上午11:35:36
 */
public class CbhbQueryChargeAccountModel extends CbhbBaseModel {

	private static final long serialVersionUID = 1407295941390405207L;
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbQueryChargeAccountModel.class);
	
	/**
	 * 账号属性（1-对私 2-对公）
	 */
	private String accountTyp;
	
	/**
	 * 存管平台账户号或对公账号
	 * 根据 AccountTypTyp 取不同值 1-账户存管平台客户号 2-对公账号
	 */
	private String accountNo;
	
	/**
	 * 大额充值账号
	 */
	private String chargeAccount;
	
	/**
	 * 大额充值账户户名
	 */
	private String accountName;
	
	/**
	 * 可用余额
	 */
	private String avlBal;
	
	/**
	 * 账户余额
	 */
	private String acctBal;
	
	/**
	 * 冻结余额
	 */
	private String frzBal;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set", "partner_id", "version_no", 
			"biz_type", "sign_type", "AccountTyp", "AccountNo", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "RespCode", "RespDesc",
			"ChargeAccount", "AccountName", "AvlBal", "AcctBal", "FrzBal", "mac" };

	/**
	 * 构造器
	 */
	public CbhbQueryChargeAccountModel() {
		super();
		this.setSaveRequest(false);
		this.setBizType(CbhbConstant.BIZ_TYPE_QUERY_CHARGE_ACCOUNT);
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getAccountTyp())) {
			throw new CbhbException("渤海银行请求账号属性accountTyp不能为空");
		}
		if (StringUtils.isBlank(this.getAccountNo())) {
			throw new CbhbException("渤海银行请求存管平台账户号或对公账号accountNo不能为空");
		}
		LOGGER.info("CbhbQueryChargeAccountModel valid...");
	}

	public void response(Map<String, String> map) {
		this.setChargeAccount(StringUtils.isNull(map.get("ChargeAccount")));
		this.setAccountName(StringUtils.isNull(map.get("AccountName")));
		this.setAvlBal(StringUtils.isNull(map.get("AvlBal")));
		this.setFrzBal(StringUtils.isNull(map.get("FrzBal")));
		this.setAcctBal(StringUtils.isNull(map.get("AcctBal")));
		super.response(map);
	}

	/**
	 * 获取accountTyp
	 * @return accountTyp
	 */
	public String getAccountTyp() {
		return accountTyp;
	}

	/**
	 * 设置accountTyp
	 * @param accountTyp 要设置的accountTyp
	 */
	public void setAccountTyp(String accountTyp) {
		this.accountTyp = accountTyp;
	}

	/**
	 * 获取accountNo
	 * @return accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * 设置accountNo
	 * @param accountNo 要设置的accountNo
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * 获取chargeAccount
	 * @return chargeAccount
	 */
	public String getChargeAccount() {
		return chargeAccount;
	}

	/**
	 * 设置chargeAccount
	 * @param chargeAccount 要设置的chargeAccount
	 */
	public void setChargeAccount(String chargeAccount) {
		this.chargeAccount = chargeAccount;
	}

	/**
	 * 获取accountName
	 * @return accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * 设置accountName
	 * @param accountName 要设置的accountName
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 获取avlBal
	 * @return avlBal
	 */
	public String getAvlBal() {
		return avlBal;
	}

	/**
	 * 设置avlBal
	 * @param avlBal 要设置的avlBal
	 */
	public void setAvlBal(String avlBal) {
		this.avlBal = avlBal;
	}

	/**
	 * 获取acctBal
	 * @return acctBal
	 */
	public String getAcctBal() {
		return acctBal;
	}

	/**
	 * 设置acctBal
	 * @param acctBal 要设置的acctBal
	 */
	public void setAcctBal(String acctBal) {
		this.acctBal = acctBal;
	}

	/**
	 * 获取frzBal
	 * @return frzBal
	 */
	public String getFrzBal() {
		return frzBal;
	}

	/**
	 * 设置frzBal
	 * @param frzBal 要设置的frzBal
	 */
	public void setFrzBal(String frzBal) {
		this.frzBal = frzBal;
	}

	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

}
