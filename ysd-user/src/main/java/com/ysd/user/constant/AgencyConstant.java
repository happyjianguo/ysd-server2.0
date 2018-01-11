package com.ysd.user.constant;

/**
 * @author xishengchun on 2017-09-13.
 */
public class AgencyConstant {

    /**
     * 服务商的审批状态
     */
    public enum AgencyReadyStatus {
        FAIL(0, "失败"),
        SUCCESS(1, "成功"),
        APPROVING(2, "审核中")
        ;
        public int code;
        public String name;
        AgencyReadyStatus(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static boolean isFail(Integer code) {
            return code != null && FAIL.code == code.intValue();
        }

        public static boolean isSuccess(Integer code) {
            return code != null && SUCCESS.code == code.intValue();
        }

        public static boolean isApproving(Integer code) {
            return code != null && APPROVING.code == code.intValue();
        }

    }

}
