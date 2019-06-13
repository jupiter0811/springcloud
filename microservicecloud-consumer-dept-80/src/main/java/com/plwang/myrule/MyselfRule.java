package com.plwang.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

/**
 * 自定义ribbon负载均衡，需继承AbstractLoadBalancerRule，并重写choose方法
 * @author Administrator
 *
 */
@Configuration
public class MyselfRule extends AbstractLoadBalancerRule {
	@Bean
	public IRule myRule() {
		return new RandomRule();
	}

	@Override
	public Server choose(Object key) {
		ILoadBalancer lb = getLoadBalancer();
		// TODO 这里写负载均衡的逻辑
		return null;
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
	}
}
