package com.qfedu.demo02;

import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;

@Aspect
public class Aspect03 implements Ordered {
	@Pointcut("execution(* com.qfedu.demo02.UserServiceImpl.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		System.out.println("这是Aspect03的前置通知!!");
	}

	@After("pointcut()")
	public void after() {
		System.out.println("这是Aspect03的后置通知!!");
	}

	// 该方法的返回值指定切面优先级
	@Override
	public int getOrder() {
		return 1;
	}
}
