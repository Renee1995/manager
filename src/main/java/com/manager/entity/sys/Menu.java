package com.manager.entity.sys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.Table;

import com.manager.common.entity.BaseEntity;

@Table(name="t_sys_menu")
@Data
@EqualsAndHashCode(callSuper=true)
public class Menu extends BaseEntity {

    @Id
    private String id;

    private String menuName;

    private String menuUrl;

    private String parentId;

    private Integer menuLevel;

    private Integer sort;

    private String icon;

    private String menuDescribe;

    private String isEnable;


}