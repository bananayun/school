package com.qfedu.bean;

public class Student {
	// 无参构造
	public Student() {
		super();
		System.out.println("Student对象创建了");
	}

	// 创建一个成员变量，并给出get/set方法
	private String msg = null;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	// study()方法中引用成员变量
	public void study() {
		System.out.println("学生在学习" + msg);
	}
}
