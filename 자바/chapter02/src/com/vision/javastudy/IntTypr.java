package com.vision.javastudy;

public class IntTypr {
	
	public static void main(String[] args) {
		int pay = 7_500_000;		// 숫자에서 ,콤마 대용으로 _언더바 사용
		long total = 127_556_777L;		// 숫자에서 ,콤마 대용으로 _언더바 사용
		
		// int hab = pay + total;		// 큰타입이 long이라서 long으로 바꿔줘야함.
		long hab = pay + total;
		System.out.println("hab : "+ hab);
		
		System.out.println(1.3 + 2.78);
		System.out.println(3.4 + 78);
		System.out.println(1.3 + 2.78);
		byte a = 10;
		byte b = 30;
		byte c = 30+40;
		System.out.println(a + b);
		System.out.println(c);
		
		// 어려운 문제----------------------------------------------------------------------------
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double res = apple - (pieceUnit * number);
				System.out.println(res);		// 컴퓨터는 2진 연산을 해서 오차 발생함.
		// 0.3으로 딱 떨어지게 하고 싶으면.
		int orange = 1;
		int totalPieceUnit = orange *10;
		int num = 7;
		int temp = totalPieceUnit - num;
		double result = temp/10.0;
				System.out.println(result);		// 0.3으로 딱 떨어짐.
		// ----------------------------------------------------------------------------------------
		// System.out.println(5/0);		// divide by 0 에러
		System.out.println(5/0.0);		// Infinity 값이 나옴()
		
	}

}
