package com.ysd.asset.dao;

import com.ysd.asset.criteria.BorrowRechargeCriteria;
import com.ysd.asset.entity.BorrowRecharge;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRechargeMapper extends BaseMapper {
    long countByCriteria(BorrowRechargeCriteria example);

    int deleteByCriteria(BorrowRechargeCriteria example);

    int deleteById(Integer id);

    int insert(BorrowRecharge record);

    List<BorrowRecharge> selectByExampleWithBLOBs(BorrowRechargeCriteria example);

    List<BorrowRecharge> selectByCriteria(BorrowRechargeCriteria example);

    BorrowRecharge selectById(Integer id);

    int updateByCriteria(@Param("record") BorrowRecharge record, @Param("example") BorrowRechargeCriteria example);

    int updateById(BorrowRecharge record);
}