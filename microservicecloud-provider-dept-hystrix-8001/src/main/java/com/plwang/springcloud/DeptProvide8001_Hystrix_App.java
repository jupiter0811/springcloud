package com.plwang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//带熔断器的8001，可以替代之前的8001
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注入到euruka中
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 对hystrix熔断器的支持
public class DeptProvide8001_Hystrix_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvide8001_Hystrix_App.class, args);
	}

}
