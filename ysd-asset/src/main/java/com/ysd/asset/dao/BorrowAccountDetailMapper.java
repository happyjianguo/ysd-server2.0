package com.ysd.asset.dao;

import com.ysd.asset.criteria.BorrowAccountDetailCriteria;
import com.ysd.asset.entity.BorrowAccountDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowAccountDetailMapper extends BaseMapper {
    long countByCriteria(BorrowAccountDetailCriteria example);

    int deleteByCriteria(BorrowAccountDetailCriteria example);

    int deleteById(Integer id);

    int insert(BorrowAccountDetail record);

    List<BorrowAccountDetail> selectByCriteria(BorrowAccountDetailCriteria example);

    BorrowAccountDetail selectById(Integer id);

    int updateByCriteria(@Param("record") BorrowAccountDetail record, @Param("example") BorrowAccountDetailCriteria example);

    int updateById(BorrowAccountDetail record);
}