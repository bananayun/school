package com.qfedu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Stu {
	@Value("001")
	private int sid;
	@Value("ZhangSan")
	private String name;
	private String age;
	private String course;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", name=" + name + ", age=" + age + ", " + "course=" + course + "]";
	}
}
