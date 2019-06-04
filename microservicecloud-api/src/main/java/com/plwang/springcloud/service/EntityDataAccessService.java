package com.plwang.springcloud.service;

import java.util.List;
import java.util.Map;

public interface EntityDataAccessService<T> {
	
	int save(T entity);
	
	List<T> save(List<T> entities);
	
	int update(T entity);

	int update(T entity, boolean saveNull);
	
	int removeByBm(String bm);
	
	T findByBm(String bm);
	
	List<T> findList(Map<String, Object> parameters);
	
	int count(Map<String, Object> parameters);
}
