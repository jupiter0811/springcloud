package com.plwang.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

@Configuration // --相当于springmvc的applicationContext.xml
public class ConfigBean {
	@Bean
	@LoadBalanced// ribbon负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean 在主启动类可以自定义ribbon负载均衡策略
//	public IRule myRule() {
//		//return new WeightedResponseTimeRule(); // 切换为权重负载均衡策略
//		return new RandomRule(); //切换为随机负载均衡策略,ribbon提供了7种默认策略
//	}
}
