package com.manager.dto.sys;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import com.manager.entity.sys.Role;
import com.manager.entity.sys.User;

/**
 * @program: manager
 * @description: 用户信息
 * @author: zhangwanxin
 * @create: 2019-03-01 17:58
 **/
@Getter
@Setter
public class UserDTO extends User {

    private Set<Role> roles=new HashSet<Role>();

}
