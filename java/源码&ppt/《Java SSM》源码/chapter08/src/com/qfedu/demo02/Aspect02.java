package com.qfedu.demo02;

import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class Aspect02 {
	// 切点
	@Pointcut("execution(* com.qfedu.demo02.UserServiceImpl.*(..))")
	public void pointcut() {
	}

	// 前置通知
	@Before("pointcut()")
	public void before() {
		System.out.println("这是Aspect02的前置通知!!");
	}

	// 后置通知
	@After("pointcut()")
	public void after() {
		System.out.println("这是Aspect02的后置通知!!");
	}
}
