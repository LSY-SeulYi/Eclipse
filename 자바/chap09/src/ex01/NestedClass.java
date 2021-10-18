package ex01;

public class NestedClass {
	public static Any Any;
	String somesome = "안녕하세요.";
	static class Some{}
	class Any{}	// static 안붙으면 인스턴스 멤버 클래스
	void someMethod() {
		// 로컬 클래스는 메소드 내에서만 사용이 가능.
		class Foo {
			Foo() {}
			int a;
			void methodX() {}
		}
		Foo foo = new Foo();
		foo.a = 99;
		foo.methodX();
	}
	
	
	public static void main(String[] args) {
		Some some = new Some();
		NestedClass obj = new NestedClass();
		Any any = obj.new Any();	// 인스턴스 멤버 클래스의 객체 만드는 법
		
	}

}
