package com.plwang.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
	private Long deptno;
	private String dname;
	private String dbSource;

//	public static void main(String[] args) {
//		DeptEntity dept = new DeptEntity();
//		dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
//	}
}
