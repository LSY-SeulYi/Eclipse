package ex06_초기화블럭;

import java.sql.Date;

// 초기화 블럭 연습
public class InitTest {
	
	static Date today;
	String company;
	static {	// 정적 초기화 블럭은 객체 생성과 관계없이 정적 필드의 값을 초기화 할 때에 사용
		today = new Date(System.currentTimeMillis());
	}
		public InitTest() {	// InitTest => 생성 메소드
		System.out.println("오늘은 "+today+"입니다.");
		System.out.println("InitTest 클래스를 이용해 주셔서 감사합니다.");
	}
		public static void main(String[] args) {
			System.out.println(InitTest.today);
			new InitTest();	// InitTest 객체 생성
			InitTest test = new InitTest();
			test.company = "samsung";
		}
		// static이 붙은 메소드나 static이 안붙은 메소드는 객체를 만들어 접근할 수 있다.
		// static 메소드내에서 외부의 필드(변수)나 메소드는 정적이라야 한다.
		// 그러나 인스턴스 변수나 인스턴스 메소드는 객체를 만들어 접근 가능하다.
}
