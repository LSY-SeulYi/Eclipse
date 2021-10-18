package com.vision.chapter03;

public class IncreaseOPEx {

	public static void main(String[] args) {
		// TODO 증감 연산
		int x = 10;
		int y = 10;

		System.out.println("-----------------------------------------");
		System.out.println(++x + y--);		// 21
		System.out.println(y);		// 9
		System.out.println(++x + y-- + y);		// 29

	}

}
