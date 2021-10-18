package sec02;

import java.util.Scanner;

public class SwichEx {
	
	public static void main(String[] args) {
		// TODO 스위치문연습 => 스위치 값에 따라 분기할 문제가 존재할때 사용
		// 스위치로 사용가능한 타입 => 정수, 문자열
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 직급 (부장,과장,대리,주임,평사원) :");
		String 직급 = scan.nextLine();
		int pay = 2_000_000;
		switch(직급) {
		case "부장":
			pay = 7_000_000;
			break;
		case "과장":
			pay = 5_000_000;
			break;
		case "대리":
			pay = 3_000_000;
			break;
		case "주임":
			pay = 2_500_000;
			break;
		case "평사원":
			pay = 2_000_000;
			break;
		default:
			pay = 1_000_000;
		}
		System.out.println("당신의 월급은 "+pay+ "입니다.");
	}

}
