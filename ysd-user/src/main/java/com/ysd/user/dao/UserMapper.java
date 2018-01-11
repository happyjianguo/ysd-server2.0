package com.ysd.user.dao;

import com.ysd.base.dao.BaseMapper;
import com.ysd.user.criteria.UserCriteria;
import com.ysd.user.entity.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper {
    long countByCriteria(UserCriteria example);

    int deleteByCriteria(UserCriteria example);

    int deleteById(Integer id);

    int insert(User record);

    List<User> selectByCriteria(UserCriteria example);

    User selectById(Integer id);

    int updateByCriteria(@Param("record") User record, @Param("example") UserCriteria example);

    int updateById(User record);


    int updateByPhoneCode(Map<String,Object> map);
}