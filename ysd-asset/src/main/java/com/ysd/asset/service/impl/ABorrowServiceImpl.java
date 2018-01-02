package com.ysd.asset.service.impl;

import com.ysd.asset.criteria.BorrowDetailCriteria;
import com.ysd.asset.dao.BorrowDetailMapper;
import com.ysd.asset.dao.BorrowMapper;
import com.ysd.asset.dto.BorrowInvestDetailDTO;
import com.ysd.asset.entity.Borrow;
import com.ysd.asset.entity.BorrowDetail;
import com.ysd.asset.exception.BorrowException;
import com.ysd.asset.service.ABorrowService;
import com.ysd.asset.service.BorrowDetailService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xishengchun on 2017-09-17.
 */
@Service
public class ABorrowServiceImpl implements ABorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Autowired
    private BorrowDetailMapper borrowDetailMapper;

    @Autowired
    private BorrowDetailService borrowDetailService;

    @Override
    public BorrowInvestDetailDTO getBorrowInvestDetail(Integer borrowId) {
        if (borrowId == null) {
            throw new BorrowException("查询标的投资详情失败:borrowId不能为空值");
        }

        Borrow borrow = borrowMapper.selectById(borrowId);
        if (borrow == null) {
            throw new BorrowException("查询标的投资详情失败:标的不存在")
                    .set("borrowId", borrowId)
                    ;
        }

        List<BorrowDetail> borrowDetailList = borrowDetailService.getBorrowInvestList(borrowId);
        BorrowInvestDetailDTO borrowInvestDetailDTO = new BorrowInvestDetailDTO();
        borrowInvestDetailDTO.setBorrow(borrow);
        borrowInvestDetailDTO.setBorrowDetailList(borrowDetailList);
        return borrowInvestDetailDTO;
    }
}
