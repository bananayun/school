package com.qfedu.bean;

import org.springframework.beans.factory.DisposableBean;

public class Bean04 implements DisposableBean {
	private String bid;
	private String name;

	public Bean04() {
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
		return "Bean04 [bid=" + bid + ", name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean实例即将销毁，调用destroy()方法");
		System.out.println(this.toString());
	}
}
