package spring;

import com.ysd.pay.PayApp;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

/**
 * @author xishengchun on 2016-11-02.
 */

@RunWith(SpringRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = {DataSourceConfig.class, AppConfig.class, WebConfig.class})
@Transactional
@SpringBootTest(classes = PayApp.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseWebTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    protected MockHttpSession mockHttpSession;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        this.mockHttpSession = new MockHttpSession(this.webApplicationContext.getServletContext(),
                UUID.randomUUID().toString());
    }

//    /**
//     * 模拟session的值,可以测试需要登录方法
//     * @return
//     */
//    protected Map<String, Object> mockSession() {
//        Map<String, Object> sessionAttr = new HashMap<>();
//        sessionAttr.put(SessionKey.STOREID.code, 1044L);
//        sessionAttr.put(SessionKey.USERID.code, 711L);
//        return sessionAttr;
//    }


}
