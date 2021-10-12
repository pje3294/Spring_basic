package com.park.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//���޼���()->����ð��� ȭ��(console)�� ������ּ���

@Service
@Aspect
public class AroundAdvice {

	@Around("PointcutCommon.bPointcut()")
	public Object printLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(pjp.getSignature().getName() + "���� ��µ�");
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("����ð�: "+ sw.getTotalTimeMillis() + "(�и���)");
		
		return obj;
		
		
		
		
	}
}
