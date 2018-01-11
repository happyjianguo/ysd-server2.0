package com.ysd.task;

import com.ysd.task.repayment.BatchRepaymentResultJob;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.AbstractTest;

/**
 * @author xishengchun on 2017-12-15.
 */
public class BatchRepaymentResultJobTest extends AbstractTest {

    @Autowired
    private BatchRepaymentResultJob batchRepaymentResultJob;

    @Test
    public void testHandleLines() {
        String backBatchNo = "O_D_20171113_12_78430000_RST";
        batchRepaymentResultJob.handleLines(backBatchNo);
    }
}
