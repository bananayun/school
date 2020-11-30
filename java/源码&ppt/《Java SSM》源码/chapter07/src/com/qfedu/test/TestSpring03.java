package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Mix;

public class TestSpring03 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Mix mix = applicationContext.getBean("mix", Mix.class);
		// 输出Mix类对象信息
		System.out.println(mix);
	}
}
