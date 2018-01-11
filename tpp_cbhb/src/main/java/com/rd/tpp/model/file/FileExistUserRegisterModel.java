package com.rd.tpp.model.file;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.model.CbhbBaseModel;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.StringUtils;
/**
 * 2.1	存量用户注册(ftp文件&后台方式)
 * @date 2017年6月7日
 */
public class FileExistUserRegisterModel extends CbhbBaseModel{
	
	private static final long serialVersionUID = -3639191443537894840L;
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(FileExistUserRegisterModel.class);
	
	/**
	 * 批次号	String(10)
	 */
	private String batchNo;
	
	/**
	 * 交易日期	String(8)
	 */
	private String transDate;
	
	/**
	 * 总笔数	Number(5)
	 */
	private String totalNum;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"char_set","partner_id","BatchNo","TransDate","TotalNum"};

	/**
	 * 构造器
	 */
	public FileExistUserRegisterModel(){
		super();
		this.setTransDate(DateUtils.getDate(DateUtils.DATEFORMAT_STR_yyyyMMdd));
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("existUserRegister valid...");
	}
	
	public String getFirstFileContent(String batchNo, String totalNum) {
		this.setBatchNo(batchNo);//批次号
		this.setTotalNum(totalNum);
		return this.getFileContent();
	}
	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

}
