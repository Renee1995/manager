package com.manager.dto.sys;

import java.util.ArrayList;
import java.util.List;

import com.manager.entity.sys.Menu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: manager
 * @description: 用户信息
 * @author: zhangwanxin
 * @create: 2019-03-01 17:58
 **/
@Getter
@Setter
@EqualsAndHashCode
public class MenuDTO extends Menu {

    private List<Menu> children = new ArrayList<Menu>();

}
