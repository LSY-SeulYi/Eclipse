package sec02;

import java.util.Scanner;

public class IfExampe {

	public static void main(String[] args) {
		// TODO if문
		Scanner scan = new Scanner(System.in);
		System.out.print("암호는?");
		String 암호 = scan.nextLine();		// nextLine 문자열 불러오는 메소드
		
		if(암호.equals("도깨비")) {
			System.out.println("들어와도 좋습니다.");
		}else {
			System.out.println("출입거부!");
		}
		System.out.println("종료");

	}

}
