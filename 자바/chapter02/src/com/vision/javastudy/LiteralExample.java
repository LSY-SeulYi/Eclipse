package com.vision.javastudy;

public class LiteralExample {

	public static void main(String[] args) {
		// TODO 리터럴 연습
		int var1 = 10;	// 10진수 (데시멀)
		System.out.println(var1);
		int var2 = 010;		// 0붙이면 8진수 (옥터)
		System.out.println(var2);
		int var3 = 0x10;	// x붙이면 16진수 (헥사)
		System.out.println(var3);
		char charVar = 'A';	// 영어문자
		char hangul = '가';	// 한글문자
		System.out.println(charVar);
		System.out.println(hangul);
		String str = "나를 사랑한 스파이 007";	// 문자열
		long var4 = -200;	// 음수
		System.out.println(str);
		System.out.println(var4);
		int var5 = 0b0110;	// 2진수 리터럴
		System.out.println(var5);
		float var6 = 3.14f;	// float 타입은 f라는 접미사를 붙여야함.
		double var7 = 3.141592;
		System.out.println(var6);
		System.out.println(var7);
		long var8 = 1000L;		// L리터럴이 없으면 int type 임.
		System.out.println(var8);
		// byte, short 타입은 잘 사용하지 않음 ==> 자칫하면 오버플로우 발생함.
		// 특수문자 '\b'=백스페이스, '\t'=한탭, '\n'=한줄넘김, '\f', '\r'=한페이지넘기기, '\"', '\'' (특수문자는 char타입으로 넣을수 있음. 문자열 중간에도 넣을수 있음)
		// 엔터키를 특수문자로 넣으려면 '\n','\r' 두가지가 합쳐져야 함.
	}

}
