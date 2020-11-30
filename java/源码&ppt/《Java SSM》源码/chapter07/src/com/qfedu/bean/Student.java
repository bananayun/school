package com.qfedu.bean;

public class Student {
	private int sid;
	private String name;
	private String age;
	private String course;

	public Student(int sid, String name, String age, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
}
