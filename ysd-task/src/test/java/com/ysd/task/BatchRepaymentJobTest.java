package com.ysd.task;

import com.ysd.task.repayment.BatchRepaymentJob;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.AbstractTest;

/**
 * @author xishengchun on 2017-12-14.
 */
public class BatchRepaymentJobTest extends AbstractTest {

    private Logger logger = LogManager.getLogger(BatchRepaymentJobTest.class);

    @Autowired
    private BatchRepaymentJob batchRepaymentJob;

    @Test
    public void testBuildBatchFile() {
        logger.debug("batchRepaymentJob:{}", batchRepaymentJob);
        batchRepaymentJob.buildBatchFile();
    }

}
