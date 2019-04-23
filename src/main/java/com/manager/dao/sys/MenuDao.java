package com.manager.dao.sys;

import java.util.List;

import com.manager.common.mapper.BaseMapper;
import com.manager.dto.sys.MenuDTO;
import com.manager.entity.sys.Menu;

public interface MenuDao extends BaseMapper<Menu> {
    List<MenuDTO> getUserMenuList(String userId);
}
