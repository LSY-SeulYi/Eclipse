package com.vision.chapter03;

public class BitReverseEx {

	public static void main(String[] args) {
		// TODO 비트 반전 연산
		int v1 = 10;
		int v2 = ~10;
		System.out.println(v1);		// 10
		System.out.println(v2);		// -11
		// 비트 반전 연산 시 음수로 바꾸고 싶으면 +1을 해줘야 함 (1의보수)
		int v3 = ~10+1;
		System.out.println(v3);		// -10
		// 2진수의 값 알아내는 방법 (랩클래스)
		// Integer ~ int 타입의 Wrapper Class
		System.out.println(Integer.toBinaryString(v1));		// 10 => 1010
		System.out.println(Integer.toBinaryString(v2));		// -11 => 11111111111111111111111111110101
		System.out.println(Integer.toBinaryString(v3));		// -10 => 11111111111111111111111111110110
// --------------------------------------------------------------------------------------------------------------------------
		int v4 = -10;
		int v5 = ~-10;
		int v6 = ~-10+1;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
	}

}
