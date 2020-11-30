package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Student;
import com.qfedu.dao.UserDao;

public class TestUserDao01 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = context.getBean("userDao01", UserDao.class);
		Student student = context.getBean("student", Student.class);
		student.setSname("ZhouBa");
		student.setAge("20");
		student.setCourse("Java");
		userDao.insert(student);
	}
}
