package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_borrow
 * 
 */
public class Borrow extends BaseEntity {
    /**
     * 标ID
     */
    private Integer id;

    /**
     * 大标ID
     */
    private Integer maxborrowId;

    /**
     * 借款人ID
     */
    private Integer userId;

    /**
     * 服务商ID
     */
    private Integer agencyId;

    /**
     * 标题
     */
    private String name;

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 排序号
     */
    private Integer orderNum;

    /**
     * 分期总期数
     */
    private Integer divides;

    /**
     * 点击次数
     */
    private Integer hits;

    /**
     * 标业务类型
     */
    private String isVouch;

    /**
     * 类型
     */
    private String type;

    /**
     * 审核人
     */
    private String verifyUser;

    /**
     * 审核时间
     */
    private Date verifyTime;

    /**
     * 审核备注
     */
    private String verifyRemark;

    /**
     * 瞒标审核人
     */
    private Integer repaymentUser;

    /**
     * 第一账户
     */
    private String forstAccount;

    /**
     * 应还金额
     */
    private String repaymentAccount;

    /**
     * 每月应还金额
     */
    private String monthlyRepayment;

    /**
     * 已还款金额
     */
    private String repaymentYesaccount;

    /**
     * 借款人收款时间
     */
    private Date repaymentTime;

    /**
     * 瞒标审核备注
     */
    private String repamyentRemark;

    /**
     * 满标审核时间
     */
    private Date successTime;

    /**
     * 标结束时间
     */
    private Date endTime;

    /**
     * 每月还款金额
     */
    private String paymentAccount;

    /**
     * 每月还款日
     */
    private String eachTime;

    /**
     * 借款用途
     */
    private String useReason;

    /**
     * 借款月数
     */
    private String timeLimit;

    /**
     * 还款方式
     */
    private String style;

    /**
     * 还款周期（分期付息时用）
     */
    private Integer repaymentPeriod;

    /**
     * 借款总金额
     */
    private String account;

    /**
     * 实际借款金额
     */
    private String accountYes;

    /**
     * 投标次数
     */
    private String tenderTimes;

    /**
     * 年利率
     */
    private BigDecimal apr;

    /**
     * 最低投标额
     */
    private String lowestAccount;

    /**
     * 最高投标额
     */
    private String mostAccount;

    /**
     * 有效时间
     */
    private String validTime;

    /**
     * 投标奖励方式
     */
    private String award;

    /**
     * 保证金
     */
    private BigDecimal depositMoney;

    /**
     * 手续费方式0比例1固定
     */
    private Integer feeType;

    /**
     * 手续费固定
     */
    private BigDecimal feeMoney;

    /**
     * 手续费比例
     */
    private String partAccount;

    /**
     * 投标金额比例奖励
     */
    private String funds;

    /**
     * 标的失败时也同样奖励
     */
    private String isFalse;

    /**
     * 公开我的帐户资金情况
     */
    private String openAccount;

    /**
     * 公开我的借款资金情况
     */
    private String openBorrow;

    /**
     * 公开我的投标资金情况
     */
    private String openTender;

    /**
     * 公开我的信用额度情况
     */
    private String openCredit;

    /**
     * 是否完成
     */
    private String isDo;

    /**
     * 是否秒标
     */
    private String isMb;

    /**
     * 是否给力
     */
    private String isFast;

    /**
     * 是否是定向标
     */
    private String isDxb;

    /**
     * 定向标密码
     */
    private String pwd;

    /**
     * 是否天标
     */
    private String isday;

    /**
     * 天标的天数
     */
    private String timeLimitDay;

    /**
     * 添加操作的人
     */
    private String addPersion;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 修改人
     */
    private String updatePersion;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 操作者IP
     */
    private String operatorIp;

    /**
     * 投标百分比
     */
    private String schedule;

    /**
     * 建创时间
     */
    private Date createDate;

    /**
     * 改修时间
     */
    private Date modifyDate;

    /**
     * 余剩金额
     */
    private String balance;

    /**
     * 图片首个
     */
    private String borImageFirst;

    /**
     * 款还来源
     */
    private String borStages;

    /**
     * 每人认购次数
     */
    private Integer wanderTenderTimes;

    /**
     * 总认购数
     */
    private Integer wanderPieceSize;

    /**
     * 每份金额
     */
    private BigDecimal wanderPieceMoney;

    /**
     * 赎回次数
     */
    private Integer wanderRedeemTimes;

    /**
     * 最终还款日
     */
    private Date finalRepayDate;

    /**
     * 次回还款日
     */
    private Date nextRepayDate;

    /**
     * 标的奖励金额
     */
    private BigDecimal bonus;

    /**
     * 标的总利息
     */
    private BigDecimal interestTotal;

    /**
     * 未还本金
     */
    private BigDecimal repayCapital;

    /**
     * 未还利息
     */
    private BigDecimal repayInterest;

    /**
     * 已还本金
     */
    private BigDecimal payedCapital;

    /**
     * 已还利息
     */
    private BigDecimal payedInterest;

    /**
     * 置顶1，默认0
     */
    private Integer showTop;

    /**
     * 排序，默认100
     */
    private Integer showSort;

    /**
     * 最终年利率
     */
    private BigDecimal finalRateYear;

    /**
     * 自投状态0关闭1启用
     */
    private Integer autoTenderStatus;

    /**
     * 自投还款方式
     */
    private Integer autoTenderRepayWay;

    /**
     * 续投奖励
     */
    private BigDecimal continueAwardRate;

    /**
     * 年化利率（查询用）
     */
    private BigDecimal varyYearRate;

    /**
     * 月化期限（查询用）
     */
    private BigDecimal varyMonthLimit;

    /**
     * 主从标志,1主 0从
     */
    private Integer parentFlg;

    /**
     * 主id
     */
    private Integer parentId;

    /**
     * 主金额
     */
    private Integer parentMoney;

    /**
     * 已幕金额
     */
    private Integer parentAccount;

    /**
     * 状态 1完成
     */
    private Integer parentStatus;

    /**
     * 奖励类型：0：现金奖励，1：红包奖励
     */
    private Integer awardType;

    /**
     * 包红奖励比例
     */
    private String awardFunds;

    /**
     * 投标有效期
     */
    private Date overDate;

    /**
     * 项目编号
     */
    private String businessCode;

    /**
     * 使用红包比例
     */
    private BigDecimal awardScale;

    /**
     * 项目余额
     */
    private BigDecimal borrowMoney;

    /**
     * 0:未放款；1：已放款; 2:放款申请中
     */
    private Integer fangkuanStatus;

    /**
     * 融讯项目1是
     */
    private Integer rongXunFlg;

    /**
     * 投资先锋奖励金额
     */
    private BigDecimal tzxf;

    /**
     * 投资土豪奖励金额
     */
    private BigDecimal tzth;

    /**
     * 收官大哥奖励金额
     */
    private BigDecimal sgdg;

    /**
     * 基本年利率显示
     */
    private BigDecimal baseApr;

    /**
     * 加送年利率显示
     */
    private BigDecimal awardApr;

    /**
     * 0未存管,1存管成功,2存管失败
     */
    private String cgStatus;

    /**
     * 标详细描述
     */
    private String content;

    private String orderList;

    /**
     * 图片（逗号分隔）
     */
    private String borImage;

    /**
     * 流转还款设置(期数，还款日期：)
     */
    private String wanderStages;

    /**
     * 标内容 json
     */
    private String borrowInfoJson;

    /**
     * 图片json
     */
    private String borImage2;

    /**
     * 证明 json
     */
    private String borrowVerifyJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaxborrowId() {
        return maxborrowId;
    }

    public void setMaxborrowId(Integer maxborrowId) {
        this.maxborrowId = maxborrowId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getDivides() {
        return divides;
    }

    public void setDivides(Integer divides) {
        this.divides = divides;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getIsVouch() {
        return isVouch;
    }

    public void setIsVouch(String isVouch) {
        this.isVouch = isVouch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVerifyUser() {
        return verifyUser;
    }

    public void setVerifyUser(String verifyUser) {
        this.verifyUser = verifyUser;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public Integer getRepaymentUser() {
        return repaymentUser;
    }

    public void setRepaymentUser(Integer repaymentUser) {
        this.repaymentUser = repaymentUser;
    }

    public String getForstAccount() {
        return forstAccount;
    }

    public void setForstAccount(String forstAccount) {
        this.forstAccount = forstAccount;
    }

    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    public String getMonthlyRepayment() {
        return monthlyRepayment;
    }

    public void setMonthlyRepayment(String monthlyRepayment) {
        this.monthlyRepayment = monthlyRepayment;
    }

    public String getRepaymentYesaccount() {
        return repaymentYesaccount;
    }

    public void setRepaymentYesaccount(String repaymentYesaccount) {
        this.repaymentYesaccount = repaymentYesaccount;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public String getRepamyentRemark() {
        return repamyentRemark;
    }

    public void setRepamyentRemark(String repamyentRemark) {
        this.repamyentRemark = repamyentRemark;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getEachTime() {
        return eachTime;
    }

    public void setEachTime(String eachTime) {
        this.eachTime = eachTime;
    }

    public String getUseReason() {
        return useReason;
    }

    public void setUseReason(String useReason) {
        this.useReason = useReason;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(Integer repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountYes() {
        return accountYes;
    }

    public void setAccountYes(String accountYes) {
        this.accountYes = accountYes;
    }

    public String getTenderTimes() {
        return tenderTimes;
    }

    public void setTenderTimes(String tenderTimes) {
        this.tenderTimes = tenderTimes;
    }

    public BigDecimal getApr() {
        return apr;
    }

    public void setApr(BigDecimal apr) {
        this.apr = apr;
    }

    public String getLowestAccount() {
        return lowestAccount;
    }

    public void setLowestAccount(String lowestAccount) {
        this.lowestAccount = lowestAccount;
    }

    public String getMostAccount() {
        return mostAccount;
    }

    public void setMostAccount(String mostAccount) {
        this.mostAccount = mostAccount;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public BigDecimal getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(BigDecimal depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public BigDecimal getFeeMoney() {
        return feeMoney;
    }

    public void setFeeMoney(BigDecimal feeMoney) {
        this.feeMoney = feeMoney;
    }

    public String getPartAccount() {
        return partAccount;
    }

    public void setPartAccount(String partAccount) {
        this.partAccount = partAccount;
    }

    public String getFunds() {
        return funds;
    }

    public void setFunds(String funds) {
        this.funds = funds;
    }

    public String getIsFalse() {
        return isFalse;
    }

    public void setIsFalse(String isFalse) {
        this.isFalse = isFalse;
    }

    public String getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(String openAccount) {
        this.openAccount = openAccount;
    }

    public String getOpenBorrow() {
        return openBorrow;
    }

    public void setOpenBorrow(String openBorrow) {
        this.openBorrow = openBorrow;
    }

    public String getOpenTender() {
        return openTender;
    }

    public void setOpenTender(String openTender) {
        this.openTender = openTender;
    }

    public String getOpenCredit() {
        return openCredit;
    }

    public void setOpenCredit(String openCredit) {
        this.openCredit = openCredit;
    }

    public String getIsDo() {
        return isDo;
    }

    public void setIsDo(String isDo) {
        this.isDo = isDo;
    }

    public String getIsMb() {
        return isMb;
    }

    public void setIsMb(String isMb) {
        this.isMb = isMb;
    }

    public String getIsFast() {
        return isFast;
    }

    public void setIsFast(String isFast) {
        this.isFast = isFast;
    }

    public String getIsDxb() {
        return isDxb;
    }

    public void setIsDxb(String isDxb) {
        this.isDxb = isDxb;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIsday() {
        return isday;
    }

    public void setIsday(String isday) {
        this.isday = isday;
    }

    public String getTimeLimitDay() {
        return timeLimitDay;
    }

    public void setTimeLimitDay(String timeLimitDay) {
        this.timeLimitDay = timeLimitDay;
    }

    public String getAddPersion() {
        return addPersion;
    }

    public void setAddPersion(String addPersion) {
        this.addPersion = addPersion;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getUpdatePersion() {
        return updatePersion;
    }

    public void setUpdatePersion(String updatePersion) {
        this.updatePersion = updatePersion;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBorImageFirst() {
        return borImageFirst;
    }

    public void setBorImageFirst(String borImageFirst) {
        this.borImageFirst = borImageFirst;
    }

    public String getBorStages() {
        return borStages;
    }

    public void setBorStages(String borStages) {
        this.borStages = borStages;
    }

    public Integer getWanderTenderTimes() {
        return wanderTenderTimes;
    }

    public void setWanderTenderTimes(Integer wanderTenderTimes) {
        this.wanderTenderTimes = wanderTenderTimes;
    }

    public Integer getWanderPieceSize() {
        return wanderPieceSize;
    }

    public void setWanderPieceSize(Integer wanderPieceSize) {
        this.wanderPieceSize = wanderPieceSize;
    }

    public BigDecimal getWanderPieceMoney() {
        return wanderPieceMoney;
    }

    public void setWanderPieceMoney(BigDecimal wanderPieceMoney) {
        this.wanderPieceMoney = wanderPieceMoney;
    }

    public Integer getWanderRedeemTimes() {
        return wanderRedeemTimes;
    }

    public void setWanderRedeemTimes(Integer wanderRedeemTimes) {
        this.wanderRedeemTimes = wanderRedeemTimes;
    }

    public Date getFinalRepayDate() {
        return finalRepayDate;
    }

    public void setFinalRepayDate(Date finalRepayDate) {
        this.finalRepayDate = finalRepayDate;
    }

    public Date getNextRepayDate() {
        return nextRepayDate;
    }

    public void setNextRepayDate(Date nextRepayDate) {
        this.nextRepayDate = nextRepayDate;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getInterestTotal() {
        return interestTotal;
    }

    public void setInterestTotal(BigDecimal interestTotal) {
        this.interestTotal = interestTotal;
    }

    public BigDecimal getRepayCapital() {
        return repayCapital;
    }

    public void setRepayCapital(BigDecimal repayCapital) {
        this.repayCapital = repayCapital;
    }

    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

    public BigDecimal getPayedCapital() {
        return payedCapital;
    }

    public void setPayedCapital(BigDecimal payedCapital) {
        this.payedCapital = payedCapital;
    }

    public BigDecimal getPayedInterest() {
        return payedInterest;
    }

    public void setPayedInterest(BigDecimal payedInterest) {
        this.payedInterest = payedInterest;
    }

    public Integer getShowTop() {
        return showTop;
    }

    public void setShowTop(Integer showTop) {
        this.showTop = showTop;
    }

    public Integer getShowSort() {
        return showSort;
    }

    public void setShowSort(Integer showSort) {
        this.showSort = showSort;
    }

    public BigDecimal getFinalRateYear() {
        return finalRateYear;
    }

    public void setFinalRateYear(BigDecimal finalRateYear) {
        this.finalRateYear = finalRateYear;
    }

    public Integer getAutoTenderStatus() {
        return autoTenderStatus;
    }

    public void setAutoTenderStatus(Integer autoTenderStatus) {
        this.autoTenderStatus = autoTenderStatus;
    }

    public Integer getAutoTenderRepayWay() {
        return autoTenderRepayWay;
    }

    public void setAutoTenderRepayWay(Integer autoTenderRepayWay) {
        this.autoTenderRepayWay = autoTenderRepayWay;
    }

    public BigDecimal getContinueAwardRate() {
        return continueAwardRate;
    }

    public void setContinueAwardRate(BigDecimal continueAwardRate) {
        this.continueAwardRate = continueAwardRate;
    }

    public BigDecimal getVaryYearRate() {
        return varyYearRate;
    }

    public void setVaryYearRate(BigDecimal varyYearRate) {
        this.varyYearRate = varyYearRate;
    }

    public BigDecimal getVaryMonthLimit() {
        return varyMonthLimit;
    }

    public void setVaryMonthLimit(BigDecimal varyMonthLimit) {
        this.varyMonthLimit = varyMonthLimit;
    }

    public Integer getParentFlg() {
        return parentFlg;
    }

    public void setParentFlg(Integer parentFlg) {
        this.parentFlg = parentFlg;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentMoney() {
        return parentMoney;
    }

    public void setParentMoney(Integer parentMoney) {
        this.parentMoney = parentMoney;
    }

    public Integer getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(Integer parentAccount) {
        this.parentAccount = parentAccount;
    }

    public Integer getParentStatus() {
        return parentStatus;
    }

    public void setParentStatus(Integer parentStatus) {
        this.parentStatus = parentStatus;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardFunds() {
        return awardFunds;
    }

    public void setAwardFunds(String awardFunds) {
        this.awardFunds = awardFunds;
    }

    public Date getOverDate() {
        return overDate;
    }

    public void setOverDate(Date overDate) {
        this.overDate = overDate;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public BigDecimal getAwardScale() {
        return awardScale;
    }

    public void setAwardScale(BigDecimal awardScale) {
        this.awardScale = awardScale;
    }

    public BigDecimal getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(BigDecimal borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public Integer getFangkuanStatus() {
        return fangkuanStatus;
    }

    public void setFangkuanStatus(Integer fangkuanStatus) {
        this.fangkuanStatus = fangkuanStatus;
    }

    public Integer getRongXunFlg() {
        return rongXunFlg;
    }

    public void setRongXunFlg(Integer rongXunFlg) {
        this.rongXunFlg = rongXunFlg;
    }

    public BigDecimal getTzxf() {
        return tzxf;
    }

    public void setTzxf(BigDecimal tzxf) {
        this.tzxf = tzxf;
    }

    public BigDecimal getTzth() {
        return tzth;
    }

    public void setTzth(BigDecimal tzth) {
        this.tzth = tzth;
    }

    public BigDecimal getSgdg() {
        return sgdg;
    }

    public void setSgdg(BigDecimal sgdg) {
        this.sgdg = sgdg;
    }

    public BigDecimal getBaseApr() {
        return baseApr;
    }

    public void setBaseApr(BigDecimal baseApr) {
        this.baseApr = baseApr;
    }

    public BigDecimal getAwardApr() {
        return awardApr;
    }

    public void setAwardApr(BigDecimal awardApr) {
        this.awardApr = awardApr;
    }

    public String getCgStatus() {
        return cgStatus;
    }

    public void setCgStatus(String cgStatus) {
        this.cgStatus = cgStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }

    public String getBorImage() {
        return borImage;
    }

    public void setBorImage(String borImage) {
        this.borImage = borImage;
    }

    public String getWanderStages() {
        return wanderStages;
    }

    public void setWanderStages(String wanderStages) {
        this.wanderStages = wanderStages;
    }

    public String getBorrowInfoJson() {
        return borrowInfoJson;
    }

    public void setBorrowInfoJson(String borrowInfoJson) {
        this.borrowInfoJson = borrowInfoJson;
    }

    public String getBorImage2() {
        return borImage2;
    }

    public void setBorImage2(String borImage2) {
        this.borImage2 = borImage2;
    }

    public String getBorrowVerifyJson() {
        return borrowVerifyJson;
    }

    public void setBorrowVerifyJson(String borrowVerifyJson) {
        this.borrowVerifyJson = borrowVerifyJson;
    }
}