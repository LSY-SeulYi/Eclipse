package ex01;
// 정적 멤버 클래스 연습
public class A {
	static class C {
		int age;
		String name;
		static String gamun = "김해김씨";
		
		C() {} // 기본생성자
		void dispInfo() {
			System.out.println(gamun + "나이 : "+ age + ", 이름 : "+ name);
		}
		static void dispInfo2() {
			System.out.println("김해김씨 입니다.");
		}
	}
}
