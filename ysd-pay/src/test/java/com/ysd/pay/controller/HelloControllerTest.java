package com.ysd.pay.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import spring.BaseWebTest;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author xishengchun on 2017-09-09.
 */
public class HelloControllerTest extends BaseWebTest {

    @Test
    public void testDb() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello")
                /*.param("baseReferer", String.valueOf(smsSendRequest.getBaseReferer()))
                .param("businessType", smsSendRequest.getBusinessType())
                .param("content", smsSendRequest.getContent())
                .param("mobile", String.valueOf(smsSendRequest.getMobile()))
                .param("requestIp", String.valueOf(smsSendRequest.getRequestIp()))*/
                ;

        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(status().isOk())
                /*.andExpect(jsonPath("$.resultCode").value(""))
                .andExpect(jsonPath("$.resultMsg").value(""))*/
        ;
    }

}
