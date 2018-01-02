package com.ysd.common;

import com.ysd.common.util.MathUtil;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xishengchun on 2017-09-18.
 */
public class MathUtilTest {

    private Logger logger = LogManager.getLogger(MathUtilTest.class);

    @Test
    public void testAdd() {
        String v1 = "1.22";
        String v2 = "3.99";

        MathUtil.MathUtilInstance instance = MathUtil.getInstance(2);
        BigDecimal multiply1 = instance.multiply(v1, "100");
        BigDecimal multiply2 = instance.multiply(v2, "100");
        logger.error("multiply1:{}, multiply2:{}", multiply1, multiply2);
        BigDecimal add = instance.add(multiply1, multiply2);


        MathUtil.NumberWrapper numberWrapper = new MathUtil.NumberWrapper(MathUtil.getInstance(2), 100);
        System.out.println("add:" + add);
    }
}
