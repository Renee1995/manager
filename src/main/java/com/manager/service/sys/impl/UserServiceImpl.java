package com.manager.service.sys.impl;

import org.springframework.stereotype.Service;

import com.manager.common.service.impl.BaseServiceImpl;
import com.manager.dao.sys.UserDao;
import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.User;
import com.manager.service.sys.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserDao> implements UserService {

    @Override
    public UserDTO getUserDTOByName(String username) {
        return dao.getUserDTOByName(username);
    }
}
