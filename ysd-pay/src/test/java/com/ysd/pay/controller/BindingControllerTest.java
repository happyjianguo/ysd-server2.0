package com.ysd.pay.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import spring.BaseWebTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by yujian on 2017/9/12.
 */
public class BindingControllerTest extends BaseWebTest {

    @Test
    public void testNotify() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/bindingNotify")
                .param("MobileNo", "13588242636")
                .param("UsrName", "余坚")
                .param("IdentType", "1")
                .param("IdentNo", "330326199902060758")
                .param("OpenAcctId", "634242423424242342")
                .param("OpenBankId", "ICBC")

                ;

        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                /*.andExpect(jsonPath("$.resultCode").value(""))
                .andExpect(jsonPath("$.resultMsg").value(""))*/
        ;
    }

}
