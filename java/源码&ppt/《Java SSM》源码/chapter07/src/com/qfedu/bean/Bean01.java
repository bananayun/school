package com.qfedu.bean;

public class Bean01 {
	private String bid;
	private String name;

	public Bean01() {
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
		return "Bean01 [bid=" + bid + ", name=" + name + "]";
	}

	public void init() {
		System.out.println("Bean的初始化完成，调用init()方法");
		System.out.println(this.toString());
	}
}
