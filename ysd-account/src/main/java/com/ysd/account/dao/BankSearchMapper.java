package com.ysd.account.dao;

import com.ysd.account.criteria.BankSearchCriteria;
import com.ysd.account.entity.BankSearch;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankSearchMapper extends BaseMapper {
    long countByCriteria(BankSearchCriteria example);

    int deleteByCriteria(BankSearchCriteria example);

    int deleteById(Long id);

    int insert(BankSearch record);

    List<BankSearch> selectByCriteria(BankSearchCriteria example);

    BankSearch selectById(Long id);

    int updateByCriteria(@Param("record") BankSearch record, @Param("example") BankSearchCriteria example);

    int updateById(BankSearch record);


    List<BankSearch> selectRechargeNotEnd();

    List<BankSearch> selectCashNotEnd();
}