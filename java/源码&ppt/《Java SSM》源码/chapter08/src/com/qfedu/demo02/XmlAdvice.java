package com.qfedu.demo02;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
	// 前置通知
	public void before() {
		System.out.println("这是前置通知");
	}

	// 后置通知
	public void afterReturning() {
		System.out.println("这是后置通知(方法不出现异常时调用)");
	}

	// 环绕通知
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("这是环绕通知之前的部分!!");
		// 调用目标方法
		Object object = point.proceed();
		System.out.println("这是环绕通知之后的部分!!");
		return object;
	}

	// 异常通知
	public void afterException() {
		System.out.println("异常通知!!");
	}

	// 后置通知
	public void after() {
		System.out.println("这是后置通知!!");
	}
}
