package com.manager.service.sys.impl;

import cn.hutool.core.util.StrUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.Role;
import com.manager.service.sys.MyUserDetailService;
import com.manager.service.sys.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: manager
 * @description:
 * @author: zhangwanxin
 * @create: 2019-03-01 17:28
 **/
@Service
public class MyUserDetailServiceImpl implements MyUserDetailService {

    @Autowired
    UserService userService;
    @Autowired
    private SessionRegistry sessionRegistry;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(StrUtil.isBlank(username)){
            throw new UsernameNotFoundException("用户不存在");
        }

        UserDTO userDTO = userService.getUserDTOByName(username);
        if(userDTO == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        // 获得所有登录用户的信息
        List<Object> list = sessionRegistry.getAllPrincipals();
        for (Object object : list) {
            if (((User) object).getUsername().equals(userDTO.getUsername())) {
                //当前用户已经在线，登录失败
            }

            System.out.println("getAllPrincipals的遍历" + ((User) object).getUsername());
        }

        // 得到当前登录用户的信息  将得到的角色封装 在后面页面认证成功后会用到
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : userDTO.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
            System.out.println("拥有的角色:" + role.getRoleName());
        }
        return new User(userDTO.getUsername(), userDTO.getPassword(), authorities);

    }
}
