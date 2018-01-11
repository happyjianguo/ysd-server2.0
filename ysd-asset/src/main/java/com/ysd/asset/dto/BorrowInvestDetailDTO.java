package com.ysd.asset.dto;

import com.ysd.asset.constant.BorrowConst;
import com.ysd.asset.entity.Borrow;
import com.ysd.asset.entity.BorrowDetail;
import com.ysd.common.util.MathUtil;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author xishengchun on 2017-09-17.
 */
public class BorrowInvestDetailDTO {

    private Borrow borrow;

    private List<BorrowDetail> borrowDetailList;

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public List<BorrowDetail> getBorrowDetailList() {
        return borrowDetailList;
    }

    public void setBorrowDetailList(List<BorrowDetail> borrowDetailList) {
        this.borrowDetailList = borrowDetailList;
    }

    /**
     * 计算手续费用
     * @return
     */
    public double getFee() {
        Integer feeType = borrow.getFeeType();
        if (BorrowConst.BorrowFeeType.isFixed(feeType)) {
            // 转换成分
            return MathUtil.getInstance(2).multiply(String.valueOf(borrow.getFeeMoney()), "100").doubleValue();
        } else if (BorrowConst.BorrowFeeType.isPercent(feeType)) {
            String partAccount = borrow.getPartAccount();
            String account = borrow.getAccount();
            // 不需要乘以100转换成分,因乘以的百分比
            return new MathUtil.NumberWrapper(MathUtil.getInstance(2), "1").multiply(account).multiply(partAccount).get().doubleValue();
        } else {
            return 0;
        }
    }

}
