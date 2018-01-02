package com.allinpay.xmltrans.constant;

/**
 * @author xishengchun on 2017-09-24.
 */
public enum TransCode {
    ID_VERIFY("220001", "国民身份证验证"),
    BIND_CARD("211006", "实名付申请,实现认证和绑卡"),
    BIND_CARD_CONFIRM("211006C", "实名付确认"),
    BIND_CARD_REPEAT("211006R", "实名付短信重发"),
    BIND_CARD_QUERY("211006Q", "实名付申请结果查询"),
    TRANS_RECHARGE("100011", "充值,实时单笔代收"),
    TRANS_DEPOSIT("100014", "提现,实时单笔代付"),
    TRANS_QUERY("200004", "批量代收批量代付单笔实时代收付,查询处理完毕的交易记录"),
    ACCOUNT_BALANCE_QUERY("300001", "历史余额查询"),
    ACCOUNT_QUERY("300000", "账户信息查询"),
    UNBIND_CARD("210005", "解绑"),
    ;
    public String code, name;
    TransCode(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
