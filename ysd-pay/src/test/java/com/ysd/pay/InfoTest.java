package com.ysd.pay;

import com.allinpay.ets.client.SecurityUtil;
import junit.framework.TestCase;
import org.bouncycastle.util.encoders.Base64;
import org.junit.Test;

/**
 * Created by yujian on 2017/9/19.
 */
public class InfoTest extends TestCase{


    @Test
    public void test() {
        try {
            String e = "merchantId=100020091218002&version=v1.0&language=1&signType=1&paymentOrderId=20100127025940009&orderNo=NO20100127140930&orderDatetime=20100127140930&orderAmount=100&payDatetime=20100127025940&payAmount=100&ext1=附加参数1&ext2=附加参数2&payResult=1&returnDatetime=20100127025941";
            String mac = "L2cKYmgs2Au4i1QPLy/pvd/C8txvU83h2XdE4MM/PUsA1K+d+3Q9KPSWFT/i03xqIJQJqLy+4ZUH6rb6C0Y0QbgY+CKpxWPa8uEKFdFgluMWLviILKweDkSsUq99wqKSbs169RFTjLAGqB8lIIeghk+79WKQZR6l+xDgLvXohM0=";
            byte[] decode = Base64.decode(mac);
            System.out.println("*********:" + new String(decode));
            System.out.println( "cert:" + SecurityUtil.verifyByRSA("/Users/xishengchun/git/ysd2.0/ysd-pay/src/test/resources/TLCert-test.cer",
                    e.getBytes("utf-8"), Base64.decode(mac)));
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    @Test
    public void testReplaceAll() {
        String signMsg = "osmEmi R5/R6V9bhMHbBgINumNZyeQXefcw3DXdC7jJzh3WL2G4so9KwlMH82VxXaK8tz9vhkHS/yBW4eGRPyJluoVzwn/ZQ1i/T5xWN3UW oV03 w8K31kCiPorJqukfHqR8J8sxfDhndlHcODa4M9jb0TYqTCki1dhXcTIPUY=";
        signMsg = signMsg.replaceAll(" ", "+");
        System.out.println("signMsg:" + signMsg);
    }

}
