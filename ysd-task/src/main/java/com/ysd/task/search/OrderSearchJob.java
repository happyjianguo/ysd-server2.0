package com.ysd.task.search;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by yujian on 2017/9/15.
 */
@Component
public class OrderSearchJob {

    private Logger logger = LogManager.getLogger(OrderSearchJob.class);

    /**
     * 订单查询
     */
    /*@Scheduled(cron = "${account.end.job.cron}")
    public void downloadEndFile() {
        logger.info("downloadEndFile");
    }*/
}
