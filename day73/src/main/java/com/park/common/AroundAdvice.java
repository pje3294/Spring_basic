package com.park.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//모든메서드()->수행시간을 화면(console)에 출력해주세요

@Service
@Aspect
public class AroundAdvice {

	@Around("PointcutCommon.bPointcut()")
	public Object printLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(pjp.getSignature().getName() + "에서 출력됨");
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("수행시간: "+ sw.getTotalTimeMillis() + "(밀리초)");
		
		return obj;
		
		
		
		
	}
}
