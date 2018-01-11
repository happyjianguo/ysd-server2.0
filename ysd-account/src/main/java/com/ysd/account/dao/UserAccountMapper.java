package com.ysd.account.dao;

import com.ysd.account.criteria.UserAccountCriteria;
import com.ysd.account.entity.UserAccount;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountMapper extends BaseMapper {
    long countByCriteria(UserAccountCriteria example);

    int deleteByCriteria(UserAccountCriteria example);

    int deleteById(Integer id);

    int insert(UserAccount record);

    List<UserAccount> selectByCriteria(UserAccountCriteria example);

    UserAccount selectById(Integer id);

    int updateByCriteria(@Param("record") UserAccount record, @Param("example") UserAccountCriteria example);

    int updateById(UserAccount record);

    UserAccount selectByUserId(Integer userId);

    int updateAmount(UserAccount userAccount);//充值回调使用
}