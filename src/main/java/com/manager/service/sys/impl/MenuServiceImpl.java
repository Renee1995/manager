package com.manager.service.sys.impl;

import org.springframework.stereotype.Service;

import com.manager.common.service.impl.BaseServiceImpl;
import com.manager.dao.sys.MenuDao;
import com.manager.dto.sys.MenuDTO;
import com.manager.entity.sys.Menu;
import com.manager.service.sys.MenuService;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu, MenuDao> implements MenuService {

    /**
     * 利用java8的流和lambda表达式 list去重
     * @param userId
     * @return
     */
    @Override
    public List<MenuDTO> getUserMenuList(String userId) {

        List<MenuDTO> userMenuList = dao.getUserMenuList(userId);

        List<MenuDTO> collect = userMenuList.stream().filter(distinctByKey(MenuDTO::getId))
                .collect(Collectors.toList());
        return collect;
    }
    /**
     * 函数式接口 T -> bollean
     * @param keyExtractor
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>(16);
        return t -> map.putIfAbsent(keyExtractor.apply(t),Boolean.TRUE) == null;
    }
}
