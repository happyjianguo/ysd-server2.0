package com.ysd.account.dao;

import com.ysd.account.criteria.UserAccountRechargeCriteria;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountRechargeMapper extends BaseMapper {
    long countByCriteria(UserAccountRechargeCriteria example);

    int deleteByCriteria(UserAccountRechargeCriteria example);

    int deleteById(Integer id);

    int insert(UserAccountRecharge record);

    List<UserAccountRecharge> selectByExampleWithBLOBs(UserAccountRechargeCriteria example);

    List<UserAccountRecharge> selectByCriteria(UserAccountRechargeCriteria example);

    UserAccountRecharge selectById(Integer id);

    int updateByCriteria(@Param("record") UserAccountRecharge record, @Param("example") UserAccountRechargeCriteria example);

    int updateById(UserAccountRecharge record);

    int updateByNotify(UserAccountRecharge uar);
}