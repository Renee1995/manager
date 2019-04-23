package com.manager.entity.loginrecord;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.Table;

import com.manager.common.entity.BaseEntity;

@Table(name="t_user_login_record")
@Data
@EqualsAndHashCode(callSuper=true)
public class UserLoginRecord extends BaseEntity {
    @Id
    private String id;

    private String userId;

    private String loginIp;

    private String loginDevic;

    private String loginAddress;

    private String loginCoordinate;

}