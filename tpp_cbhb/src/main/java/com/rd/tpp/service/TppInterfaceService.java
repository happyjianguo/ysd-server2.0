package com.rd.tpp.service;

import java.util.Date;
import java.util.List;

import com.rd.tpp.model.CbhbBackInvestModel;
import com.rd.tpp.model.CbhbBatInvestCancleModel;
import com.rd.tpp.model.CbhbCreditRightsChangeModel;
import com.rd.tpp.model.CbhbExistUserRegisterModel;
import com.rd.tpp.model.CbhbExperBonusModel;
import com.rd.tpp.model.CbhbExperCapModel;
import com.rd.tpp.model.CbhbFileLoanTransferModel;
import com.rd.tpp.model.CbhbFileReleaseModel;
import com.rd.tpp.model.CbhbFileRepaymentModel;
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
import com.rd.tpp.model.CbhbUserBalTransferModel;
import com.rd.tpp.model.chk.CbhbExpChkModel;
import com.rd.tpp.model.chk.CbhbInvestChkModel;
import com.rd.tpp.model.chk.CbhbPpdChkModel;
import com.rd.tpp.model.chk.CbhbTransferChkModel;
import com.rd.tpp.model.chk.CbhbWdcChkModel;
import com.rd.tpp.model.file.FileResultQueryMerchantTrans;
import com.rd.tpp.model.req.BaseReq;
import com.rd.tpp.model.req.CbhbAddProjectReq;
import com.rd.tpp.model.req.CbhbBatInvestCancelReqModel;
import com.rd.tpp.model.req.CbhbBatRegisterReqModel;
import com.rd.tpp.model.req.CbhbCashReq;
import com.rd.tpp.model.req.CbhbCommonReq;
import com.rd.tpp.model.req.CbhbCorChargeAccountReq;
import com.rd.tpp.model.req.CbhbCreditAssignReq;
import com.rd.tpp.model.req.CbhbExperCapReqModel;
import com.rd.tpp.model.req.CbhbFileLoanTransferReqModel;
import com.rd.tpp.model.req.CbhbInvestCancleReq;
import com.rd.tpp.model.req.CbhbInvestReq;
import com.rd.tpp.model.req.CbhbLoanReq;
import com.rd.tpp.model.req.CbhbMercRechargeReq;
import com.rd.tpp.model.req.CbhbMercWithdrawReq;
import com.rd.tpp.model.req.CbhbQueryUserInfoReq;
import com.rd.tpp.model.req.CbhbRechargeOpenReq;
import com.rd.tpp.model.req.CbhbRechargeReq;
import com.rd.tpp.model.req.CbhbRepayReqModel;
import com.rd.tpp.model.req.CbhbTransStatReq;
import com.rd.tpp.model.req.CbhbUserBalTransferReq;
import com.rd.tpp.model.req.ExperBonusReq;

/**
 *   第三方支付（银行存管）系统接口
 *    @author win10
 *     @version 3.2.1
 */
public interface TppInterfaceService {
	/**
	 * 2.1 用户开户接口（RealNameWeb） 根据请求参数 返回跳转渤海页面html
	 *   params mao key值参数
	 *   merPriv  扩展参数  
	 *   mobileNo  手机号
	 */
	Object tppRegister(CbhbCommonReq req);	
	/**
	 * 2.2 修改银行卡的接口 （BindCardWeb） 根据请求参数 返回跳转渤海页面html
	 *  params mao key值参数
	 *  plaCustId  用户渤海开户用户标识
	 */
	Object tppUpdateBankCard(CbhbCommonReq req);
	/**
	 * 2.3渤海银行-- 修改手机号（BindMobileNo） 根据请求参数 返回跳转渤海页面html
	 *    plaCustId 用户标识
	 *    mobileNo 新手机号
	 *    merPriv  扩展域
	 */
	Object tppUpdateMobileNo(CbhbCommonReq req);
	/**
	 *  2.4 修改找回支付密码（BindPass） 根据请求参数 返回跳转渤海页面html 
	 *  plaCustId 渤海用户标识
	 *  merPriv   扩展域
	 */
	Object tppUpdatePayPass(CbhbCommonReq req);
	/**
	 *  2.5 动态口令申请接口 （sendUapMsg）   获取动态口令实时返回结果
	 *  mobileNo  手机号
	 */
	Object tppSendUapMsg(CbhbCommonReq req);
	/**
	 *  2.6 大额充值户 开户（OpenChargeAccount） 非渤海对公账户 开设大额充值户
	 */
	CbhbOpenChargeAccountModel tppOpenChargeAccount(CbhbRechargeOpenReq req);
	/* ######################################## 华丽分割线  ##################################################*/
	/**
	 *  3.1 用户充值（WebRecharge） 根据请求参数 返回跳转渤海页面html 
	 * plaCustId 用户标识
	 * amount    充值金额
	 * merFeeAmt 内扣手续费（平台方收取 用户的手续费）
	 */
	Object tppRecharge(CbhbRechargeReq req);
	
	/**
	 *  3.2 用户取现（Drawings）      根据请求参数 返回跳转渤海页面html
	 * plaCustId  用户标识
	 * amount  取现金额
	 * servFee 手续费（内扣）
	 */
	Object tppCash(CbhbCashReq req);
	/**
	 *  3.3 建标（CreateBid）         实时返回结果
	 * @param req
	 * @return
	 */
	Object tppAddProject(CbhbAddProjectReq req);
	/**
	 *  3.4 用户投标(BackInvest)   实时返回结果
	 * @param req
	 * @return
	 */
	CbhbBackInvestModel tppAddTender(CbhbInvestReq req);
	/**
	 *  3.5   投标撤销（InvestCancle）  实时返回结果
	 */
	CbhbInvestCancleModel tppInvestCancle(CbhbInvestCancleReq req);
	/**
	 *  3.6  批量投标撤销文件接口（BatInvestCancle）  根据参数上传文件  实时返回银行请求接口结果
	 */
	CbhbBatInvestCancleModel tppBatInvestCancle(CbhbBatInvestCancelReqModel req);
	/**
	 *  3.7 放款（FileRelease） 根据参数上传文件 实时返回银行请求接口结果 文件处理后通过异步通知 通知处理结果
	 * @param req
	 * @return
	 */
	CbhbFileReleaseModel tppLoan(CbhbLoanReq req);
	/**
	 *  3.8 还款(FileRepayment)  根据参数上传文件 实时返回银行请求接口结果 文件处理后通过异步通知 通知处理结果
	 * @param reqModel
	 * @return
	 */
	CbhbFileRepaymentModel tppRepayment(CbhbRepayReqModel reqModel);
	/**
	 * 3.9 实时红包（ExperBonus） 实时返回结果
	 * @return
	 */
	CbhbExperBonusModel experBonus(ExperBonusReq req);
	/**
	 * 3.10 红包体验金（ExperCap）  根据参数上传文件 实时返回银行请求接口结果 文件处理后通过异步通知 通知处理结果
	 */
	CbhbExperCapModel tppExperCap(CbhbExperCapReqModel experCapReq);
	/**
	 * 3.11 商户账户充值(MercRecharge)   实时返回结果
	 */
	CbhbMercRechargeModel tppMerchantRecharge(CbhbMercRechargeReq req);
	/**
	 * 3.12 商户自主提现(MercWithdraw)   实时返回结果
	 */
	CbhbMercWithdrawModel tppMerchantCash(CbhbMercWithdrawReq req);
	/**
	 * 3.13 债权转让(CreditRightsChange) 实时返回结果
	 */
	CbhbCreditRightsChangeModel tppCreditAssign(CbhbCreditAssignReq req);
	/* ######################################## 华丽分割线  ##################################################*/
	/**
	 * 4.1 用户信息查询（QueryUserInf）  用户基本信息 银行卡信息等  实时返回结果
	 */
	CbhbQueryUserInfModel queryUserInf(CbhbQueryUserInfoReq req);
	/**
	 * 4.2 用户账户余额查询（QueryBalance） 实时返回结果
	 */
	CbhbQueryBalanceModel tppQueryBalance(BaseReq req);	
	/**
	 * 4.3 商户账户查询(QueryMerchantAccts) 实时返回结果
	 */
	CbhbQueryMerchantAcctsModel queryMerchantAccts();
	/**
	 * 4.4 交易状态查询(QueryTransStat)  实时返回结果
	 */
	CbhbQueryTransStatModel tppQueryTransStat(CbhbTransStatReq req);
	/**
	 * 4.5  投标对账 查询非今日的投标对账 只支持查询单日
	 */
	List<CbhbInvestChkModel> tppInvestChk(Date queryDate);
	/**
	 * 4.6 充值对账  查询非今日的充值对账 只支持查询单日
	 */
	List<CbhbPpdChkModel> tppPpdChk(Date queryDate);
	/**
	 * 4.7 提现对账 查询非今日的提现对账 只支持查询单日
	 */
	List<CbhbWdcChkModel>  tppWdcChk(Date queryDate);
	/**
	 * 4.8 实时红包对账 查询非今日的实时红包  只支持查询单日
	 */
	List<CbhbExpChkModel> tppExpChk(Date queryDate);
    /**
     * 4.9商户账户交易查询（QueryMerchantTrans）  实时返回 
     */
    List<FileResultQueryMerchantTrans> tppQueryMerchantTrans(CbhbQueryMerchantTrans req);
	/**
	 * 4.10大额充值账号查询
	 */
    CbhbQueryChargeAccountModel tppQueryChargeAccount(CbhbCorChargeAccountReq req);
    
	/* ######################################## 华丽分割线  ##################################################*/
	/**
	   5.1  存量用户开户接口(ExistUserRegister)  根据参数上传文件 实时返回银行请求接口接收结果 文件处理后通过异步通知 通知处理结果
	 * @param req
	 * @return
	 */
    CbhbExistUserRegisterModel tppExperRealeName(CbhbBatRegisterReqModel req);
	/**
	 * 5.2  用户资金转移(UserBalTransfer)（后台方式）
	 */
    CbhbUserBalTransferModel tppUserBalTransfer(CbhbUserBalTransferReq req);

	/**
	 * 5.3 资金转移对账（ftp文件）    只支持查询单日
	 */
	List<CbhbTransferChkModel> tppTransferChk(Date queryDate);

	/**
	 * 5.4 渤海银行(FileLoanTransfer)-- 存量标转移
	 */
	CbhbFileLoanTransferModel tppFileLoanTransfer(CbhbFileLoanTransferReqModel reqModel);

}
