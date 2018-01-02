package com.ysd.task.service;

import java.util.Date;

/**
 * @author xishengchun on 2017-09-16.
 *
 */
public interface CheckService {

    /**
     * 投票对账
     * @param date
     * 如:当天时间,那对账是昨天
     */
    void investChk(Date date);

}
