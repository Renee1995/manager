package com.manager.common.service;

import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BaseService<T> {
    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    T queryById(String id);

    /**
     * 根据条件查询一条数据，如果有多条数据会抛出异常
     *
     * @param entity
     * @return
     */
    T queryOne(T entity);

    /**
     * 查询所有数据
     *
     * @param
     * @return
     */
    List<T> queryAllList();

    /**
     * 根据条件查询数据列表
     *
     * @param entity
     * @return
     */
    List<T> queryListByWhere(T entity);

    /**
     * 分页查询
     *
     * @param entity
     * @return
     */
    PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T entity);

    /**
     * 查询总条数
     *
     * @param entity
     * @return
     */
    Integer queryCountByWhere(T entity);

    /**
     * 根据条件查询
     *
     * @param example
     * @return
     */
    List<T> queryListByExample(Example example);

    /**
     * 根据条件查询
     *
     * @param example
     * @return
     */
    Integer queryCountByExample(Example example);

    /**
     * 新增数据，返回成功的条数
     *
     * @param entity
     * @return
     */
    Integer save(T entity);

    /**
     * 新增数据，返回持久化对象
     *
     * @param entity
     * @return
     */
    T saveReturnPersistentObject(T entity);

    /**
     * 新增数据，使用不为null的字段，返回成功的条数
     *
     * @param entity
     * @return
     */
    Integer saveSelective(T entity);

    /**
     * 修改数据，返回成功的条数
     *
     * @param entity
     * @return
     */
    Integer update(T entity);

    /**
     * 修改数据，使用不为null的字段，返回成功的条数
     *
     * @param entity
     * @return
     */
    Integer updateSelective(T entity);

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    Integer deleteById(String id);

    /**
     * 批量删除
     *
     * @param clazz
     * @param property
     * @param values
     * @return
     */
    Integer deleteByIds(Class<T>clazz, String property, List<Object>values);

    /**
     * 根据条件做删除
     *
     * @param entity
     * @return
     */
    Integer deleteByWhere(T entity);

}
