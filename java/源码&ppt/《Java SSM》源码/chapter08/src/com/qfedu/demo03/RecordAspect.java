package com.qfedu.demo03;

import java.util.Date;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class RecordAspect {
	@Pointcut("execution(* com.qfedu.demo03.Service*.*(..))")
	public void record() {
	}

	@Around("record()")
	public Object recordTimer(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		// 获取目标对象的类名称
		String clazzName = thisJoinPoint.getTarget().getClass().getName();
		// 获取目标对象的方法名称
		String methodName = thisJoinPoint.getSignature().getName();
		// 计算目标对象对应方法执行所耗时间
		long startTime = System.currentTimeMillis();
		Object result = thisJoinPoint.proceed();
		long time = System.currentTimeMillis() - startTime;
		Record record = new Record();
		record.setExpendTime(time); // 记录执行所耗时间
		record.setClassName(clazzName); // 记录类名称
		record.setMethodName(methodName); // 记录对应方法名称
		record.setRecordTime(new Date()); // 记录时间
		System.out.println(record.toString());
		return result;
	}
}
