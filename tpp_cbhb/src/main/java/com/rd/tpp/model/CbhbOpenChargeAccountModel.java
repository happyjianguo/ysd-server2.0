package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * TODO 2.7对公账号开设充值户（后台方式） 
 * 非渤海行 对公账号开设充值户 ，作为线下、网银大额转账收入开设充值户 ，
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月14日 下午1:50:46
 */
public class CbhbOpenChargeAccountModel extends CbhbBaseModel {

	private static final long serialVersionUID = 1407295941390405207L;
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbOpenChargeAccountModel.class);
	
	/**
	 * 交易类别(1-新开 2-修改（修改户名和清算行号）)
	 */
	private String txnTyp;
	
	/**
	 * 账号属性（1-非渤海银行对公账号）
	 */
	private String accountTyp;
	
	/**
	 * 行外对公账号
	 */
	private String accountNo;
	
	/**
	 * 行外对公账号户名
	 */
	private String accountName;
	
	/**
	 * 清算行号
	 */
	private String accountBk;
	
	/**
	 * 大额充值账号
	 */
	private String chargeAccount;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set", 
			"partner_id", "version_no", "biz_type", "sign_type", 
			"MerBillNo", "TxnTyp", "AccountTyp", "AccountNo", "AccountName",
			"AccountBk", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", 
			"RespCode", "RespDesc",	"ChargeAccount", "AccountName", "mac" };

	/**
	 * 构造器
	 */
	public CbhbOpenChargeAccountModel() {
		super();
		this.setSaveRequest(false);
		this.setBizType(CbhbConstant.BIZ_TYPE_OPEN_CHARGE_ACCOUNT);
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getTxnTyp())) {
			throw new CbhbException("渤海银行请求账号属性txnTyp不能为空");
		}
		if (StringUtils.isBlank(this.getAccountTyp())) {
			throw new CbhbException("渤海银行请求账号属性accountTyp不能为空");
		}
		if (StringUtils.isBlank(this.getAccountNo())) {
			throw new CbhbException("渤海银行请求存管平台账户号或对公账号accountNo不能为空");
		}
		if (StringUtils.isBlank(this.getAccountName())) {
			throw new CbhbException("渤海银行请求存管对公账户户名accountName不能为空");
		}
		if (StringUtils.isBlank(this.getAccountBk())) {
			throw new CbhbException("渤海银行请求存管清算行号accountBk不能为空");
		}
		LOGGER.info("CbhbQueryChargeAccountModel valid...");
	}

	public void response(Map<String, String> map) {
		this.setChargeAccount(StringUtils.isNull(map.get("ChargeAccount")));
		this.setAccountName(StringUtils.isNull(map.get("AccountName")));
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
	 * 获取accountBk
	 * @return accountBk
	 */
	public String getAccountBk() {
		return accountBk;
	}

	/**
	 * 设置accountBk
	 * @param accountBk 要设置的accountBk
	 */
	public void setAccountBk(String accountBk) {
		this.accountBk = accountBk;
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
	 * 获取txnTyp
	 * @return txnTyp
	 */
	public String getTxnTyp() {
		return txnTyp;
	}

	/**
	 * 设置txnTyp
	 * @param txnTyp 要设置的txnTyp
	 */
	public void setTxnTyp(String txnTyp) {
		this.txnTyp = txnTyp;
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
