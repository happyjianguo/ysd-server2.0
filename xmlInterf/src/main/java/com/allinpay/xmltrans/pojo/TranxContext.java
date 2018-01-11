package com.allinpay.xmltrans.pojo;

import com.allinpay.util.AllinPayConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author xishengchun on 2017-09-24.
 * 配置
 */
public class TranxContext {

    private Logger logger = LogManager.getLogger(TranxContext.class);

    /**
     * 商户公钥文件地址
     */
    private String pubKeyPath;

    /**
     * 商户私钥文件地址
     */
    private String privateKeyPath;

    /**
     * 商户私钥密码
     */
    private String privateKeyPassword;

    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 通联用户名
     */
    private String allinpayUserName;

    /**
     * 通联用户密码
     */
    private String allinpayPassword;

    /**
     * 服务请求地址
     */
    private String allinpayProcessUrl;

    private static TranxContext tranxContext;

    public static TranxContext getInstance() {
        if (tranxContext == null) {
            tranxContext = new TranxContext();
        }
        return tranxContext;
    }

    private TranxContext() {
        init();
    }

    private void init() {
        this.pubKeyPath = AllinPayConfig.get("pub_key_path");
        this.privateKeyPath = AllinPayConfig.get("private_key_path");
        this.privateKeyPassword = AllinPayConfig.get("private_key_password");
        this.merchantId = AllinPayConfig.get("merchant_id");
        this.allinpayUserName = AllinPayConfig.get("allinpay_user_name");
        this.allinpayPassword = AllinPayConfig.get("allinpay_password");
        this.allinpayProcessUrl = AllinPayConfig.get("allinpay_process_url");
    }

    public String getPubKeyPath() {
        return pubKeyPath;
    }

    public void setPubKeyPath(String pubKeyPath) {
        this.pubKeyPath = pubKeyPath;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getPrivateKeyPassword() {
        return privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAllinpayUserName() {
        return allinpayUserName;
    }

    public void setAllinpayUserName(String allinpayUserName) {
        this.allinpayUserName = allinpayUserName;
    }

    public String getAllinpayPassword() {
        return allinpayPassword;
    }

    public void setAllinpayPassword(String allinpayPassword) {
        this.allinpayPassword = allinpayPassword;
    }

    public String getAllinpayProcessUrl() {
        return allinpayProcessUrl;
    }

    public void setAllinpayProcessUrl(String allinpayProcessUrl) {
        this.allinpayProcessUrl = allinpayProcessUrl;
    }

    /**
     * 私钥的绝对路径
     * @return
     */
    public String getFullPrivateKeyPath() {
        if (org.apache.commons.lang3.StringUtils.isBlank(privateKeyPath)) {
            return "";
        }
        String fullPath = this.getClass().getResource("/").getPath() + privateKeyPath;
        logger.info("平台私钥文件地址:{}", fullPath);

        return fullPath;
    }

    /**
     * 公钥的绝对路径
     * @return
     */
    public String getFullPubKeyPath() {
        if (org.apache.commons.lang3.StringUtils.isBlank(pubKeyPath)) {
            return "";
        }

        String fullPath = this.getClass().getResource("/").getPath() + pubKeyPath;
        logger.info("通联公钥文件地址:{}", fullPath);
        return fullPath;
    }

}
