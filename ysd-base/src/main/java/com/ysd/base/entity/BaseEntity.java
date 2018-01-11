package com.ysd.base.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author xishengchun on 2017-09-10.
 */
public class BaseEntity {
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
