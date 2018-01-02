package com.ysd.asset.dao;

import com.ysd.asset.criteria.BorrowCriteria;
import com.ysd.asset.entity.Borrow;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowMapper extends BaseMapper {
    long countByCriteria(BorrowCriteria example);

    int deleteByCriteria(BorrowCriteria example);

    int deleteById(Integer id);

    int insert(Borrow record);

    List<Borrow> selectByExampleWithBLOBs(BorrowCriteria example);

    List<Borrow> selectByCriteria(BorrowCriteria example);

    Borrow selectById(Integer id);

    int updateByCriteria(@Param("record") Borrow record, @Param("example") BorrowCriteria example);

    int updateById(Borrow record);
}