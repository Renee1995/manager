package com.manager.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.manager.common.entity.BaseEntity;
import com.manager.common.mapper.BaseMapper;
import com.manager.common.service.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

public class BaseServiceImpl<T extends BaseEntity,Mapper extends BaseMapper<T>> implements BaseService<T> {

    @Autowired
    public Mapper dao;

    @Override
    public T queryById(String id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public T queryOne(T entity) {
        return dao.selectOne(entity);
    }

    @Override
    public List<T> queryAllList() {
        return dao.selectAll();
    }

    @Override
    public List<T> queryListByWhere(T entity) {
        return dao.select(entity);
    }

    @Override
    public PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T entity) {
        PageHelper.startPage(page, rows);
        List<T> list = this.queryListByWhere(entity);
        return new PageInfo<T>(list);
    }

    @Override
    public Integer queryCountByWhere(T entity) {
        return dao.selectCount(entity);
    }

    @Override
    public List<T> queryListByExample(Example example) {
        return dao.selectByExample(example);
    }

    @Override
    public Integer queryCountByExample(Example example) {
        return dao.selectCountByExample(example);
    }


    @Override
    public Integer save(T entity) {
        entity.setCreateTime(new Date());
        return dao.insert(entity);
    }

    @Override
    public T saveReturnPersistentObject(T entity) {
        Integer count = this.save(entity);
        if(count==1){
            return entity;
        }else{
            throw new RuntimeException("插入失败");
        }
    }

    @Override
    public Integer saveSelective(T entity) {
        entity.setCreateTime(new Date());
        return dao.insertSelective(entity);
    }

    @Override
    public Integer update(T entity) {
        entity.setUpdateTime(new Date());
        return dao.updateByPrimaryKey(entity);
    }

    @Override
    public Integer updateSelective(T entity) {
        entity.setUpdateTime(new Date());
        return dao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public Integer deleteById(String id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(Class<T> clazz, String property, List<Object> values) {
        Example example = new Example(clazz);
        example.createCriteria().andIn(property, values);
        return dao.deleteByExample(example);
    }

    @Override
    public Integer deleteByWhere(T entity) {
        return dao.delete(entity);
    }

}
