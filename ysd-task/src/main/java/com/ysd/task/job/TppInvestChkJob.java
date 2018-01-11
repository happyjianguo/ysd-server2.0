package com.ysd.task.job;

/*
import com.rd.tpp.model.chk.CbhbInvestChkModel;
import com.rd.tpp.util.TppUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
*/

/**
 * @author xishengchun on 2017-09-16.
 * 投标对账
 */
//@Component
public class TppInvestChkJob {

    /*
    private Logger logger = LogManager.getLogger(TppInvestChkJob.class);


   // @Scheduled(cron = "0/30 * * * * ?")
    public void job() {
        Date today = new Date();
        List<CbhbInvestChkModel> cbhbInvestChkModels = TppUtil.getInstance().tppInvestChk(new Date());
        if (CollectionUtils.isEmpty(cbhbInvestChkModels)) {
            logger.error("{}投标对账失败:下载对账文件失败", today);
            return;
        }

        // TODO 保存到数据库

    }*/
}
