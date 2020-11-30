package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.School;
import com.qfedu.bean.Student;

public class TestSpring04 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		School school = applicationContext.getBean("school", School.class);
		// 通过School对象获取Student对象,并输出Student对象的信息
		Student stu = school.getStu();
		System.out.println(stu);
	}
}
