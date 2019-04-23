package com.manager.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer isRemove;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

}
