package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.School;
import com.qfedu.bean.Student;

public class TestSpring05 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		School school = applicationContext.getBean("school", School.class);
		int sid = school.getSid();
		System.out.println("sid:" + sid);
		Student stu = school.getStu();
		System.out.println(stu);
	}
}
