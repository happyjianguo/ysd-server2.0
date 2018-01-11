package com.ysd.asset.service;

import com.ysd.asset.dto.BorrowInvestDetailDTO;

/**
 * @author xishengchun on 2017-09-17.
 */
public interface ABorrowService {


    /**
     * 查询标的及投资详情
     * @return
     */
    BorrowInvestDetailDTO getBorrowInvestDetail(Integer borrowId);



}
