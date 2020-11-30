package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
import com.qfedu.bean.Sch;

public class TestSpring10 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sch sch = applicationContext.getBean("sch", Sch.class);
		System.out.println(sch);
		AbstractApplicationContext ac = (AbstractApplicationContext) applicationContext;
		ac.registerShutdownHook();
	}
}
