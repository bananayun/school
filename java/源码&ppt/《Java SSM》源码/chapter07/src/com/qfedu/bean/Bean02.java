package com.qfedu.bean;

import org.springframework.beans.factory.InitializingBean;

public class Bean02 implements InitializingBean {
	private String bid;
	private String name;

	public Bean02() {
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean02 [bid=" + bid + ", name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean的初始化完成，调用afterPropertiesSet()方法");
		System.out.println(this.toString());
	}
}
