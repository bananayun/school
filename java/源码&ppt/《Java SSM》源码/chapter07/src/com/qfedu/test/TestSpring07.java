package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Person;

public class TestSpring07 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取id为person01的Person实例
		Person person01_1 = applicationContext.getBean("person01", Person.class);
		Person person01_2 = applicationContext.getBean("person01", Person.class);
		// 获取id为person02的Person实例
		Person person02_1 = applicationContext.getBean("person02", Person.class);
		Person person02_2 = applicationContext.getBean("person02", Person.class);
		// 判断两次获取的id为person01的Person实例是否相等
		System.out.println(person01_1 == person01_2);
		// 判断两次获取的id为person02的Person实例是否相等
		System.out.println(person02_1 == person02_2);
	}
}
