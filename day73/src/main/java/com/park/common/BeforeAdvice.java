package com.park.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect // ����ó���� ��� == ����Ʈ��+�����̽��� ����
public class BeforeAdvice {

	// Member���� �����ϴ� get()->�������� "������ ����� ���۵˴ϴ�!"

	@Before("PointcutCommon.aPointcut()")
	public void printLog(JoinPoint jp) {
		Object[] args = jp.getArgs();
		String name = jp.getSignature().getName();

		System.out.println(name + " " + args[0] + " ������ ����� ���۵˴ϴ�!");

	}
}
