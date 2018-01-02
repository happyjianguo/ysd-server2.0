package com.ysd.account.dao;

import com.ysd.account.criteria.AccountCashCriteria;
import com.ysd.account.entity.AccountCash;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountCashMapper extends BaseMapper {
    long countByCriteria(AccountCashCriteria example);

    int deleteByCriteria(AccountCashCriteria example);

    int deleteById(Integer id);

    int insert(AccountCash record);

    List<AccountCash> selectByCriteria(AccountCashCriteria example);

    AccountCash selectById(Integer id);

    int updateByCriteria(@Param("record") AccountCash record, @Param("example") AccountCashCriteria example);

    int updateById(AccountCash record);

    int updateByNotify(Map<String,Object> map);

}