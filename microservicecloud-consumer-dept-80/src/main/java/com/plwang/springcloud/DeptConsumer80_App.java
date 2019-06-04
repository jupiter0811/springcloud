package com.plwang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.plwang.myrule.MyselfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICELOUD-DEPT", configuration = MyselfRule.class)//自定义ribbon负载均衡
public class DeptConsumer80_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
