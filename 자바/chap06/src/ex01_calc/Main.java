package ex01_calc;

public class Main {

	public static void main(String[] args) {
		// person 객체와 calc 객체를 만들어 사용
		Person someone = new Person();	// 객체 만들기
		someone.setName("홍길동");
		someone.setAge(25);
		someone.calculate(34, 768);

	}
}
