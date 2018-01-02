package com.ysd.asset.service.impl;

import com.ysd.asset.criteria.BorrowDetailCriteria;
import com.ysd.asset.dao.BorrowDetailMapper;
import com.ysd.asset.entity.BorrowDetail;
import com.ysd.asset.exception.BorrowException;
import com.ysd.asset.service.BorrowDetailService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xishengchun on 2017-09-19.
 */
@Service
public class BorrowDetailServiceImpl implements BorrowDetailService {

    @Autowired
    private BorrowDetailMapper borrowDetailMapper;

    @Override
    public List<BorrowDetail> getBorrowInvestList(Integer borrowId) {
        BorrowDetailCriteria borrowDetailCriteria = new BorrowDetailCriteria();
        borrowDetailCriteria.or()
                .andBorrowIdEqualTo(borrowId);
        List<BorrowDetail> borrowDetailList = borrowDetailMapper.selectByCriteria(borrowDetailCriteria);
        if (CollectionUtils.isEmpty(borrowDetailList)) {
            throw new BorrowException("查询标的投资详情失败:投资明细不存在");
        }
        return borrowDetailList;
    }

    @Override
    public List<BorrowDetail> getBorrowInvest(Integer investUserId, Integer borrowId) {
        BorrowDetailCriteria borrowDetailCriteria = new BorrowDetailCriteria();
        borrowDetailCriteria.or()
                .andBorrowIdEqualTo(borrowId)
                .andUserIdEqualTo(investUserId)
                ;
        List<BorrowDetail> borrowDetailList = borrowDetailMapper.selectByCriteria(borrowDetailCriteria);
        if (CollectionUtils.isEmpty(borrowDetailList)) {
            throw new BorrowException("查询标的投资人的投资明细失败:投资明细不存在")
                    .set("investUserId", investUserId)
                    .set("borrowId", borrowId)
                    ;
        }
        return borrowDetailList;
    }

    @Override
    public List<BorrowDetail> getBorrowInvest(List<Integer> investUserIdList, Integer borrowId) {
        BorrowDetailCriteria borrowDetailCriteria = new BorrowDetailCriteria();
        borrowDetailCriteria.or()
                .andBorrowIdEqualTo(borrowId)
                .andUserIdIn(investUserIdList)
        ;
        List<BorrowDetail> borrowDetailList = borrowDetailMapper.selectByCriteria(borrowDetailCriteria);
        if (CollectionUtils.isEmpty(borrowDetailList)) {
            throw new BorrowException("查询标的投资明细失败:投资明细不存在")
                    .set("investUserIdList", investUserIdList)
                    .set("borrowId", borrowId)
                    ;
        }
        return borrowDetailList;
    }
}
