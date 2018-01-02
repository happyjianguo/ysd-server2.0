package com.ysd.user.dao;

import com.ysd.base.dao.BaseMapper;
import com.ysd.user.criteria.UserInfoCriteria;
import com.ysd.user.entity.UserInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper extends BaseMapper {
    long countByCriteria(UserInfoCriteria example);

    int deleteByCriteria(UserInfoCriteria example);

    int deleteById(Integer id);

    int insert(UserInfo record);

    List<UserInfo> selectByCriteria(UserInfoCriteria example);

    UserInfo selectById(Integer id);

    int updateByCriteria(@Param("record") UserInfo record, @Param("example") UserInfoCriteria example);

    int updateById(UserInfo record);
}