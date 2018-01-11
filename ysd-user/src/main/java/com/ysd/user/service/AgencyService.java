package com.ysd.user.service;

import com.ysd.user.entity.AgencyReady;

/**
 * @author xishengchun on 2017-09-13.
 * 服务商操作
 */
public interface AgencyService {

    /**
     * 申请服务商
     * 保存到临时申请表
     * @param agencyReady
     */
    AgencyReady apply(AgencyReady agencyReady);


    /**
     * 服务商通过审核
     * @param agencyReadyId
     * 临时表中的申请id
     * @return
     */
    boolean allow(Long agencyReadyId);

    /**
     * 服务商申请被拒绝
     * @param agencyReadyId
     * @return
     */
    boolean reject(Long agencyReadyId);

}
