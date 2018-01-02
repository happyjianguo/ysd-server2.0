package com.ysd.user.service.impl;

import com.ysd.user.dao.AgencyReadyMapper;
import com.ysd.user.entity.AgencyReady;
import com.ysd.user.exception.AgencyException;
import com.ysd.user.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xishengchun on 2017-09-13.
 *
 */
@Service
public class AgencyServiceImpl implements AgencyService {

    @Autowired
    private AgencyReadyMapper agencyReadyMapper;

    @Override
    public AgencyReady apply(AgencyReady agencyReady) {
        if (agencyReady == null) {
            throw new AgencyException("服务商申请失败:参数异常");
        }

        // TODO 必填项判断

        // TODO 相同手机号,相同的身份证号是否需要判断?

        // TODO 安全密码生成

        // TODO 冗余省市区字段查询

        // TODO 图片处理?

        // TODO 保存到表中

        return agencyReady;
    }

    @Override
    public boolean allow(Long agencyReadyId) {
        if (agencyReadyId == null) {
            throw new AgencyException("审核通过服务商失败:服务商ID无效");
        }

        AgencyReady agencyReady = agencyReadyMapper.selectById(agencyReadyId);
        if (agencyReady == null) {
            throw new AgencyException("审核通过服务商失败:服务商不存在")
                    .set("agencyReadyId", agencyReadyId)
                    ;
        }

        // TODO 审核通过后保存到fy_user表中




        return false;
    }

    @Override
    public boolean reject(Long agencyReadyId) {
        if (agencyReadyId == null) {
            throw new AgencyException("审批拒绝服务商失败:服务商ID无效");
        }

        AgencyReady agencyReady = agencyReadyMapper.selectById(agencyReadyId);
        if (agencyReady == null) {
            throw new AgencyException("审核拒绝服务商失败:服务商不存在")
                    .set("agencyReadyId", agencyReadyId)
                    ;
        }

        // TODO 更新相关表拒绝日志

        return false;
    }
}
