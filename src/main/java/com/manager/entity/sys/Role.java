package com.manager.entity.sys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.Table;

import com.manager.common.entity.BaseEntity;

@Table(name="t_sys_role")
@Data
@EqualsAndHashCode(callSuper=true)
public class Role extends BaseEntity {

    @Id
    private String id;

    private String roleName;

    private String roleDescribe;

    private String isEnable;


}