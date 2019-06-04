package com.plwang.springcloud.dao;


public interface BaseDao<T> {
	int deleteByPrimaryKey(Long deptno);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long deptno);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
