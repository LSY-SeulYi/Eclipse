package ex01;
// 정적 이너 클래스의 객체 활용하기 연습
public class TestStsticCalss {

	public static void main(String[] args) {
		// 객체 만들기
		A.C ac = new A.C();
		ac.age = 25;
		ac.name = "김장생";
		ac.dispInfo();
		ac.dispInfo2();
		A.C.dispInfo2();
		System.out.println(A.C.gamun);
		
	}
}
