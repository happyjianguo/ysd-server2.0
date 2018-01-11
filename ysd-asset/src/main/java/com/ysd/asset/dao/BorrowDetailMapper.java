package com.ysd.asset.dao;

import com.ysd.asset.criteria.BorrowDetailCriteria;
import com.ysd.asset.entity.BorrowDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowDetailMapper extends BaseMapper {
    long countByCriteria(BorrowDetailCriteria example);

    int deleteByCriteria(BorrowDetailCriteria example);

    int deleteById(Integer id);

    int insert(BorrowDetail record);

    List<BorrowDetail> selectByCriteria(BorrowDetailCriteria example);

    BorrowDetail selectById(Integer id);

    int updateByCriteria(@Param("record") BorrowDetail record, @Param("example") BorrowDetailCriteria example);

    int updateById(BorrowDetail record);
}