package com.ysd.pay.service.impl;


import com.ysd.asset.constant.BorrowConst;
import com.ysd.asset.dao.BorrowDetailMapper;
import com.ysd.asset.dao.BorrowMapper;
import com.ysd.asset.dao.BorrowRepaymentDetailMapper;
import com.ysd.asset.entity.Borrow;
import com.ysd.asset.service.ABorrowService;
import com.ysd.asset.service.BorrowDetailService;

import com.ysd.pay.service.BorrowService;
import com.ysd.user.dao.UserMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by yujian on 2017/9/15.
 */
@Service("borrowService")
public class BorrowServiceImpl implements BorrowService{

    private Logger logger = LogManager.getLogger(BorrowServiceImpl.this);

    @Autowired
    private ABorrowService aBorrowService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BorrowMapper borrowMapper;

    @Autowired
    private BorrowDetailService borrowDetailService;

    @Autowired
    private BorrowDetailMapper borrowDetailMapper;

    @Autowired
    private BorrowRepaymentDetailMapper borrowRepaymentDetailMapper;




    public String createBorrow(String borrowId) {

        Borrow borrow = new Borrow();
        borrow.setId(Integer.parseInt(borrowId));
        borrow.setCgStatus(BorrowConst.CgStatus.SUCESS.code);
        borrowMapper.updateById(borrow);


        return null;
    }

    @Override
    public boolean releaseBorrow(String orderNo, Integer borrowId) {
        return false;
    }

    @Override
    public boolean investBorrow(String orderNo, Integer investUserId, Integer borrowId) {
        return false;
    }

    @Override
    public boolean cancelInvestBorrow(String orderNo, Integer investUserId, Integer borrowId) {
        return false;
    }

    @Override
    public boolean batchCancelInvestBorrow(String orderNo, List<Integer> investUserIdList, Integer borrowId) {
        return false;
    }

    @Override
    public boolean repaymentBorrow(String orderNo, Integer borrowRepaymentDetailId, Integer borrowId) {
        return false;
    }


}
