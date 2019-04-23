package com.manager.service.sys;

import com.manager.common.service.BaseService;
import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.User;

public interface UserService extends BaseService<User> {
    UserDTO getUserDTOByName(String username);
}
