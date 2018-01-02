package com.ysd.asset.service;

import com.ysd.asset.entity.BorrowDetail;

import java.util.List;

/**
 * @author xishengchun on 2017-09-19.
 * 标的投资详情
 */
public interface BorrowDetailService {

    /**
     * 查询标的投资列表
     * @param borrowId
     * @return
     */
    List<BorrowDetail> getBorrowInvestList(Integer borrowId);

    /**
     * 查询投资人的投资信息
     * @param investUserId
     * @param borrowId
     * @return
     */
    List<BorrowDetail> getBorrowInvest(Integer investUserId, Integer borrowId);


    /**
     * 查询投资人的投资信息
     * @param investUserIdList
     * @param borrowId
     * @return
     */
    List<BorrowDetail> getBorrowInvest(List<Integer> investUserIdList, Integer borrowId);



}
