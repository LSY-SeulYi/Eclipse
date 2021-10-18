package com.vision.javastudy;

public class VariableExample {
	// 멤버 필드
	int a ;
	int b ;
	String c="Hello";
	
	// 멤버 메소드
	// 메인 메소드 - 자바 실행시 자동으로 호출되어 실행되는 영역 (실행 클래스에만 꼭 있어야 함.)
	// 실행 클래스에만 존재하는 메소드(자바 실행 시 첫 진입머리)
	// static 들어간 태그는 위에 딱 한번만 들어가면 됨. (메인메소드 앞에)
	public static void main(String[] args) {
		// TODO 변수를 선언하고 초기값 할당, 간단한 연산 작업 해보기
		int value = 10;
		int result = value + 10;
		String c="Hello";
		int rev = value + result + 55;
		System.out.println(result);
		System.out.println(c);
		System.out.println(rev);
	}

}
