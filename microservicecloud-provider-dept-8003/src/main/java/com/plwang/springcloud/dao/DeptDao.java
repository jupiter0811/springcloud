package com.plwang.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plwang.springcloud.entity.Dept;


@Mapper
public interface DeptDao extends BaseDao<Dept> {
    List<Dept> findAll();
}
