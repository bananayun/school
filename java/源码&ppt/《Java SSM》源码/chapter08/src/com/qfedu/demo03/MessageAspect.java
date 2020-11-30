package com.qfedu.demo03;

import java.util.Date;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MessageAspect {
	@Pointcut("execution(* com.qfedu.demo03.Service*.*(..))")
	public void exceptionMsg() {
	}

	@Around("exceptionMsg()")
	public Object msgMethod(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		// 获取目标对象的类名称
		String clazzName = thisJoinPoint.getTarget().getClass().getName();
		// 获取目标对象的方法名称
		String methodName = thisJoinPoint.getSignature().getName();
		try {
			return thisJoinPoint.proceed();
		} catch (MyException e) {
			Message msg = new Message();
			// 封装异常信息
			msg.setClassName(thisJoinPoint.getTarget().getClass().getName());
			msg.setMethodName(thisJoinPoint.getSignature().getName());
			msg.setRecordTime(new Date());
			msg.setExceptionMsg(e.getMsg());
			System.out.println(msg.toString());
			return null;
		}
	}
}
