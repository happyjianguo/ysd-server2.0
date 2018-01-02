package com.allin.mtp.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author xishengchun on 2017-09-23.
 * 加载配置参数
 */
public class AllinMTPConfig {
    private Logger logger = LogManager.getLogger(AllinMTPConfig.class);

    private static String FILE_NAME = "/allin.mtp.properties";

    private Properties properties = new Properties();

    private static AllinMTPConfig allinMTPConfig;

    private AllinMTPConfig() {
        load();
    }

    public static AllinMTPConfig getInstance() {
        if (allinMTPConfig == null) {
            allinMTPConfig = new AllinMTPConfig();
        }
        return allinMTPConfig;
    }

    private void load() {
        try {
            InputStream resourceAsStream = AllinMTPConfig.class.getResourceAsStream(FILE_NAME);
            this.properties.load(resourceAsStream);
        } catch (FileNotFoundException e) {
            logger.error("加载allin.mtp配置文件异常", e);
        } catch (IOException e) {
            logger.error("加载allin.mtp配置文件异常", e);
        } catch (Exception e) {
            logger.error("加载allin.mtp配置文件异常", e);
        }
    }

    public String getProp(String key) {
        return this.properties.getProperty(key);
    }

    public static String get(String key) {
        return AllinMTPConfig.getInstance().getProp(key);
    }

    public static String getSubmitUrl() {
        return AllinMTPConfig.getInstance().getProp("allin.mtp.url");
    }

    public static String getInstId() {
        return AllinMTPConfig.getInstance().getProp("allin.inst.id");
    }
    public static String getProductNum() {
        return AllinMTPConfig.getInstance().getProp("allin.product.num");
    }

    public static String getBuyProductNotifyUrl() {
        return AllinMTPConfig.getInstance().getProp("allin.buy.product.notify.url");
    }

    /**
     * 批量还款提交地址
     * @return
     */
    public static String getRepaymentUrl() {
        return AllinMTPConfig.getInstance().getProp("allin.mtp.batch.repayment.url");
    }

    /**
     * 批量还款处理结果地址
     * @return
     */
    public static String getRepaymentResultUrl() {
        return AllinMTPConfig.getInstance().getProp("allin.mtp.batch.repayment.result.url");
    }

    /**
     * 批量还款文件路径
     * @return
     */
    public static String getBatchRepaymentBuildFilePath() {
        return AllinMTPConfig.getInstance().getProp("allin.batch.repayment.build.path");
    }

    public static String getResultRepaymentFilePath() {
        return AllinMTPConfig.getInstance().getProp("allin.batch.repayment.result.path");
    }


}
