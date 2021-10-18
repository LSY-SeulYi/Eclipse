package chap04;

import javax.swing.JOptionPane;

public class LogicalOpEx {

	public static void main(String[] args) {
		// TODO 논리 연산
		String name = "순이";
		int age = 18;
		if(name.equals("순이") && age==18) {		// &&가 논리연산
			System.out.println("김국환이 찾는 여자입니다.");
		}else {
			System.out.println("김국환이 찾는 여자가 아닙니다.");
		}
		
		// 주어진 문자가 대문자인지 소문자인지 구분하는 로직
		char a = 'A';
		if(a>=65 && a<=90) {		// 65 <= a <= 90
			System.out.println("대문자입니다.");
		}else if(a>=97 && a<=122) {
			System.out.println("소문자입니다.");
		}else {
			System.out.println("특수 문자입니다.");
		}
		// 논리 연산자 종류 ~ 논리합(or) = ||(|), 논리곱(and) = &&(&), 논리부정(not) = !, 익스크루시브or = ^
		// 주어진 숫자가 2와 3의 공배수 인지를 알아보는 로직
		// 문자열 리터럴Integer을 숫자parseInt로 바꿔주는 메소드에서 JOptionPane.showInputDialog의 박스생성
		int someNum = Integer.parseInt(JOptionPane.showInputDialog("숫자입력:"));
		if(someNum%2==0 && someNum%3==0) {
			System.out.println("숫자 "+someNum+ "은 2와 3의 공배수입니다.");
		}else if(someNum%2==0 || someNum%3==0) {
			System.out.println("숫자 "+someNum+ "은 2나 3의 배수입니다.");
		}else {
			System.out.println("2나 3과의 배수 관계에 있지 않습니다.");
		}
	}

}
