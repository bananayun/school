package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class TestSpring09 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 关闭容器，此时Bean实例将被销毁
		AbstractApplicationContext ac = (AbstractApplicationContext) applicationContext;
		ac.registerShutdownHook();
	}
}
