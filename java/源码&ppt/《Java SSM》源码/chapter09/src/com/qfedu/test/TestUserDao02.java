package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Student;
import com.qfedu.dao.UserDao;

public class TestUserDao02 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = context.getBean("userDao02", UserDao.class);
		Student student = context.getBean("student", Student.class);
		student.setSname("WuJiu");
		student.setAge("19");
		student.setCourse("Java");
		userDao.insert(student);
	}
}
