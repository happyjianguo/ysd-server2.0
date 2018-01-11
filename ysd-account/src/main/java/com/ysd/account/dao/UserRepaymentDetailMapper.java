package com.ysd.account.dao;

import com.ysd.account.criteria.UserRepaymentDetailCriteria;
import com.ysd.account.entity.UserRepaymentDetail;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRepaymentDetailMapper extends BaseMapper {
    long countByCriteria(UserRepaymentDetailCriteria example);

    int deleteByCriteria(UserRepaymentDetailCriteria example);

    int deleteById(Integer id);

    int insert(UserRepaymentDetail record);

    List<UserRepaymentDetail> selectByCriteria(UserRepaymentDetailCriteria example);

    UserRepaymentDetail selectById(Integer id);

    int updateByCriteria(@Param("record") UserRepaymentDetail record, @Param("example") UserRepaymentDetailCriteria example);

    int updateById(UserRepaymentDetail record);
}