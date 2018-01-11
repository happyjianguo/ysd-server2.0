package com.rd.tpp.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.model.file.FileLoanTransferDetailModel;
import com.rd.tpp.model.file.FileLoanTransferModel;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * TODO 存量标迁移
 * 
 * @author zza@erongdu.com
 * @version v2.0
 * @since 2017年8月1日 上午10:10:33
 */
@SuppressWarnings("serial")
public class CbhbFileLoanTransferModel extends CbhbBaseModel {

	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbFileLoanTransferModel.class);

	/**
	 * 文件名称
	 */
	private String fileName;
	
	/**
	 * 标ID
	 */
	private String borrowId;
	
	/**
	 * 标的金额
	 */
	private String borrowerAmt;
	
	/**
	 * 详情列表
	 */
	List<FileLoanTransferDetailModel> detailList;
	
	/**
	 * 第一行
	 */
	FileLoanTransferModel transferModel;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"FileName", "BorrowId", "BorrowerAmt", "BgRetUrl", "MerPriv", "mac" };
	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", "RespCode",
			"RespDesc", "mac" };

	/**
	 * 构造器
	 */
	public CbhbFileLoanTransferModel() {
		super();
		this.setSaveRequest(false);
		this.setBizType(CbhbConstant.BIZ_TYPE_FILE_LOAN_TRANSFER);
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/fileLoanTransfer/notify.html");
		this.setFileName(this.getFileNameOnByRule());
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbFileLoanTransferModel valid...");
		LOGGER.info("borrowId3：{}", this.getBorrowId());
		if (StringUtils.isBlank(this.getBorrowId())) {
			throw new CbhbException("渤海银行请求标的ID不能为空");
		}
	}

	/**
	 * 回调响应
	 */
	@Override
	public void response(Map<String, String> map) {
		super.response(map);
		LOGGER.info("CbhbFileLoanTransferModel response...");
	}

	/**
	 * 获取fileName
	 * @return fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 设置fileName
	 * @param fileName 要设置的fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	 * 获取borrowerAmt
	 * @return borrowerAmt
	 */
	public String getBorrowerAmt() {
		return borrowerAmt;
	}

	/**
	 * 设置borrowerAmt
	 * @param borrowerAmt 要设置的borrowerAmt
	 */
	public void setBorrowerAmt(String borrowerAmt) {
		this.borrowerAmt = borrowerAmt;
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

	/**
	 * 获取detailList
	 * @return detailList
	 */
	public List<FileLoanTransferDetailModel> getDetailList() {
		return detailList;
	}

	/**
	 * 设置detailList
	 * @param detailList 要设置的detailList
	 */
	public void setDetailList(List<FileLoanTransferDetailModel> detailList) {
		this.detailList = detailList;
	}

	/**
	 * 获取transferModel
	 * @return transferModel
	 */
	public FileLoanTransferModel getTransferModel() {
		return transferModel;
	}

	/**
	 * 设置transferModel
	 * @param transferModel 要设置的transferModel
	 */
	public void setTransferModel(FileLoanTransferModel transferModel) {
		this.transferModel = transferModel;
	}

}
