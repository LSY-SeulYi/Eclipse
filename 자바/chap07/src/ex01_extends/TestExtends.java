package ex01_extends;
// 상속 연습
public class TestExtends {	// 클래스 안에 클래스를 만들면 이너클래스라고 함. (중첩클래스)

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.method1();
		b.method2();
		c.method3();
		System.out.println(b.field1);
		System.out.println(b.field2);
		System.out.println(c.field1);
		System.out.println(c.field3);
	}
}

class A {	// public은 한번만 붙일수 있음.
	int field1 = 100;
	void method1() {
		System.out.println("method1을 호출했습니다.");
	}
}
class B extends A{
	int field2 = 200;
	void method2() {
		System.out.println("method2를 호출했습니다.");
	}
}
class C extends A{
	int field3 = 300;
	void method3() {
		System.out.println("method3을 호출했습니다.");
	}
}

// 확장기능 한쓰면 이런식으로 코딩
class BB {
	int field1 = 100;
	void method1() {
		System.out.println("method1을 호출했습니다.");
	}
	int field2 = 200;
	void method2() {
		System.out.println("method2를 호출했습니다.");
	}
}