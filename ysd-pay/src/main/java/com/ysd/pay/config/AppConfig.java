package com.ysd.pay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xishengchun on 2017-09-12.
 */
@Component
public class AppConfig {

    @Value("${runtime.env}")
    private String runtimeEnv;

    public String getRuntimeEnv() {
        return runtimeEnv;
    }

    public void setRuntimeEnv(String runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
    }
}
