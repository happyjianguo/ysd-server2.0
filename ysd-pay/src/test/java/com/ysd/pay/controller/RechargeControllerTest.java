package com.ysd.pay.controller;

import com.allinpay.ets.client.SecurityUtil;
import org.bouncycastle.util.encoders.Base64;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import spring.BaseWebTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by yujian on 2017/9/13.
 */
public class RechargeControllerTest extends BaseWebTest {
    @Test
    public void testNotify() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/rechargeNotify")
                .param("merchantId", "109115711712004")
                .param("version", "v1.0")
                .param("language", "1")
                .param("signType", "1")
                .param("payType", "0")
                .param("issuerId", "")
                .param("paymentOrderId", "201712100152328229")
                .param("orderNo", "2017121001523112")
                .param("orderDatetime", "20171210015231")
                .param("orderAmount", "300")
                .param("payDatetime", "20171210015505")
                .param("payAmount", "300")
                .param("ext1", "")
                .param("ext2", "")
                .param("payResult", "1")
                .param("errorCode", "")
                .param("returnDatetime", "20171210015506")
                .param("signMsg", "osmEmi+R5/R6V9bhMHbBgINumNZyeQXefcw3DXdC7jJzh3WL2G4so9KwlMH82VxXaK8tz9vhkHS/yBW4eGRPyJluoVzwn/ZQ1i/T5xWN3UW+oV03+w8K31kCiPorJqukfHqR8J8sxfDhndlHcODa4M9jb0TYqTCki1dhXcTIPUY=")
                ;

        this.mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                /*.andExpect(jsonPath("$.resultCode").value(""))
                .andExpect(jsonPath("$.resultMsg").value(""))*/
        ;
    }


}
