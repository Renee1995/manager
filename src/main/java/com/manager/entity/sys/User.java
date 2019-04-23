package com.manager.entity.sys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.Table;

import com.manager.common.entity.BaseEntity;

@Table(name="t_sys_user")
@Data
@EqualsAndHashCode(callSuper=true)
public class User extends BaseEntity {

    @Id
    private String id;

    private String username;

    private String password;

    private String phone;

    private String realname;

    private Integer sex;

    private String email;

    private String headImage;

    private String introduction;

    private String isEnable;

}