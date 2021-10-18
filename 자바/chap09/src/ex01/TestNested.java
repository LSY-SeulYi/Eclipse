package ex01;

import static ex01.NestedClass.Any;

public class TestNested {
	
	public static void main(String[] args) {
		NestedClass obj = new NestedClass();
		// 인스턴스 멤버 클래스로 객체를 만들때
		NestedClass.Any any = obj.new Any();
		// 정적 멤버 클랙스로 객체를 만들때
		NestedClass.Some smoe = new NestedClass.Some();		
		
	}

}
