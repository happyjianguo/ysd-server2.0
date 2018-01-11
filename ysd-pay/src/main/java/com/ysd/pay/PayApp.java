package com.ysd.pay;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xishengchun on 2017-09-09.
 */
@EnableAutoConfiguration(exclude = {JacksonAutoConfiguration.class, GsonAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan({"com.ysd"}) // 指定需要扫描其他包
//@SpringBootApplication(exclude = {JacksonAutoConfiguration.class, GsonAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class PayApp extends SpringBootServletInitializer {

    private static Logger logger = LogManager.getLogger(PayApp.class);

    public static void main(String[] args) {
        SpringApplication.run(PayApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        logger.debug("builder");
        return builder.sources(PayApp.class);
    }

}
