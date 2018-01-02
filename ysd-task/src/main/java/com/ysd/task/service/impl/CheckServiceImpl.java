package com.ysd.task.service.impl;
/*
import com.rd.tpp.model.chk.CbhbInvestChkModel;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.TppUtil;
import com.ysd.task.exception.InvestChkException;
import com.ysd.task.service.CheckService;
import org.apache.commons.collections.CollectionUtils;

import java.sql.Date;
import java.util.List;
*/

import com.ysd.task.service.CheckService;

import java.util.Date;

/**
 * @author xishengchun on 2017-09-16.
 */
public class CheckServiceImpl implements CheckService {

    /*
    public void investChk(Date date) {
        if (date == null) {
            throw new InvestChkException("参数异常");
        }
        // TODO 确认这个时间点,有没有对账过

        List<CbhbInvestChkModel> cbhbInvestChkModels = TppUtil.getInstance().tppInvestChk(date);
        if (CollectionUtils.isEmpty(cbhbInvestChkModels)) {
            throw new InvestChkException("{}投标对账失败:文件中无对账数据")
                    .set("date", DateUtils.formatDate(date, DateUtils.DATEFORMAT_STR_001))
                    ;
        }

        // TODO 保存到数据库




    }
    */
    public void investChk(Date date) {

    }

}
