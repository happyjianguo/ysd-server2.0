package com.ysd.asset.constant;

/**
 * @author xishengchun on 2017-09-18.
 */
public class BorrowConst {

    /**
     * 借款手续费类型
     */
    public enum BorrowFeeType {
        PERCENT(0, "比例"),
        FIXED(1, "固定")
        ;

        public int code;
        public String name;
        BorrowFeeType(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static boolean isPercent(Integer code) {
            return code != null && PERCENT.code == code.intValue();
        }

        public static boolean isFixed(Integer code) {
            return code != null && FIXED.code == code.intValue();
        }
    }

    /**
     * 标的状态
     */
    public enum BorrowStatus {
        NEW(0, "发表未审核"),
        PUBLISH_APPROVE(1, "审核通过"),
        PUBLISH_REJECT(2, "审核未通过"),

        FULL_APPROVE(3, "满标审核通过"),
        FULL_REJECT(4, "满标审核未通过"),
        FULL_WAIT(5, "等待满标审核"),

        OVERDUE_CANCEL(6, "为过期撤回的标"), // TODO
        CANCEL(6, "撤回"), // TODO
        FINISHED(7, "已还完")

        ;

        public int code;
        public String name;
        BorrowStatus(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static boolean isFullApprove(Integer code) {
            return code != null && FULL_APPROVE.code == code.intValue();
        }

    }

    /**
     * 是否担保标
     */
    public enum IsVouch {
        NO_PLEDGE_NO_GUARANTEE(0, "无抵押无担保"),
        HAS_PLEDGE_NO_GUARANTEE(1, "有担保无抵押"),
        NO_PLEDGE_HAS_GUARANTEE(2, "无担保有抵押"),
        HAS_PLEDGE_HAS_GUARANTEE(3, "有担保有抵押"),
        ;
        public int code;
        public String name;
        IsVouch(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    /**
     * 村的类型
     * for fy_borrow.type
     */
    public enum BorrowType {
        SECOND(0, "秒标"),
        PLEDGE(1, "质押标"),
        MOVE(2, "流转标"),
        CREDIT(3, "信用标"),
        MONTH(4, "月标");

        public int code;
        public String name;
        BorrowType(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    /**
     * for fy_borrow.award
     * 奖励方式
     */
    public enum AwardWay {
        PERCENT(2, "百分比奖励"),
        FIXED(1, "固定奖励");
        public int code;
        public String name;
        AwardWay(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }


    /**
     * 奖励类型
     */
    public enum AwardType {
        CASH(0, "现金奖励"),
        HONGBAO(1, "红包奖励");

        public int code;
        public String name;
        AwardType(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    /**
     * 标的放款状态
     * for fy_borrow.fangkuang_status
     */
    public enum ReleaseStatus {
        NO(0, "未放款"),
        YES(1, "已放款"),
        APPLYING(2, "放款申请中");
        public int code;
        public String name;
        ReleaseStatus(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static boolean no(Integer code) {
            return code != null && NO.code == code.intValue();
        }

        public static boolean yes(Integer code) {
            return code != null && YES.code == code.intValue();
        }

        public static boolean isApplying(Integer code) {
            return code != null && APPLYING.code == code.intValue();
        }

    }

    /**
     * 还款方式
     * for fy_borrow.style
     */
    public enum RepaymentWay {
        LAYAWAY_PLAN_INTEREST(1, "分期付息"),
        MATURITY_PRINCIPAL_AND_INTEREST(2, "到期付本息"),
        AVERAGE_CAPITAL(3, "等额本金");
        public int code;
        public String name;
        RepaymentWay(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    /**
     * 存管状态
     */
    public enum CgStatus {
        NO("0", "未存管"),
        SUCESS("1", "存管成功"),
        FAIL("2", "存管失败");
        public String code;
        public String name;
        CgStatus(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public static boolean no(String code) {
            return NO.code.equals(code);
        }

        public static boolean success(String code) {
            return SUCESS.code.equals(code);
        }

        public static boolean fail(String code) {
            return FAIL.code.equals(code);
        }
    }

}
