package com.ysd.user.dao;

import com.ysd.base.dao.BaseMapper;
import com.ysd.user.criteria.AgencyCriteria;
import com.ysd.user.entity.Agency;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgencyMapper extends BaseMapper {
    long countByCriteria(AgencyCriteria example);

    int deleteByCriteria(AgencyCriteria example);

    int deleteById(Long id);

    int insert(Agency record);

    List<Agency> selectByExampleWithBLOBs(AgencyCriteria example);

    List<Agency> selectByCriteria(AgencyCriteria example);

    Agency selectById(Long id);

    int updateByCriteria(@Param("record") Agency record, @Param("example") AgencyCriteria example);

    int updateById(Agency record);
}