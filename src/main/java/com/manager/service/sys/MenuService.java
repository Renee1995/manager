package com.manager.service.sys;

import java.util.List;

import com.manager.common.service.BaseService;
import com.manager.dto.sys.MenuDTO;
import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.Menu;
import com.manager.entity.sys.User;

public interface MenuService extends BaseService<Menu> {

    List<MenuDTO> getUserMenuList(String userId);

}
