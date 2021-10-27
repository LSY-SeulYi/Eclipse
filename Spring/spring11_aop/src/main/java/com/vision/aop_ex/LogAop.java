package com.vision.aop_ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{ // exception은 코딩상에서 에러만 그렇게 부름. Throwable은 exception의 상위 개념
		// Advice (프록시 만들때는 무조건 ProceedingJoinPoint 메소드를 넣어줘야 함)
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + "작업이 시작되었습니다.");
		long st = System.currentTimeMillis();
		try {
			Object obj = joinpoint.proceed(); // 주된 (핵심) 기능 실행
			return obj;
		}
		finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr+"작업이 종료되었습니다.");
			System.out.println("경과 시간 : "+ (et-st));
		}
	}
}
