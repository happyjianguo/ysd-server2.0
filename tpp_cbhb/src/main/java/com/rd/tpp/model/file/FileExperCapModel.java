package com.rd.tpp.model.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.model.CbhbBaseModel;
import com.rd.tpp.model.CbhbHelper;
import com.rd.tpp.util.StringUtils;

/**
 * 
 * 3.12.1	红包申请通知（后台方式）
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
public class FileExperCapModel extends CbhbBaseModel{
	
	private static final long serialVersionUID = -3639191443537894840L;
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(FileExperCapModel.class);
	
	/**
	 * 收益金额	Number(16)
	 */
	private String transAmt;
	
	/**
	 * 商户手续费收入	Number(10)
	 */
	private String merFeeAmt;
	
	/**
	 * 红包类型	String(1)
	 */
	private String capTyp;
	
	/**
	 * 标的ID	String(10)
	 */
	private String borrowId;
	
	/**
	 * 红包总金额	Number(16)
	 */
	private String tasteTolAmt;
	
	/**
	 * 总笔数	Number(5)
	 */
	private String totalNum;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"char_set","partner_id","MerBillNo","TransAmt",
			"MerFeeAmt","CapTyp","BorrowId","tasteTolAmt","TotalNum"};

	/**
	 * 构造器
	 */
	public FileExperCapModel(){
		super();
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbExperCapModel valid...");
	}
	
	public String getFirstFileContent(String transAmt, String merFeeAmt,
			String borrowId, String tasteTolAmt, String capTyp,
			String totalNum, String merBillNo) {
		this.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(transAmt));
		this.setMerFeeAmt(CbhbHelper.getBigDecimalMoneyUpper(merFeeAmt));
		this.setBorrowId(borrowId);
		this.setTasteTolAmt(CbhbHelper.getBigDecimalMoneyUpper(tasteTolAmt));
		this.setCapTyp(capTyp);
		this.setTotalNum(totalNum);
		this.setMerBillNo(merBillNo);
		return this.getFileContent();
	}
	
	/**
	 * 根据内容获取对象
	 * @author QianPengZhan
	 * @date 2017年3月14日
	 * @return
	 */
	public FileExperCapModel getModelByContent(String firstContent){
		FileExperCapModel model = new FileExperCapModel();
		String[] content = firstContent.split(StringUtils.VERTICAL_LINE);
		for (int i = 0; i < content.length; i++) {
			model.setPartnerId(content[0]);
			model.setMerBillNo(content[1]);
			model.setTasteTolAmt(content[2]);
			model.setTransAmt(content[3]);
			model.setTotalNum(content[4]);
		}
		return model;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(String merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	public String getCapTyp() {
		return capTyp;
	}

	public void setCapTyp(String capTyp) {
		this.capTyp = capTyp;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public String getTasteTolAmt() {
		return tasteTolAmt;
	}

	public void setTasteTolAmt(String tasteTolAmt) {
		this.tasteTolAmt = tasteTolAmt;
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
