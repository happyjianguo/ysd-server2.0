package com.ysd.account.dao;

import com.ysd.account.criteria.MtpRepaymentBatchFileCriteria;
import com.ysd.account.entity.MtpRepaymentBatchFile;
import com.ysd.base.dao.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtpRepaymentBatchFileMapper extends BaseMapper {
    long countByCriteria(MtpRepaymentBatchFileCriteria example);

    int deleteByCriteria(MtpRepaymentBatchFileCriteria example);

    int deleteById(Integer id);

    int insert(MtpRepaymentBatchFile record);

    List<MtpRepaymentBatchFile> selectByCriteria(MtpRepaymentBatchFileCriteria example);

    MtpRepaymentBatchFile selectById(Integer id);

    int updateByCriteria(@Param("record") MtpRepaymentBatchFile record, @Param("example") MtpRepaymentBatchFileCriteria example);

    int updateById(MtpRepaymentBatchFile record);
}