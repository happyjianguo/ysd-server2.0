package com.ysd.asset.dao;

import com.ysd.asset.criteria.BorrowRepaymentDetailCriteria;
import com.ysd.asset.entity.BorrowRepaymentDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRepaymentDetailMapper extends BaseMapper {
    long countByCriteria(BorrowRepaymentDetailCriteria example);

    int deleteByCriteria(BorrowRepaymentDetailCriteria example);

    int deleteById(Integer id);

    int insert(BorrowRepaymentDetail record);

    List<BorrowRepaymentDetail> selectByCriteria(BorrowRepaymentDetailCriteria example);

    BorrowRepaymentDetail selectById(Integer id);

    int updateByCriteria(@Param("record") BorrowRepaymentDetail record, @Param("example") BorrowRepaymentDetailCriteria example);

    int updateById(BorrowRepaymentDetail record);
}