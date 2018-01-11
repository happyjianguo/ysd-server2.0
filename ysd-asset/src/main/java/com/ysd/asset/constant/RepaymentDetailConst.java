package com.ysd.asset.constant;

/**
 * @author xishengchun on 2017-09-19.
 * for fy_borrow_repayment_detail
 */
public class RepaymentDetailConst {

    /**
     * 还款状态
     */
    public enum RepaymentStatus {
        REPAYMENT_NO(0, "未还款"),
        REPAYMENT_SUCCESS(1, "已还款"),
        REPAYMENT_FAIL(2, "还款失败");

        public int code;
        public String name;
        RepaymentStatus(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    /**
     * 网站是否替借款人还款
     */
    public enum WebRepaymentStatus {
        REPAYMENT_NO(0, "未还款"),
        REPAYMENT_SUCCESS(1, "已还款"),
        REPAYMENT_FAIL(2, "还款失败");

        public int code;
        public String name;
        WebRepaymentStatus(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

}
