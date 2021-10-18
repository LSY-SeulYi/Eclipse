package com.vision.javastudy;

public class CheckValue {

	public static void main(String[] args) {
		int i = 128;
		// Byte.MIN_VALUE = 바이트 클래스가 가지고 있는 민밸류 상수
		// Byte 클래스는 byte타입의 기능들을 모아놓은 클래스 ==> 레퍼클래스
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입 범위를 벗어났습니다.");
		}else {
			byte bvar = (byte)i;
			System.out.println(bvar);
		}
		// 롱타입의 민밸류와 맥스밸류 알아보기
		System.out.println("long 타입의 최대값 : " + Long.MAX_VALUE);
		System.out.println("long 타입의 최소값 : " + Long.MIN_VALUE);
		
	}

}
