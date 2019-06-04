package com.plwang.springcloud.service;

import java.util.List;

import com.plwang.springcloud.entity.Dept;

public interface DeptService {
	public int deleteByPrimaryKey(Long deptno);

	public int insert(Dept record);

	public int insertSelective(Dept record);

	public Dept selectByPrimaryKey(Long deptno);

	public int updateByPrimaryKeySelective(Dept record);

	public int updateByPrimaryKey(Dept record);
	
	public List<Dept> findAll();
}
