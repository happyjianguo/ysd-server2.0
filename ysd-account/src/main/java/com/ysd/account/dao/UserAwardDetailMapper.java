package com.ysd.account.dao;

import com.ysd.account.criteria.UserAwardDetailCriteria;
import com.ysd.account.entity.UserAwardDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAwardDetailMapper extends BaseMapper {
    long countByCriteria(UserAwardDetailCriteria example);

    int deleteByCriteria(UserAwardDetailCriteria example);

    int deleteById(Integer id);

    int insert(UserAwardDetail record);

    List<UserAwardDetail> selectByExampleWithBLOBs(UserAwardDetailCriteria example);

    List<UserAwardDetail> selectByCriteria(UserAwardDetailCriteria example);

    UserAwardDetail selectById(Integer id);

    int updateByCriteria(@Param("record") UserAwardDetail record, @Param("example") UserAwardDetailCriteria example);

    int updateById(UserAwardDetail record);
}