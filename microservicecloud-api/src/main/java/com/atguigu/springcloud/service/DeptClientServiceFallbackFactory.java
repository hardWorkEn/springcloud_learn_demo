package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {

		return new DeptClientService() {

			@Override
			public Dept get(long id) {
				return new Dept().setDeptNo(id).setDname("该ID：" + id + "没有对应的信息，null--@HystrixCommand服务降级")
						.setDb_source("no this database in mysql");
			}

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
	}

}
