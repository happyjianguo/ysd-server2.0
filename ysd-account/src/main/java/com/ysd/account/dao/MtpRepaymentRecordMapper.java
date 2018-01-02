package com.ysd.account.dao;

import com.ysd.account.criteria.MtpRepaymentRecordCriteria;
import com.ysd.account.entity.MtpRepaymentRecord;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtpRepaymentRecordMapper extends BaseMapper {
    long countByCriteria(MtpRepaymentRecordCriteria example);

    int deleteByCriteria(MtpRepaymentRecordCriteria example);

    int deleteById(Integer id);

    int insert(MtpRepaymentRecord record);

    List<MtpRepaymentRecord> selectByCriteria(MtpRepaymentRecordCriteria example);

    MtpRepaymentRecord selectById(Integer id);

    int updateByCriteria(@Param("record") MtpRepaymentRecord record, @Param("example") MtpRepaymentRecordCriteria example);

    int updateById(MtpRepaymentRecord record);
}