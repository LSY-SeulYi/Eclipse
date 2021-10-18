package sec02;

import java.util.Scanner;

public class IfElaseIfExample {
	
	public static void main(String[] args) {
		// TODO 
		Scanner scan = new Scanner(System.in);
		System.out.println("참외의 무게를 입력하세요.");
		int weight = scan.nextInt();
		String 등급 ="";
		if(weight>=300) {
			등급 = "상품";
		}else if(weight>=200) {
			등급 = "최상품";
		}else {
			등급 = "하품";
		}
		System.out.println("당신의 참외의 등급은 "+등급+" 입니다.");
	}

}
