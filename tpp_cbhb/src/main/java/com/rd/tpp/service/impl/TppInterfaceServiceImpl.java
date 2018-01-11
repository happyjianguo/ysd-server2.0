package com.rd.tpp.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import sun.misc.BASE64Decoder;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.model.CbhbBackInvestModel;
import com.rd.tpp.model.CbhbBatInvestCancleModel;
import com.rd.tpp.model.CbhbBindCardWebModel;
import com.rd.tpp.model.CbhbBindMobileNoModel;
import com.rd.tpp.model.CbhbBindPassModel;
import com.rd.tpp.model.CbhbCreateBidModel;
import com.rd.tpp.model.CbhbCreditRightsChangeModel;
import com.rd.tpp.model.CbhbDrawingsModel;
import com.rd.tpp.model.CbhbExistUserRegisterModel;
import com.rd.tpp.model.CbhbExperBonusModel;
import com.rd.tpp.model.CbhbExperCapModel;
import com.rd.tpp.model.CbhbFileLoanTransferModel;
import com.rd.tpp.model.CbhbFileReleaseModel;
import com.rd.tpp.model.CbhbFileRepaymentModel;
import com.rd.tpp.model.CbhbHelper;
import com.rd.tpp.model.CbhbInvestCancleModel;
import com.rd.tpp.model.CbhbMercRechargeModel;
import com.rd.tpp.model.CbhbMercWithdrawModel;
import com.rd.tpp.model.CbhbOpenChargeAccountModel;
import com.rd.tpp.model.CbhbQueryBalanceModel;
import com.rd.tpp.model.CbhbQueryChargeAccountModel;
import com.rd.tpp.model.CbhbQueryMerchantAcctsModel;
import com.rd.tpp.model.CbhbQueryMerchantTrans;
import com.rd.tpp.model.CbhbQueryTransStatModel;
import com.rd.tpp.model.CbhbQueryUserInfModel;
import com.rd.tpp.model.CbhbRealNameWebModel;
import com.rd.tpp.model.CbhbSendUapMsgModel;
import com.rd.tpp.model.CbhbUserBalTransferModel;
import com.rd.tpp.model.CbhbWebRechargeModel;
import com.rd.tpp.model.chk.CbhbChkBaseModel;
import com.rd.tpp.model.chk.CbhbExpChkModel;
import com.rd.tpp.model.chk.CbhbInvestChkModel;
import com.rd.tpp.model.chk.CbhbPpdChkModel;
import com.rd.tpp.model.chk.CbhbTransferChkModel;
import com.rd.tpp.model.chk.CbhbWdcChkModel;
import com.rd.tpp.model.file.FileBatInvestCancleDetailModel;
import com.rd.tpp.model.file.FileBatInvestCancleModel;
import com.rd.tpp.model.file.FileExistUserRegisterDetailModel;
import com.rd.tpp.model.file.FileExistUserRegisterModel;
import com.rd.tpp.model.file.FileExperCapDetailModel;
import com.rd.tpp.model.file.FileExperCapModel;
import com.rd.tpp.model.file.FileLoanTransferDetailModel;
import com.rd.tpp.model.file.FileLoanTransferModel;
import com.rd.tpp.model.file.FileReleaseDetailModel;
import com.rd.tpp.model.file.FileReleaseModel;
import com.rd.tpp.model.file.FileRepaymentDetailModel;
import com.rd.tpp.model.file.FileRepaymentModel;
import com.rd.tpp.model.file.FileResultQueryMerchantTrans;
import com.rd.tpp.model.req.BaseReq;
import com.rd.tpp.model.req.CbhbAddProjectReq;
import com.rd.tpp.model.req.CbhbBatInvestCancelReqDetailModel;
import com.rd.tpp.model.req.CbhbBatInvestCancelReqModel;
import com.rd.tpp.model.req.CbhbBatRegisterReqDetailModel;
import com.rd.tpp.model.req.CbhbBatRegisterReqModel;
import com.rd.tpp.model.req.CbhbCashReq;
import com.rd.tpp.model.req.CbhbCommonReq;
import com.rd.tpp.model.req.CbhbCorChargeAccountReq;
import com.rd.tpp.model.req.CbhbCreditAssignReq;
import com.rd.tpp.model.req.CbhbExperCapReqDetailModel;
import com.rd.tpp.model.req.CbhbExperCapReqModel;
import com.rd.tpp.model.req.CbhbFileLoanTransferReqDetailModel;
import com.rd.tpp.model.req.CbhbFileLoanTransferReqModel;
import com.rd.tpp.model.req.CbhbInvestCancleReq;
import com.rd.tpp.model.req.CbhbInvestReq;
import com.rd.tpp.model.req.CbhbLoanDetailReq;
import com.rd.tpp.model.req.CbhbLoanReq;
import com.rd.tpp.model.req.CbhbMercRechargeReq;
import com.rd.tpp.model.req.CbhbMercWithdrawReq;
import com.rd.tpp.model.req.CbhbQueryUserInfoReq;
import com.rd.tpp.model.req.CbhbRechargeOpenReq;
import com.rd.tpp.model.req.CbhbRechargeReq;
import com.rd.tpp.model.req.CbhbRepayReqDetailModel;
import com.rd.tpp.model.req.CbhbRepayReqModel;
import com.rd.tpp.model.req.CbhbTransStatReq;
import com.rd.tpp.model.req.CbhbUserBalTransferReq;
import com.rd.tpp.model.req.ExperBonusReq;
import com.rd.tpp.service.TppInterfaceService;
import com.rd.tpp.util.BigDecimalUtils;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.FileUtil;
import com.rd.tpp.util.FreeMarkerUtil;
import com.rd.tpp.util.ObjectUtils;
import com.rd.tpp.util.StringUtils;

/**
 * 接口实现类
 * 
 * @author WYW
 *
 */
public class TppInterfaceServiceImpl implements TppInterfaceService {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(TppInterfaceServiceImpl.class);

    @Override
	public Object tppRegister(CbhbCommonReq req) {
		final CbhbRealNameWebModel realNameWeb = new CbhbRealNameWebModel();
		req.flushModel(realNameWeb);
		realNameWeb.setMobileNo(StringUtils.isNull(req.getMobileNo()));
		// 设置默认值
		realNameWeb.defalutSet();
		// 验证参数的有效性
		realNameWeb.requestColumnValid();
		// 签名操作
		realNameWeb.sign();	
		//读取模板 生成跳转页面
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(realNameWeb), "register.html");
	}
	@Override
	public Object tppUpdateBankCard(CbhbCommonReq req) {
		final CbhbBindCardWebModel bindCardWebModel = new CbhbBindCardWebModel();
		req.flushModel(bindCardWebModel);
		bindCardWebModel.setMobileNo(StringUtils.isNull(req.getMobileNo()));
		bindCardWebModel.requestColumnValid();
		bindCardWebModel.sign();
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(bindCardWebModel), "bindCard.html");
	}
	@Override
	public Object tppUpdateMobileNo(CbhbCommonReq req) {
		final CbhbBindMobileNoModel bindMobileNoModel = new CbhbBindMobileNoModel();
		req.flushModel(bindMobileNoModel);
		bindMobileNoModel.setMobileNo(StringUtils.isNull(req.getMobileNo()));
		bindMobileNoModel.requestColumnValid();
		bindMobileNoModel.sign();
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(bindMobileNoModel), "updateMobile.html");
	}
	@Override
	public Object tppUpdatePayPass(CbhbCommonReq req) {
		final CbhbBindPassModel passModel = new CbhbBindPassModel();
		req.flushModel(passModel);
		passModel.requestColumnValid();
		passModel.sign();
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(passModel), "updatePayPass.html");
	}
	@Override
	public Object tppSendUapMsg(CbhbCommonReq req) {
		final CbhbSendUapMsgModel sendUapMsg = new CbhbSendUapMsgModel();
		req.flushModel(sendUapMsg);
		sendUapMsg.setMobileNo(StringUtils.isNull(req.getMobileNo()));
		LOGGER.info("渤海银行--获取投标动态口令的接口：手机号为" + sendUapMsg.getMobileNo());
		sendUapMsg.requestColumnValid();
		sendUapMsg.sign();
		CbhbSendUapMsgModel responseModel = (CbhbSendUapMsgModel) CbhbHelper.doSubmitWithValidCode(sendUapMsg);
		LOGGER.info("渤海银行--获取到投标动态短信识别码：" + responseModel.getRtnCod());
		return responseModel.getRtnCod();
	}
	@Override
	public CbhbOpenChargeAccountModel tppOpenChargeAccount(CbhbRechargeOpenReq req) {
		final CbhbOpenChargeAccountModel cbhbQuery = new CbhbOpenChargeAccountModel();
		req.flushModel(cbhbQuery);
		cbhbQuery.setTxnTyp(req.getTxnTyp());
		cbhbQuery.setAccountTyp(req.getAccountTyp());
		cbhbQuery.setAccountNo(req.getAccountNo());
		cbhbQuery.setAccountName(req.getAccountName());
		cbhbQuery.setAccountBk(req.getAccountBk());
		cbhbQuery.sign();
		CbhbOpenChargeAccountModel responseModel = (CbhbOpenChargeAccountModel) CbhbHelper.doSubmitWithValidCode(cbhbQuery);
		return responseModel;
	}
	/* ######################################## 华丽分割线  ##################################################*/
	@Override
	public Object tppRecharge(CbhbRechargeReq req) {
		final CbhbWebRechargeModel cbhbWebRechargeModel = new CbhbWebRechargeModel();
		req.flushModel(cbhbWebRechargeModel);
		cbhbWebRechargeModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getAmount()+""));
		if(req.getMerFeeAmt()>0){
			cbhbWebRechargeModel.setFeeType("1");//收取用户手续费
		}else{
			cbhbWebRechargeModel.setFeeType("0");//不收取
		}
		cbhbWebRechargeModel.setMerFeeAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getMerFeeAmt()+""));
		cbhbWebRechargeModel.requestColumnValid();
		cbhbWebRechargeModel.sign();
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(cbhbWebRechargeModel), "recharge.html");
	}
	@Override
	public Object tppCash(CbhbCashReq req) {
		final CbhbDrawingsModel drawingsModel = new CbhbDrawingsModel();
		req.flushModel(drawingsModel);
		String transAmt = CbhbHelper.getBigDecimalMoneyUpper(req.getAmount()+"");
		String servFee = CbhbHelper.getBigDecimalMoneyUpper(req.getServFee()+""); // 商户收取用户手续费
		drawingsModel.setTransAmt(transAmt);
		if(req.getServFee()>0){
			drawingsModel.setFeeType("1"); // 垫付就是不收取用户手续费 为0 不垫付就是收取 为 1
		}else{
			drawingsModel.setFeeType("0"); // 垫付就是不收取用户手续费 为0 不垫付就是收取 为 1
		}
		drawingsModel.setMerFeeAmt(servFee);
		drawingsModel.requestColumnValid();
		drawingsModel.sign();
		return FreeMarkerUtil.getInstance().getContent(ObjectUtils.transBean2Map(drawingsModel), "cash.html");
	}
	@Override
	public Object tppAddProject(CbhbAddProjectReq req) {
		final CbhbCreateBidModel cbhbCreateBidModel = new CbhbCreateBidModel();
		req.flushModel(cbhbCreateBidModel);
		cbhbCreateBidModel.setBorrowId(req.getBorrowId());
		cbhbCreateBidModel.setBorrowTyp(req.getBorrowTyp());
		cbhbCreateBidModel.setAccountName(req.getAccountName());
		cbhbCreateBidModel.setBorrowerAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getBorrowerAmt()+""));
		// 标的预期收益金额或预期收益率（百分比形式不带百分号，如5%送5）
		cbhbCreateBidModel.setBorrowerInterestAmt(CbhbHelper.checkNumber(req.getBorrowerInterestAmt()+""));//
		cbhbCreateBidModel.setBorrCustId(req.getBorrCustId());
		cbhbCreateBidModel.setGuaranteeNo(req.getGuaranteeNo());
		cbhbCreateBidModel.setBorrowerStartDate(DateUtils.formatDate(req.getBorrowerStartDate(), "yyyyMMdd"));
		cbhbCreateBidModel.setBorrowerEndDate(DateUtils.formatDate(req.getBorrowerEndDate(), "yyyyMMdd"));
		cbhbCreateBidModel.setBorrowerRepayDate(DateUtils.formatDate(req.getBorrowerRepayDate(), "yyyyMMdd"));
		cbhbCreateBidModel.setReleaseType(CbhbConstant.STRING_ZERO); // 文件方式
		cbhbCreateBidModel.setInvestDateType(req.getInvestDateType());
		cbhbCreateBidModel.setInvestPeriod(req.getInvestPeriod());
		cbhbCreateBidModel.setBorrowerDetails(req.getBorrowerDetails());
		cbhbCreateBidModel.requestColumnValid();
		cbhbCreateBidModel.sign();
		CbhbCreateBidModel responseModel = (CbhbCreateBidModel) CbhbHelper.doSubmitWithValidCode(cbhbCreateBidModel);
		LOGGER.info("渤海银行--建标接口返回结果:" + responseModel.getRespCode());
		return cbhbCreateBidModel;
	}
	@Override
	public CbhbBackInvestModel tppAddTender(CbhbInvestReq  req) {
		final CbhbBackInvestModel cbhbBackInvestModel = new CbhbBackInvestModel();
		req.flushModel(cbhbBackInvestModel);
		cbhbBackInvestModel.setBusiType(req.getBusiType());
		cbhbBackInvestModel.setPlaCustId(req.getPlaCustId());
		cbhbBackInvestModel.setSmsCode(req.getSmsCode());
		cbhbBackInvestModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbBackInvestModel.setMarketAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getMarketAmt()+""));
		cbhbBackInvestModel.setBorrowId(req.getBorrowId());
		cbhbBackInvestModel.sign();
		CbhbBackInvestModel responseModel = (CbhbBackInvestModel) CbhbHelper.doSubmitWithValidCode(cbhbBackInvestModel);
		LOGGER.info("渤海银行--投资接口返回结果" + responseModel.getRespCode());
		return responseModel;
	}
	@Override
	public CbhbInvestCancleModel tppInvestCancle(CbhbInvestCancleReq req) {
		final CbhbInvestCancleModel investCancleModel = new CbhbInvestCancleModel();
		req.flushModel(investCancleModel);
		investCancleModel.setOldTransId(req.getOldTransId());
		investCancleModel.setSmsCode(req.getSmsCode());
		investCancleModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		investCancleModel.setFreezeId(req.getFreezeId());
		investCancleModel.requestColumnValid();
		investCancleModel.sign();
		CbhbInvestCancleModel responseModel = (CbhbInvestCancleModel) CbhbHelper.doSubmitWithValidCode(investCancleModel);
		return responseModel;
	}
	@Override
	public CbhbBatInvestCancleModel tppBatInvestCancle(CbhbBatInvestCancelReqModel req) {
		CbhbBatInvestCancleModel cancleModel = new CbhbBatInvestCancleModel();
		req.flushModel(cancleModel);
		// 1-获取参数
		List<CbhbBatInvestCancelReqDetailModel> reqDetail = req.getBatInvestCancelDetailList();
		String totalNum = reqDetail.size() + StringUtils.EMPTY;
		StringBuffer fileText =  new StringBuffer();
		// 2-获取第一行的内容
		FileBatInvestCancleModel fileBatInvestCancleModel = new FileBatInvestCancleModel();
		String fileContent = fileBatInvestCancleModel.getFirstFileContent(cancleModel.getBatchNo(), totalNum);
		LOGGER.info("fileContent={},totalNum={}" + fileContent + fileBatInvestCancleModel.getTotalNum());
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		for (int i = 0; i < reqDetail.size(); i++) {
			CbhbBatInvestCancelReqDetailModel detail = reqDetail.get(i);
			FileBatInvestCancleDetailModel detailModel = new FileBatInvestCancleDetailModel();
			detailModel.setId((i + 1) + "");
			detailModel.setOldTransId(detail.getOldTransId());
			detailModel.setPlaCustId(detail.getPlaCustId());
			detailModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(detail.getTransAmt() + ""));
			detailModel.setFreezeId(detail.getFreezeId());
			detailContent.append(detailModel.getFileContent());
		}
		fileText.append(fileContent).append(detailContent.toString());
		// 3-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = cancleModel.getFileNamePath();
		String okPath = cancleModel.getOKFileNamePath();
		String fileName = cancleModel.getFileName();
		String okFileName = cancleModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, fileText.toString(), fileName, okFileName);
		// 4-还款实时回调请求
		CbhbBatInvestCancleModel responseModel = null;
		if (uploadFlag) {
			cancleModel.sign();
			responseModel = (CbhbBatInvestCancleModel) CbhbHelper.doSubmitWithValidCode(cancleModel);
			LOGGER.info("渤海银行--批量撤销接口返回结果：{}" + responseModel.getRespCode());
		}
		return responseModel;
	}
	@Override
	public CbhbFileReleaseModel tppLoan(CbhbLoanReq req) {
		// 1-获取参数
		CbhbFileReleaseModel releaseModel = new CbhbFileReleaseModel();
		req.flushModel(releaseModel);
		String borrowId = StringUtils.isNull(req.getBorrowId()); // 标ID
		String transAmt = StringUtils.isNull(req.getTransAmt()); // 实际满标金额
		String feeAmt =   StringUtils.isNull(req.getFeeAmt()); // 借款人手续费（借款管理费）
		String borrowerAmt = StringUtils.isNull(req.getBorrowerAmt()); // 标的金额
		String borrCustId = StringUtils.isNull(req.getBorrCustId()); // 借款人存管账号
		List<CbhbLoanDetailReq> detailList  = req.getDetailList();
		String totalNum = detailList.size() + StringUtils.EMPTY;
		// 2-获取第一行的内容
		FileReleaseModel fileReleaseModel = new FileReleaseModel();
		String fileContent = fileReleaseModel.getFirstFileContent(transAmt,feeAmt, borrowId, borrowerAmt, borrCustId, totalNum, releaseModel.getMerBillNo());
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		CbhbLoanDetailReq detailReq = null;
		for (int i = 0; i < detailList.size(); i++) {
				detailReq = detailList.get(i);
				FileReleaseDetailModel detailModel = new FileReleaseDetailModel();
				detailModel.setId((i+1)+"");
				detailModel.setPlaCustId(detailReq.getPlaCustId());
				detailModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(detailReq.getTransAmt()+""));
				detailModel.setFreezeId(detailReq.getFreezeId());
				detailContent.append(detailModel.getFileContent());
		}
		String txtContent = fileContent + detailContent.toString();
		// 4-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = releaseModel.getFileNamePath();
		String okPath = releaseModel.getOKFileNamePath();
		String fileName = releaseModel.getFileName();
		String okFileName = releaseModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, txtContent, fileName, okFileName);
		// 5-放款实时回调请求
		CbhbFileReleaseModel repsonseModel = null;
		if (uploadFlag) {
			releaseModel.setBorrowId(borrowId);
			releaseModel.requestColumnValid();
			releaseModel.sign();
			repsonseModel = (CbhbFileReleaseModel) CbhbHelper.doSubmit(releaseModel);
		}
		return repsonseModel;
	}
	public CbhbFileRepaymentModel tppRepayment(CbhbRepayReqModel reqModel) {
		CbhbFileRepaymentModel repayModel = new CbhbFileRepaymentModel();
		reqModel.flushModel(repayModel);
		// 1-获取明细参数
		List<CbhbRepayReqDetailModel> repDetail=reqModel.getRepayDetailList();
		double transAmt = reqModel.getFeeAmt();
		for(CbhbRepayReqDetailModel detaiModel:repDetail){
			transAmt = BigDecimalUtils.add(BigDecimal.valueOf(transAmt),BigDecimal.valueOf(detaiModel.getInterest())
					           ,BigDecimal.valueOf(detaiModel.getTransAmt())).doubleValue();
		}
		String totalNum = repDetail.size() + StringUtils.EMPTY;
		StringBuffer fileText =  new StringBuffer();
		// 2-获取第一行的内容
		FileRepaymentModel fileRepaymentModel = new FileRepaymentModel();
		String fileContent = fileRepaymentModel.getFirstFileContent(transAmt+"",
				reqModel.getFeeAmt()+"", reqModel.getBorrowId()+"", reqModel.getBorrowerAmt()+"", reqModel.getBorrCustId(),
				totalNum+"", repayModel.getMerBillNo());
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		for (int i = 0; i < repDetail.size(); i++) {
			FileRepaymentDetailModel detailModel = new FileRepaymentDetailModel();
			detailModel.setId((i+1)+"");
			detailModel.setPlaCustId(repDetail.get(i).getPlaCustId());
			detailModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(repDetail.get(i).getTransAmt()+""));
			detailModel.setInterest(CbhbHelper.getBigDecimalMoneyUpper(repDetail.get(i).getInterest()+""));
			detailModel.setInvesFee(CbhbHelper.getBigDecimalMoneyUpper(repDetail.get(i).getInves_fee()+""));
			detailContent.append(detailModel.getFileContent());
		}
		fileText.append(fileContent).append(detailContent.toString());
		// 3-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = repayModel.getFileNamePath();
		String okPath = repayModel.getOKFileNamePath();
		String fileName = repayModel.getFileName();
		String okFileName = repayModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, fileText.toString(), fileName, okFileName);
		// 4-还款实时回调请求
		CbhbFileRepaymentModel responseModel = null;
		if (uploadFlag) {
			repayModel.setBorrowId(reqModel.getBorrowId());
			repayModel.setRepayTyp(reqModel.getRepayTyp());
			repayModel.setRepayInstTot(reqModel.getRepay_inst_tot());
			repayModel.setRepayInstCur(reqModel.getRepay_inst_cur());
			repayModel.sign();
			responseModel = (CbhbFileRepaymentModel) CbhbHelper.doSubmitWithValidCode(repayModel);
		}
		return responseModel;
	}
	@Override
	public CbhbExperBonusModel experBonus(ExperBonusReq req) {
		final CbhbExperBonusModel cbhbExperBonusModel = new CbhbExperBonusModel();
		req.flushModel(cbhbExperBonusModel);
		cbhbExperBonusModel.setPlaCustId(req.getPlaCustId());
		cbhbExperBonusModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbExperBonusModel.setMerFeeAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getMerFeeAmt()+""));
		cbhbExperBonusModel.requestColumnValid();
		cbhbExperBonusModel.sign();
		CbhbExperBonusModel responseModel = (CbhbExperBonusModel) CbhbHelper.doSubmitWithValidCode(cbhbExperBonusModel);
		LOGGER.error("渤海银行--实时红包回调:" + responseModel.getRespCode());
		return responseModel;
	}
	@Override
	public CbhbExperCapModel tppExperCap(CbhbExperCapReqModel experCapReq) {
		final CbhbExperCapModel cbhbExperCapModel = new CbhbExperCapModel();
		// 1-获取参数
		experCapReq.flushModel(cbhbExperCapModel);
		List<CbhbExperCapReqDetailModel> detailList = experCapReq.getDetailList();
		// 2-获取第一行的内容
		double transAmt =0.00;//收益汇总
		double merFeeAmt = 0.00;//收取的手续费
		double tasteTolAmt = 0.00;
		for(CbhbExperCapReqDetailModel detail:detailList){
			transAmt = BigDecimalUtils.add(BigDecimal.valueOf(transAmt),BigDecimal.valueOf(detail.getInterest())).doubleValue();
			merFeeAmt =  BigDecimalUtils.add(BigDecimal.valueOf(merFeeAmt),BigDecimal.valueOf(detail.getInves_fee())).doubleValue();
			tasteTolAmt = BigDecimalUtils.add(BigDecimal.valueOf(tasteTolAmt),BigDecimal.valueOf(detail.getTasteAmt())).doubleValue();
		}
		FileExperCapModel experCapModel = new FileExperCapModel();
		String fileContent = experCapModel.getFirstFileContent(transAmt+"",
				merFeeAmt+"", experCapReq.getBorrowId()+"", tasteTolAmt+"", experCapReq.getCapTyp(), detailList.size()+"", cbhbExperCapModel.getMerBillNo());
		LOGGER.info("渤海银行--红包体验金 fileContent={},totalNum={}" + fileContent+ experCapModel.getTotalNum());
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		FileExperCapDetailModel detailModel = new FileExperCapDetailModel();
		for (int i = 0; i < detailList.size(); i++) {
			detailModel.setId(detailList.get(i).getId());
			detailModel.setPlaCustId(detailList.get(i).getPlaCustId());
			detailModel.setTasteAmt(CbhbHelper.getBigDecimalMoneyUpper(detailList.get(i).getTasteAmt()+""));
			detailModel.setInterest(CbhbHelper.getBigDecimalMoneyUpper(detailList.get(i).getInterest()+""));
			detailModel.setInvesFee(CbhbHelper.getBigDecimalMoneyUpper(detailList.get(i).getInves_fee()+""));
			detailContent.append(detailModel.getFileContent());
		}
		StringBuffer fileText = new StringBuffer();
		fileText.append(fileContent).append(detailContent.toString());
		// 3-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = cbhbExperCapModel.getFileNamePath();
		String okPath = cbhbExperCapModel.getOKFileNamePath();
		String fileName = cbhbExperCapModel.getFileName();
		String okFileName = cbhbExperCapModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, fileText.toString(), fileName, okFileName);
		// 4-红包体验金实时回调请求
		CbhbExperCapModel responseModel = null;
		if (uploadFlag) {
			cbhbExperCapModel.sign();
			responseModel = (CbhbExperCapModel) CbhbHelper.doSubmitWithValidCode(cbhbExperCapModel);
			LOGGER.info("渤海银行--红包体验金接口返回结果：" + responseModel.getRespCode());
		}
		return responseModel;
	}
	@Override
	public CbhbMercRechargeModel tppMerchantRecharge(CbhbMercRechargeReq req) {
		final CbhbMercRechargeModel cbhbMercRechargeModel = new CbhbMercRechargeModel();
		req.flushModel(cbhbMercRechargeModel);
		cbhbMercRechargeModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbMercRechargeModel.setMerAccTyp(req.getMerAccTyp());
		cbhbMercRechargeModel.sign();
		CbhbMercRechargeModel responseModel = (CbhbMercRechargeModel) CbhbHelper
				.doSubmitWithValidCode(cbhbMercRechargeModel);
		LOGGER.info("渤海银行--商户充值返回结果：{}" + responseModel.getRespCode());
		return responseModel;
	}
	@Override
	public CbhbMercWithdrawModel tppMerchantCash(CbhbMercWithdrawReq req) {
		final CbhbMercWithdrawModel cbhbMercWithdrawModel = new CbhbMercWithdrawModel();
		req.flushModel(cbhbMercWithdrawModel);
		cbhbMercWithdrawModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbMercWithdrawModel.sign();
		CbhbMercWithdrawModel responseModel = (CbhbMercWithdrawModel) CbhbHelper.doSubmitWithValidCode(cbhbMercWithdrawModel);
		LOGGER.info("渤海银行--商户取现返回结果：{}" + responseModel.getRespCode());
		return responseModel;
	}
	@Override
	public CbhbCreditRightsChangeModel tppCreditAssign(CbhbCreditAssignReq req) {
		final CbhbCreditRightsChangeModel cbhbCreditModel = new CbhbCreditRightsChangeModel();
		req.flushModel(cbhbCreditModel);
		// 转让金额
		cbhbCreditModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbCreditModel.setOldTransId(req.getOldTransId());
		// 商户收取用户手续费
		cbhbCreditModel.setMerFeeAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getMerFeeAmt()+""));
		// 手续费模式，0 受让人出，1 转让人出
		cbhbCreditModel.setFeeType(req.getFeeType());
		cbhbCreditModel.setOutAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getOutAmt()+""));
		cbhbCreditModel.setInAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getInAmt()+""));
		// 出账客户号，受让人客户号
		cbhbCreditModel.setOutCustId(req.getOutCustId());
		// 入账客户号，转让人客户号
		cbhbCreditModel.setInCustId(req.getInCustId());
		cbhbCreditModel.setSmsCode(req.getSmsCode());
		cbhbCreditModel.setBorrowId(req.getBorrowId());
		cbhbCreditModel.sign();
		CbhbCreditRightsChangeModel responseModel = (CbhbCreditRightsChangeModel) CbhbHelper.doSubmitWithValidCode(cbhbCreditModel);
		LOGGER.info("渤海银行--债权转让接口返回结果" + responseModel.getRespCode());
		return responseModel;
	}
	/* ######################################## 华丽分割线  ##################################################*/
	@Override
	public CbhbQueryUserInfModel queryUserInf(CbhbQueryUserInfoReq req) {
		final CbhbQueryUserInfModel cbhbQueryUserInfModel = new CbhbQueryUserInfModel();
		req.flushModel(cbhbQueryUserInfModel);
		cbhbQueryUserInfModel.setMobileNo(req.getMobileNo());
		cbhbQueryUserInfModel.setPlaCustId(req.getPlaCustId());
		cbhbQueryUserInfModel.sign();
		BASE64Decoder decoder = new BASE64Decoder();
		CbhbQueryUserInfModel responseModel = (CbhbQueryUserInfModel) CbhbHelper.doSubmitWithValidCode(cbhbQueryUserInfModel);
		try {
			responseModel.setRespData(new String(decoder.decodeBuffer(responseModel.getRespData()), "GB2312"));
		} catch(Exception e) {
			LOGGER.info("数据解码失败");
		}
		responseModel.setUserlist(CbhbHelper.xmlToMapQueryUserInf(responseModel.getRespData()));
		return responseModel;
	}
	@Override
	public CbhbQueryBalanceModel tppQueryBalance(BaseReq req) {
		final CbhbQueryBalanceModel cbhbQueryBalanceModel = new CbhbQueryBalanceModel();
		req.flushModel(cbhbQueryBalanceModel);
		cbhbQueryBalanceModel.setPlaCustId(req.getPlaCustId());
		cbhbQueryBalanceModel.sign();
		CbhbQueryBalanceModel responseModel = (CbhbQueryBalanceModel) CbhbHelper.doSubmitWithValidCode(cbhbQueryBalanceModel);
		return responseModel;
	}
	@Override
	public CbhbQueryMerchantAcctsModel queryMerchantAccts() {
		final CbhbQueryMerchantAcctsModel model = new CbhbQueryMerchantAcctsModel();
		model.requestColumnValid();
		model.sign();
		CbhbQueryMerchantAcctsModel responseModel = (CbhbQueryMerchantAcctsModel) CbhbHelper.doSubmitWithValidCode(model);
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			responseModel.setRespData(new String(decoder.decodeBuffer(responseModel.getRespData())));
			LOGGER.error("渤海银行--商户账户查询回调RespData--XML:" + responseModel.getRespData());
			responseModel.setAcctsList(CbhbHelper.xmlToMap(responseModel.getRespData()));
		} catch (IOException e) {
			LOGGER.error("渤海银行--商户账户查询回调RespData错误");
		}
		return responseModel;
	}
	@Override
	public CbhbQueryTransStatModel tppQueryTransStat(CbhbTransStatReq req) {
		final CbhbQueryTransStatModel cbhbQueryTransStatModel = new CbhbQueryTransStatModel();
		req.flushModel(cbhbQueryTransStatModel);
		cbhbQueryTransStatModel.setMerBillNo(req.getMerBillNo());
		cbhbQueryTransStatModel.setQueryTransType(req.getQueryTransType());
		cbhbQueryTransStatModel.sign();
		CbhbQueryTransStatModel responseModel = (CbhbQueryTransStatModel) CbhbHelper.doSubmit(cbhbQueryTransStatModel);
		return responseModel;
	}
	@Override
	public List<CbhbInvestChkModel> tppInvestChk(Date searchTime) {
//		String time = StringUtils.isNull(DateUtils.formatDate(queryDate, "yyyyMMdd"));// 对账查询日期时间
//		Date searchTime = DateUtils.valueOf(time);
		List<CbhbInvestChkModel> chkList = new ArrayList<CbhbInvestChkModel>();
		CbhbInvestChkModel investChkModel = new CbhbInvestChkModel();
		String fileName = investChkModel.getResultFileName(searchTime);
		boolean downFlag = FileUtil.downloadResultFile(
				investChkModel.getReSultFilePath(searchTime),
				investChkModel.getRemotePath(searchTime), fileName);
		LOGGER.info("下载是否成功：{}", downFlag);
		if (downFlag) {
			String result = FileUtil.readTxtFile(investChkModel.getReSultFilePath(searchTime, fileName));
			LOGGER.info("读取的内容：{}", result);
			if (StringUtils.isNotBlank(result.toString())) {
				String[] line = result.split(",");
				for (int i = 0; i < line.length; i++) {
					String str = line[i];
					String[] column = str.split(StringUtils.VERTICAL_LINE);
					CbhbInvestChkModel newInvestChkModel = new CbhbInvestChkModel();
					for (int j = 0; j < column.length; j++) {
						newInvestChkModel.setOrdNo(column[0]);
						newInvestChkModel.setMercId(column[1]);
						newInvestChkModel.setPlaCustId(column[2]);
						newInvestChkModel.setTransAmt(column[3]);
						newInvestChkModel.setBorrowId(column[4]);
						newInvestChkModel.setCreDt(column[5]);
						newInvestChkModel.setCreTm(column[6]);
						newInvestChkModel.setOrdSts(column[7]);
						newInvestChkModel.setMerBillNo(column[8]);
					}
					chkList.add(newInvestChkModel);
				}
			}
		}
		return chkList;
	}
	@Override
	public List<CbhbPpdChkModel> tppPpdChk(Date queryDate) {
		String time = StringUtils.isNull(DateUtils.formatDate(queryDate, "yyyyMMdd")); // 对账查询日期时间
		Date searchTime = DateUtils.valueOf(time);
		List<CbhbPpdChkModel> chkList = new ArrayList<CbhbPpdChkModel>();
		CbhbPpdChkModel ppdChkModel = new CbhbPpdChkModel();
		String fileName = ppdChkModel.getResultFileName(searchTime);
		boolean downFlag = FileUtil.downloadResultFile(
				ppdChkModel.getReSultFilePath(searchTime),
				ppdChkModel.getRemotePath(searchTime), fileName);
		LOGGER.info("下载是否成功：" + downFlag);
		if (downFlag) {
			String result = FileUtil.readTxtFile(ppdChkModel.getReSultFilePath(searchTime, fileName));
			LOGGER.info("充值对账文件读取的内容：" + result);
			if (StringUtils.isNotBlank(result.toString())) {
				String[] line = result.split(",");
				for (int i = 0; i < line.length; i++) {
					String str = line[i];
					String[] column = str.split(StringUtils.VERTICAL_LINE);
					CbhbPpdChkModel newPpdChkModel = new CbhbPpdChkModel();
					for (int j = 0; j < column.length; j++) {
						newPpdChkModel.setOrdNo(column[0]);
						newPpdChkModel.setCreDt(column[1]);
						newPpdChkModel.setTransAmt(column[2]);
						newPpdChkModel.setFeeAmt(column[3]);
						newPpdChkModel.setPlaCustId(column[4]);
						newPpdChkModel.setMerBillNo(column[5]);
						newPpdChkModel.setChargeCorg(column[6]);
					}
					chkList.add(newPpdChkModel);
				}
			}
		}
		return chkList;
	}
	@Override
	public List<CbhbWdcChkModel> tppWdcChk(Date queryDate) {
		String time = StringUtils.isNull(DateUtils.formatDate(queryDate, "yyyyMMdd"));// 对账查询日期时间
		Date searchTime = DateUtils.valueOf(time);
		List<CbhbWdcChkModel> chkList = new ArrayList<CbhbWdcChkModel>();
		CbhbWdcChkModel wdcChkModel = new CbhbWdcChkModel();
		String fileName = wdcChkModel.getResultFileName(searchTime);
		boolean downFlag = FileUtil.downloadResultFile(
				wdcChkModel.getReSultFilePath(searchTime),
				wdcChkModel.getRemotePath(searchTime), fileName);
		LOGGER.info("下载是否成功：{}" + downFlag);
		if (downFlag) {
			String result = FileUtil.readTxtFile(wdcChkModel.getReSultFilePath(searchTime, fileName));
			LOGGER.info("读取的内容：{}" + result);
			if (StringUtils.isNotBlank(result.toString())) {
				String[] line = result.split(",");
				for (int i = 0; i < line.length; i++) {
					String str = line[i];
					String[] column = str.split(StringUtils.VERTICAL_LINE, -1);
					CbhbWdcChkModel newWdcChkModel = new CbhbWdcChkModel();
					for (int j = 0; j < column.length; j++) {
						newWdcChkModel.setOrdNo(column[0]);
						newWdcChkModel.setMerBillNo(column[1]);
						newWdcChkModel.setCreDt(column[2]);
						newWdcChkModel.setTransAmt(column[3]);
						newWdcChkModel.setFeeAmt(column[4]);
						newWdcChkModel.setPlaCustId(column[5]);
						newWdcChkModel.setWdcSts(column[6]); // 提现状态
						newWdcChkModel.setFalRsn(column[7]); // 失败原因
					}
					chkList.add(newWdcChkModel);
				}
			}
		}
		return chkList;
	}
	@Override
	public List<CbhbExpChkModel> tppExpChk(Date queryDate) {
		String time = StringUtils.isNull(DateUtils.formatDate(queryDate, "yyyyMMdd"));// 对账查询日期时间
		Date searchTime = DateUtils.valueOf(time);
		List<CbhbExpChkModel> chkList = new ArrayList<CbhbExpChkModel>();
		CbhbExpChkModel expChkModel = new CbhbExpChkModel();
		String fileName = expChkModel.getResultFileName(searchTime);
		boolean downFlag = FileUtil.downloadResultFile(
				expChkModel.getReSultFilePath(searchTime),
				expChkModel.getRemotePath(searchTime), fileName);
		LOGGER.info("下载是否成功：{}" + downFlag);
		if (downFlag) {
			String result = FileUtil.readTxtFile(expChkModel.getReSultFilePath(searchTime, fileName));
			LOGGER.info("读取的内容：{}" + result);
			if (StringUtils.isNotBlank(result.toString())) {
				String[] line = result.split(",");
				for (int i = 0; i < line.length; i++) {
					String str = line[i];
					String[] column = str.split(StringUtils.VERTICAL_LINE);
					CbhbExpChkModel newExpChkModel = new CbhbExpChkModel();
					for (int j = 0; j < column.length; j++) {
						newExpChkModel.setTransId(column[0]);
						newExpChkModel.setMerBillNo(column[1]);
						newExpChkModel.setCreDt(column[2]);
						newExpChkModel.setTransAmt(column[3]);
						newExpChkModel.setPlaCustId(column[4]);
					}
					chkList.add(newExpChkModel);
				}
			}
		}
		return chkList;
	}
	 @Override
     public List<FileResultQueryMerchantTrans> tppQueryMerchantTrans(CbhbQueryMerchantTrans req){
    	//第一步 验证参数有效性
    	req.requestColumnValid();
    	req.sign();//签名
    	CbhbQueryMerchantTrans responseModel = null;
		responseModel = (CbhbQueryMerchantTrans) CbhbHelper.doSubmitWithValidCode(req);
		//获取文件名称
		CbhbChkBaseModel baseChk=new CbhbChkBaseModel();
		Date dateNow =DateUtils.getNow();
		String fileName =responseModel.getFileName();
		//结果集合
		List<FileResultQueryMerchantTrans>  resultList = null;
		if(StringUtils.isNotBlank(fileName)){
			//下载结果文件 封装结果
			boolean downFlag = FileUtil.downloadResultFile(
					baseChk.getReSultFilePath(dateNow),
					baseChk.getRemotePath(DateUtils.getNow()), responseModel.getFileName());
			if (downFlag){
				String result = FileUtil.readTxtFile(baseChk.getReSultFilePath(dateNow, fileName));	
				//解析结果文件
				if (StringUtils.isNotBlank(result.toString())) {
					resultList = new ArrayList<FileResultQueryMerchantTrans>();
					String[] line = result.split(",");
					String str = null;
					for (int i = 0; i < line.length; i++) {
						str = line[i];
						String[] column = str.split(StringUtils.VERTICAL_LINE);
						FileResultQueryMerchantTrans resultModel = new FileResultQueryMerchantTrans();
						if(column.length>=4){
							for (int j = 0; j < column.length; j++) {
								resultModel.setTransId(StringUtils.isNull(column[0]));
								resultModel.setCreDt(StringUtils.isNull(column[1]));
								resultModel.setAcTyp(StringUtils.isNull(column[2]));
								resultModel.setTransAmt(CbhbHelper.getBigDecimalMoneyLow(StringUtils.isNull(column[3])).doubleValue());
								if(column.length>=5){
									resultModel.setTransDesc(StringUtils.isNull(column[4]));
								}
							}	
						}
						resultList.add(resultModel);
					}
				}
			}
		}
		return resultList; 
     }
	@Override
	public CbhbQueryChargeAccountModel tppQueryChargeAccount(CbhbCorChargeAccountReq req) {
			final CbhbQueryChargeAccountModel cbhbQuery = new CbhbQueryChargeAccountModel();
			cbhbQuery.setAccountTyp(req.getAccountTyp());
			cbhbQuery.setAccountNo(req.getAccountNo());
			cbhbQuery.sign();
			CbhbQueryChargeAccountModel responseModel = (CbhbQueryChargeAccountModel) CbhbHelper.doSubmitWithValidCode(cbhbQuery);
			return responseModel;
	}
	/* ######################################## 华丽分割线  ##################################################*/
	@Override
	public CbhbExistUserRegisterModel tppExperRealeName(CbhbBatRegisterReqModel req) {
		final CbhbExistUserRegisterModel registerModel = new CbhbExistUserRegisterModel();
		req.flushModel(registerModel);
		if(registerModel.getMerBillNo().length()>0){
			registerModel.setBatchNo(registerModel.getMerBillNo().substring(
					registerModel.getMerBillNo().length() - 10,
					registerModel.getMerBillNo().length()));
		}else{
			registerModel.setBatchNo(registerModel.getMerBillNo());
		}
		// 1-获取参数
		List<CbhbBatRegisterReqDetailModel> userList = req.getUserList();
		String totalNum = userList.size() + StringUtils.EMPTY;
		// 2-获取第一行的内容
		FileExistUserRegisterModel registerFileModel = new FileExistUserRegisterModel();
		String fileContent = registerFileModel.getFirstFileContent(registerModel.getBatchNo(), totalNum);
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		FileExistUserRegisterDetailModel detailModel = new FileExistUserRegisterDetailModel();
		for (int i = 0; i < userList.size(); i++) {
			detailModel.setIdentType(userList.get(i).getIdentType());
			detailModel.setIdentNo(userList.get(i).getIdentNo());
			detailModel.setUsrName(userList.get(i).getUsrName());
			detailModel.setMobileNo(userList.get(i).getMobileNo());
			detailModel.setOpenBankId(userList.get(i).getOpenBankId());
			detailModel.setOpenAcctId(userList.get(i).getOpenAcctId());
			detailContent.append(detailModel.getFileContent());
		}
		StringBuffer fileTxt = new StringBuffer();
		fileTxt.append(fileContent).append(detailContent);
		// 3-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = registerModel.getFileNamePath();
		String okPath = registerModel.getOKFileNamePath();
		String fileName = registerModel.getFileName();
		String okFileName = registerModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, fileTxt.toString(),fileName, okFileName);
		// 4-批量注册实时回调请求
		CbhbExistUserRegisterModel responseModel = null;
		if (uploadFlag) {
			registerModel.sign();
			responseModel = (CbhbExistUserRegisterModel) CbhbHelper.doSubmitWithValidCode(registerModel);
			LOGGER.info("渤海银行--批量注册接口返回结果：{}" + responseModel.getRespCode());
		}
		return responseModel;
	}
	@Override
	public CbhbUserBalTransferModel tppUserBalTransfer(CbhbUserBalTransferReq req) {
		final CbhbUserBalTransferModel cbhbModel = new CbhbUserBalTransferModel();
		cbhbModel.setPlaCustId(req.getPlaCustId());
		cbhbModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(req.getTransAmt()+""));
		cbhbModel.sign();
		CbhbUserBalTransferModel responseModel = (CbhbUserBalTransferModel) CbhbHelper.doSubmitWithValidCode(cbhbModel);
		return responseModel;
	}
	@Override
	public List<CbhbTransferChkModel> tppTransferChk(Date queryDate) {
		String time = StringUtils.isNull(DateUtils.formatDate(queryDate, "yyyyMMdd")); // 对账查询日期时间
		Date searchTime = DateUtils.valueOf(time);
		List<CbhbTransferChkModel> chkList = new ArrayList<CbhbTransferChkModel>();
		CbhbTransferChkModel transferChkModel = new CbhbTransferChkModel();
		String fileName = transferChkModel.getResultFileName(searchTime);
		boolean downFlag = FileUtil.downloadResultFile(
				transferChkModel.getReSultFilePath(searchTime),
				transferChkModel.getRemotePath(searchTime), fileName);
		LOGGER.info("下载是否成功：" + downFlag);
		if (downFlag) {
			String result = FileUtil.readTxtFile(transferChkModel.getReSultFilePath(searchTime, fileName));
			LOGGER.info("资金转移对账文件读取的内容：" + result);
			if (StringUtils.isNotBlank(result.toString())) {
				String[] line = result.split(",");
				for (int i = 0; i < line.length; i++) {
					String str = line[i];
					String[] column = str.split(StringUtils.VERTICAL_LINE);
					CbhbTransferChkModel newTransferChkModel = new CbhbTransferChkModel();
					for (int j = 0; j < column.length; j++) {
						newTransferChkModel.setTransId(column[0]);
						newTransferChkModel.setMerBillNo(column[1]);
						newTransferChkModel.setCreDt(column[2]);
						newTransferChkModel.setTransAmt(column[3]);
						newTransferChkModel.setPlaCustId(column[4]);
					}
					chkList.add(newTransferChkModel);
				}
			}
		}
		return chkList;
	}
	
	/**
	 * 渤海银行-- 存量标转移
	 */
	@Override
	public CbhbFileLoanTransferModel tppFileLoanTransfer(CbhbFileLoanTransferReqModel reqModel) {
		CbhbFileLoanTransferModel transferModel = new CbhbFileLoanTransferModel();
		// 1-获取参数
		List<CbhbFileLoanTransferReqDetailModel> reqDetail = reqModel.getTransferDetailList();
		StringBuffer fileText =  new StringBuffer();
		// 2-获取第一行的内容
		FileLoanTransferModel fileLoanTransferModel = new FileLoanTransferModel();
		String fileContent = fileLoanTransferModel.getFirstFileContent(reqModel, transferModel.getMerBillNo());
		LOGGER.info("tppFileLoanTransfer--》fileContent={}, totalNum={}" + fileContent + fileLoanTransferModel.getTotalNum());
		
		// 3-获取第二行之后的内容然后合并
		StringBuilder detailContent = new StringBuilder();
		for (int i = 0; i < reqDetail.size(); i++) {
			CbhbFileLoanTransferReqDetailModel detail = reqDetail.get(i);
			FileLoanTransferDetailModel detailModel = new FileLoanTransferDetailModel();
			detailModel.setId(detail.getId());
			detailModel.setInvestMerNo(detail.getInvestMerNo());
			detailModel.setPlaCustId(detail.getPlaCustId());
			detailModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(detail.getTransAmt() + ""));
			detailModel.setMerPriv(detail.getMerPriv());
			detailContent.append(detailModel.getFileContent());
		}
		fileText.append(fileContent).append(detailContent.toString());

		// 3-本地生成临时文件然后FTP上传到对方服务器上，成功再删除临时文件
		boolean uploadFlag = false;
		// 获取文件路径和OK文件路径 以及对应的文件名称
		String path = transferModel.getFileNamePath();
		String okPath = transferModel.getOKFileNamePath();
		String fileName = transferModel.getFileName();
		String okFileName = transferModel.getOKFileName();
		uploadFlag = FileUtil.createFileFTPToClient(path, okPath, fileText.toString(), fileName, okFileName);

		// 4-还款实时回调请求
		CbhbFileLoanTransferModel cbhbModel = null;
		if (uploadFlag) {
			transferModel.setBorrowId(reqModel.getBorrowId());
			transferModel.setBorrowerAmt(CbhbHelper.getBigDecimalMoneyUpper(reqModel.getBorrowerAmt() + ""));
			transferModel.sign();
			cbhbModel = (CbhbFileLoanTransferModel) CbhbHelper.doSubmitWithValidCode(transferModel);
			LOGGER.info("渤海银行--存量标转移接口返回结果：{}" + cbhbModel.getRespCode());
		}
		return cbhbModel;
	}
	
}
