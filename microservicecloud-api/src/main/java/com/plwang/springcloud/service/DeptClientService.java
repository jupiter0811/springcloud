package com.plwang.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plwang.springcloud.entity.Dept;

@FeignClient(value = "MICROSEVICECLOUD-DEPT")
public interface DeptClientService {
	public int deleteByPrimaryKey(Long deptno);

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public int insert(@RequestBody Dept dept);

	public int insertSelective(Dept record);

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept selectByPrimaryKey(@PathVariable Long id);

	public int updateByPrimaryKeySelective(Dept record);

	public int updateByPrimaryKey(Dept record);
	
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> findAll();
}
