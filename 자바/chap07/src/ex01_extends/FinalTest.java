package ex01_extends;
// final 정리
public class FinalTest {
	// final 키워드의 용도
	//	1. 필드 앞에 붙이면 초기에 준 값을 변경시킬 수 없다.
	//	2. 메소드 앞에 붙이면 이 메소드는 자손이 오버라이딩 할 수 없다.
	//	3, 클래스 앞에 붙이면 이 클래스는 상속 받을 수 없다.
	
	public static void main(String[] args) {
		
	}
}
final class FClass {}
class SomeClass {}
class Parents {
	public final void xxx() {
		System.out.println("xxxx");
	}
}
class Child extends Parents {
//	@Override
//	public void xxx(){}
}