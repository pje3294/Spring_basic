package com.park.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	
	//★ Client에서 수행하는 get()->수행전에 "데이터 출력이 시작됩니다!"
	
	@Pointcut("execution(* model..*Impl.get*(..))")
	public void aPointcut() {}
		// 모든메서드()->수행시간을 화면(console)에 출력해주세요!~~
	@Pointcut("execution(* model..*Impl.*(..))")
	public void bPointcut() {}
	
	
}	
