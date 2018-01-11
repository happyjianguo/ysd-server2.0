package com.ysd.asset.util;

import com.ysd.asset.constant.BorrowConst;
import com.ysd.common.util.MathUtil;

import java.math.BigDecimal;

/**
 * @author xishengchun on 2017-09-19.
 * 手续费计算
 */
public class FeeUtil {

    /**
     * 计算手续费用
     * @param feeType
     * 手续费方式
     * @param  partAccount
     * 手续费比例
     * @param  feeMoney
     * 手续费固定金额
     * @param totalBorrowMoney
     * 标的总金额
     * @return
     */
    public static double getFee(int feeType, String partAccount, BigDecimal feeMoney, String totalBorrowMoney) {
        if (BorrowConst.BorrowFeeType.isFixed(feeType)) {
            // 转换成分
            return MathUtil.getInstance(2).multiply(String.valueOf(feeMoney), "100").doubleValue();
        } else if (BorrowConst.BorrowFeeType.isPercent(feeType)) {
            return new MathUtil.NumberWrapper(MathUtil.getInstance(2), "1").multiply(totalBorrowMoney).multiply(partAccount).get().doubleValue();
        } else {
            return 0;
        }
    }
}
