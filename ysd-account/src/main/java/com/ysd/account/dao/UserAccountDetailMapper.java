package com.ysd.account.dao;

import com.ysd.account.criteria.UserAccountDetailCriteria;
import com.ysd.account.entity.UserAccountDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountDetailMapper extends BaseMapper {
    long countByCriteria(UserAccountDetailCriteria example);

    int deleteByCriteria(UserAccountDetailCriteria example);

    int deleteById(Integer id);

    int insert(UserAccountDetail record);

    List<UserAccountDetail> selectByCriteria(UserAccountDetailCriteria example);

    UserAccountDetail selectById(Integer id);

    int updateByCriteria(@Param("record") UserAccountDetail record, @Param("example") UserAccountDetailCriteria example);

    int updateById(UserAccountDetail record);
}