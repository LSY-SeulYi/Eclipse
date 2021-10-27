package com.vision.aop_ex2;

import org.aspectj.lang.ProceedingJoinPoint;

// 대리인
public class LogAop2 {

	public Object dispDoubleLine(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~ 구구단 시작 ~~~~~~~~~~~~~~~~~~~~~");
		try {
			Object obj = joinpoint.proceed();
			return obj;			
		}
		finally {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~ 구구단 종료 ~~~~~~~~~~~~~~~~~~~~~");			
		}
	}
}
