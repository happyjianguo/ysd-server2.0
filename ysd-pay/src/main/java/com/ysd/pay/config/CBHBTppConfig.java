package com.ysd.pay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xishengchun on 2017-09-12.
 * for cbhnTpp.properties
 */
@Component
public class CBHBTppConfig {


    @Value("${file_temp_path}")
    private String fileTempPath;

    @Value("${private_key_path}")
    private String privateKeyPath;

    @Value("${pub_key_path}")
    private String pubKeyPath;

    @Value("${private_key_password}")
    private String privateKeyPassword;

    @Value("${partner_id}")
    private String partnerId;

    @Value("${cbhb_submit_url}")
    private String cbhbSubmitUrl;

    @Value("${cbhb_app_submit_url}")
    private String cbhbAppSubmitUrl;

    /**
     * 文件服务器方式
     * 0 ftp
     * 1 sftp
     */
    @Value("${cbhb_fileser_type}")
    private String cbhbFileserType;

    @Value("${ftp_host}")
    private String ftpHost;

    @Value("${ftp_port}")
    private int ftpPort;

    @Value("${ftp_username}")
    private String ftpUsername;

    @Value("${ftp_password}")
    private String ftpPassword;

    @Value("${sftp_host}")
    private String sftpHost;

    @Value("${sftp_port}")
    private int sftpPort;

    @Value("${sftp_username}")
    private String sftpUsername;

    @Value("${sftp_password}")
    private String sftpPassword;

    @Value("${sftp_privateKey}")
    private String sftpPrivateKey;

    @Value("${sftp_passphrase}")
    private String sftpPassphrase;

    @Value("${sftp_rootPath}")
    private String sftpRootPath;

    @Value("${web_url}")
    private String web_url;

    @Value("${notify_web_url}")
    private String notify_web_url;

    public String getFileTempPath() {
        return fileTempPath;
    }

    public void setFileTempPath(String fileTempPath) {
        this.fileTempPath = fileTempPath;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getPubKeyPath() {
        return pubKeyPath;
    }

    public void setPubKeyPath(String pubKeyPath) {
        this.pubKeyPath = pubKeyPath;
    }

    public String getPrivateKeyPassword() {
        return privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getCbhbSubmitUrl() {
        return cbhbSubmitUrl;
    }

    public void setCbhbSubmitUrl(String cbhbSubmitUrl) {
        this.cbhbSubmitUrl = cbhbSubmitUrl;
    }

    public String getCbhbAppSubmitUrl() {
        return cbhbAppSubmitUrl;
    }

    public void setCbhbAppSubmitUrl(String cbhbAppSubmitUrl) {
        this.cbhbAppSubmitUrl = cbhbAppSubmitUrl;
    }

    public String getCbhbFileserType() {
        return cbhbFileserType;
    }

    public void setCbhbFileserType(String cbhbFileserType) {
        this.cbhbFileserType = cbhbFileserType;
    }

    public String getFtpHost() {
        return ftpHost;
    }

    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }

    public int getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(int ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUsername() {
        return ftpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getSftpHost() {
        return sftpHost;
    }

    public void setSftpHost(String sftpHost) {
        this.sftpHost = sftpHost;
    }

    public int getSftpPort() {
        return sftpPort;
    }

    public void setSftpPort(int sftpPort) {
        this.sftpPort = sftpPort;
    }

    public String getSftpUsername() {
        return sftpUsername;
    }

    public void setSftpUsername(String sftpUsername) {
        this.sftpUsername = sftpUsername;
    }

    public String getSftpPassword() {
        return sftpPassword;
    }

    public void setSftpPassword(String sftpPassword) {
        this.sftpPassword = sftpPassword;
    }

    public String getSftpPrivateKey() {
        return sftpPrivateKey;
    }

    public void setSftpPrivateKey(String sftpPrivateKey) {
        this.sftpPrivateKey = sftpPrivateKey;
    }

    public String getSftpPassphrase() {
        return sftpPassphrase;
    }

    public void setSftpPassphrase(String sftpPassphrase) {
        this.sftpPassphrase = sftpPassphrase;
    }

    public String getSftpRootPath() {
        return sftpRootPath;
    }

    public void setSftpRootPath(String sftpRootPath) {
        this.sftpRootPath = sftpRootPath;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getNotify_web_url() {
        return notify_web_url;
    }

    public void setNotify_web_url(String notify_web_url) {
        this.notify_web_url = notify_web_url;
    }
}
