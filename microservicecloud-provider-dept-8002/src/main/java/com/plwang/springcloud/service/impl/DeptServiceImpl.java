package com.plwang.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plwang.springcloud.dao.DeptDao;
import com.plwang.springcloud.entity.Dept;
import com.plwang.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public int deleteByPrimaryKey(Long deptno) {
		return deptDao.deleteByPrimaryKey(deptno);
	}

	@Override
	public int insert(Dept record) {
		return deptDao.insert(record);
	}

	@Override
	public int insertSelective(Dept record) {
		return deptDao.insertSelective(record);
	}

	@Override
	public Dept selectByPrimaryKey(Long deptno) {
		return deptDao.selectByPrimaryKey(deptno);
	}

	@Override
	public int updateByPrimaryKeySelective(Dept record) {
		return deptDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Dept record) {
		return deptDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}
}
