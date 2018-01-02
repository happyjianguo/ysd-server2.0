package com.ysd.asset.dao;

import com.ysd.asset.criteria.FangkuanCriteria;
import com.ysd.asset.entity.Fangkuan;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FangkuanMapper extends BaseMapper {
    long countByCriteria(FangkuanCriteria example);

    int deleteByCriteria(FangkuanCriteria example);

    int deleteById(Integer id);

    int insert(Fangkuan record);

    List<Fangkuan> selectByCriteria(FangkuanCriteria example);

    Fangkuan selectById(Integer id);

    int updateByCriteria(@Param("record") Fangkuan record, @Param("example") FangkuanCriteria example);

    int updateById(Fangkuan record);
}