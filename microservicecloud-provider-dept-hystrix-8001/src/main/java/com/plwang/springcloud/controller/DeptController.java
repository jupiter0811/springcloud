package com.plwang.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.plwang.springcloud.entity.Dept;
import com.plwang.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	// 一旦方法调用失败并抛出异常后，会调用fallbackMethod指定的类进行后续处理
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable Long id) {
		Dept dept = deptService.selectByPrimaryKey(id);
		if (null == dept) {
			throw new RuntimeException("出错了，该ID:" + id + " 没有对应的信息！");
		}
		return dept;
	}

	public Dept processHystrix_Get(@PathVariable Long id) {
		Dept dept = new Dept();
		dept.setDeptno(id);
		dept.setDname("该ID没有对应的数据");
		dept.setDbSource("no this dbsouce in mysql");
		return dept;
	}
}
