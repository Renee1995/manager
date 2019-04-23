package com.manager.dao.sys;

import com.manager.common.mapper.BaseMapper;
import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.User;

public interface UserDao extends BaseMapper<User> {
    UserDTO getUserDTOByName(String username);
}
