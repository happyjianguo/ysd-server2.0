package com.ysd.account.dao;

import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.entity.AccountBank;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountBankMapper extends BaseMapper {
    long countByCriteria(AccountBankCriteria example);

    int deleteByCriteria(AccountBankCriteria example);

    int deleteById(Integer id);

    int insert(AccountBank record);

    List<AccountBank> selectByCriteria(AccountBankCriteria example);

    AccountBank selectById(Integer id);

    int updateByCriteria(@Param("record") AccountBank record, @Param("example") AccountBankCriteria example);

    int updateById(AccountBank record);

    List<AccountBank> queryByUserId(Integer id);

    int updateByPhoneCode(Map<String,Object> map);

}