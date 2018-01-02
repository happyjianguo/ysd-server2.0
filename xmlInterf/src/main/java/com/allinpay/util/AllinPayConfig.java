package com.allinpay.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author xishengchun on 2017-09-23.
 * 加载配置参数
 */
public class AllinPayConfig {

    private Logger logger = LogManager.getLogger(AllinPayConfig.class);

    private static String FILE_NAME = "/allinpay/allinpay.properties";

    private Properties properties = new Properties();

    private static AllinPayConfig allinPayConfig;

    private AllinPayConfig() {
        load();
    }

    public static AllinPayConfig getInstance() {
        if (allinPayConfig == null) {
            allinPayConfig = new AllinPayConfig();
        }
        return allinPayConfig;
    }

    private void load() {
        try {
            InputStream resourceAsStream = AllinPayConfig.class.getResourceAsStream(FILE_NAME);
            this.properties.load(resourceAsStream);
        } catch (FileNotFoundException e) {
            logger.error("加载allinpay配置文件异常", e);
        } catch (IOException e) {
            logger.error("加载allinpay配置文件异常", e);
        } catch (Exception e) {
            logger.error("加载allinpay配置文件异常", e);
        }
    }

    public String getProp(String key) {
        return this.properties.getProperty(key);
    }

    public static String get(String key) {
        return AllinPayConfig.getInstance().getProp(key);
    }
}
