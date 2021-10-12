package com.park.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	
	//�� Client���� �����ϴ� get()->�������� "������ ����� ���۵˴ϴ�!"
	
	@Pointcut("execution(* model..*Impl.get*(..))")
	public void aPointcut() {}
		// ���޼���()->����ð��� ȭ��(console)�� ������ּ���!~~
	@Pointcut("execution(* model..*Impl.*(..))")
	public void bPointcut() {}
	
	
}	
