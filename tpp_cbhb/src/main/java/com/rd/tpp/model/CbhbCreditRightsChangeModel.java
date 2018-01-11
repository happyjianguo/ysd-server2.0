package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * TODO 债权转让（支持部分部分转让与全部转让，
 * 若是部分转让则每次转让都上送原投资流水号。
 * 转让只允许在标的已放款后、还款之前。还款时校验用户是否已全部转让，若已全部转让则不允许该用户还款）
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年6月15日 下午5:31:34
 */
@SuppressWarnings("serial")
public class CbhbCreditRightsChangeModel extends CbhbBaseModel {
	
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbCreditRightsChangeModel.class);
	
	/**
	 * 交易金额（转让交易金额：本金和利息总额）
	 * 不可空
	 */
	private String transAmt;
	
	/**
	 * 元账户存管平台流水（用户投标时返回的流水）
	 * 不可空
	 */
	private String oldTransId;
	
	/**
	 * 商户手续费收入
	 * 不可空
	 */
	private String merFeeAmt;
	
	/**
	 * 手续费模式（0 受让人出，1 转让人出）
	 * 不可空
	 */
	private String feeType;
	
	/**
	 * 受让人出账金额
	 * 若feeType 为0，outAmt = transAmt + merFeeAmt
	 * 若feeType 为1，outAmt = transAmt
	 * 不可空
	 */
	private String outAmt;
	
	/**
	 * 转让人入账金额
	 * 若feeType 为0，inAmt = transAmt
	 * 若feeType 为1，inAmt = transAmt -merFeeAmt
	 * 不可空
	 */
	private String inAmt;
	
	/**
	 * 出账客户号（受让人客户号）
	 * 不可空
	 */
	private String outCustId;
	
	/**
	 * 入账客户号（转让人客户号）
	 * 不可空
	 */
	private String inCustId;
	
	/**
	 * 短信验证码（受让人）
	 * 不可空
	 */
	private String smsCode;
	
	/**
	 * 标ID
	 * 不可空
	 */
	private String borrowId;
	
	// ************ 回调参数 ************
	/**
	 * 账户存管平台流水
	 */
	private String transId;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"TransAmt", "OldTransId", "MerFeeAmt", "FeeType", "OutAmt",
			"InAmt", "OutCustId", "InCustId", "SmsCode", "BorrowId", 
			"MerPriv", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", "RespCode", 
			"RespDesc", "TransId", "MerPriv", "mac" };
	
	/**
	 * 构造器
	 */
	public CbhbCreditRightsChangeModel(){
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYLE_CREDIT_RIGHTS_CHANGE);
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("cbhbCreditRightsChange valid...");
		if (StringUtils.isBlank(this.getTransAmt())) {
			throw new CbhbException("渤海银行请求交易金额不能为空");
		}
		if (StringUtils.isBlank(this.getOldTransId())) {
			throw new CbhbException("渤海银行请求原账户存管平台流水不能为空");
		}
		if (StringUtils.isBlank(this.getMerFeeAmt())) {
			throw new CbhbException("渤海银行请求商户手续费收入不能为空");
		}
		if (StringUtils.isBlank(this.getFeeType())) {
			throw new CbhbException("渤海银行请求手续费模式不能为空");
		}
		if (StringUtils.isBlank(this.getOutAmt())) {
			throw new CbhbException("渤海银行请求受让人出账金额不能为空");
		}
		if (StringUtils.isBlank(this.getInAmt())) {
			throw new CbhbException("渤海银行请求转让人入账金额不能为空");
		}
		if (StringUtils.isBlank(this.getOutCustId())) {
			throw new CbhbException("渤海银行请求出账客户号不能为空");
		}
		if (StringUtils.isBlank(this.getInCustId())) {
			throw new CbhbException("渤海银行请求入账客户号不能为空");
		}
		if (StringUtils.isBlank(this.getSmsCode())) {
			throw new CbhbException("渤海银行请求短信验证码不能为空");
		}
		if (StringUtils.isBlank(this.getBorrowId())) {
			throw new CbhbException("渤海银行请求出标ID不能为空");
		}
	}
	
	public void response(Map<String, String> map) {
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		super.response(map);
	}

	/**
	 * 获取transAmt
	 * @return transAmt
	 */
	public String getTransAmt() {
		return transAmt;
	}

	/**
	 * 设置transAmt
	 * @param transAmt 要设置的transAmt
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * 获取oldTransId
	 * @return oldTransId
	 */
	public String getOldTransId() {
		return oldTransId;
	}

	/**
	 * 设置oldTransId
	 * @param oldTransId 要设置的oldTransId
	 */
	public void setOldTransId(String oldTransId) {
		this.oldTransId = oldTransId;
	}

	/**
	 * 获取merFeeAmt
	 * @return merFeeAmt
	 */
	public String getMerFeeAmt() {
		return merFeeAmt;
	}

	/**
	 * 设置merFeeAmt
	 * @param merFeeAmt 要设置的merFeeAmt
	 */
	public void setMerFeeAmt(String merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	/**
	 * 获取feeType
	 * @return feeType
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * 设置feeType
	 * @param feeType 要设置的feeType
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	/**
	 * 获取outAmt
	 * @return outAmt
	 */
	public String getOutAmt() {
		return outAmt;
	}

	/**
	 * 设置outAmt
	 * @param outAmt 要设置的outAmt
	 */
	public void setOutAmt(String outAmt) {
		this.outAmt = outAmt;
	}

	/**
	 * 获取inAmt
	 * @return inAmt
	 */
	public String getInAmt() {
		return inAmt;
	}

	/**
	 * 设置inAmt
	 * @param inAmt 要设置的inAmt
	 */
	public void setInAmt(String inAmt) {
		this.inAmt = inAmt;
	}

	/**
	 * 获取outCustId
	 * @return outCustId
	 */
	public String getOutCustId() {
		return outCustId;
	}

	/**
	 * 设置outCustId
	 * @param outCustId 要设置的outCustId
	 */
	public void setOutCustId(String outCustId) {
		this.outCustId = outCustId;
	}

	/**
	 * 获取inCustId
	 * @return inCustId
	 */
	public String getInCustId() {
		return inCustId;
	}

	/**
	 * 设置inCustId
	 * @param inCustId 要设置的inCustId
	 */
	public void setInCustId(String inCustId) {
		this.inCustId = inCustId;
	}

	/**
	 * 获取smsCode
	 * @return smsCode
	 */
	public String getSmsCode() {
		return smsCode;
	}

	/**
	 * 设置smsCode
	 * @param smsCode 要设置的smsCode
	 */
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	/**
	 * 获取borrowId
	 * @return borrowId
	 */
	public String getBorrowId() {
		return borrowId;
	}

	/**
	 * 设置borrowId
	 * @param borrowId 要设置的borrowId
	 */
	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	/**
	 * 获取transId
	 * @return transId
	 */
	public String getTransId() {
		return transId;
	}

	/**
	 * 设置transId
	 * @param transId 要设置的transId
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}

	/**
	 * 获取requestParamNames
	 * @return requestParamNames
	 */
	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	/**
	 * 设置requestParamNames
	 * @param requestParamNames 要设置的requestParamNames
	 */
	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	/**
	 * 获取responseParamNames
	 * @return responseParamNames
	 */
	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	/**
	 * 设置responseParamNames
	 * @param responseParamNames 要设置的responseParamNames
	 */
	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}
	
}
