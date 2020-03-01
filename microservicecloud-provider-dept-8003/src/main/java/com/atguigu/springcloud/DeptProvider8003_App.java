package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient				//自动注册到注册中心
@EnableDiscoveryClient			//服务发现
public class DeptProvider8003_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}