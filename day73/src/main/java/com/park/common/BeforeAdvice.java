package com.park.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect // 위빙처리의 대상 == 포인트컷+어드바이스의 결합
public class BeforeAdvice {

	// Member에서 수행하는 get()->수행전에 "데이터 출력이 시작됩니다!"

	@Before("PointcutCommon.aPointcut()")
	public void printLog(JoinPoint jp) {
		Object[] args = jp.getArgs();
		String name = jp.getSignature().getName();

		System.out.println(name + " " + args[0] + " 데이터 출력이 시작됩니다!");

	}
}
