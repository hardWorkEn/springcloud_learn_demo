package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
//@AllArgsConstructor		//全参构造
@NoArgsConstructor 			//空参构造
@Data						//set/get
@Accessors(chain = true)	//链式写法
public class Dept implements Serializable{

	private Long deptNo;	//主键
	private String dname;	//部门名称
	private String db_source;	//来自哪个数据库
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
}
