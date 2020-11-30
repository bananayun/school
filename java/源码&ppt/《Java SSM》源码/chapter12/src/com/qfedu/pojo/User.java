package com.qfedu.pojo;

import java.util.Date;



public class User {
	private String name;
	private Integer age;
	private String sex;
	private Date date;
	public User(String name, Integer age, String sex, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.date = date;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", date=" + date + "]";
	}
	
}
