package com.ysd.user.dao;

import com.ysd.base.dao.BaseMapper;
import com.ysd.user.criteria.AgencyReadyCriteria;
import com.ysd.user.entity.AgencyReady;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgencyReadyMapper extends BaseMapper {
    long countByCriteria(AgencyReadyCriteria example);

    int deleteByCriteria(AgencyReadyCriteria example);

    int deleteById(Long id);

    int insert(AgencyReady record);

    List<AgencyReady> selectByCriteria(AgencyReadyCriteria example);

    AgencyReady selectById(Long id);

    int updateByCriteria(@Param("record") AgencyReady record, @Param("example") AgencyReadyCriteria example);

    int updateById(AgencyReady record);
}