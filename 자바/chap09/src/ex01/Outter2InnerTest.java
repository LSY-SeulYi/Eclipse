package ex01;

public class Outter2InnerTest {
	// 바깥클래스의 변수 값을 안쪽(Inner,중첩)클래스로 값을 전달 

	int age=18;
	String name="김수로";
	static String gamun="김해김씨";

	class Inner{
	void someMethod() {
	System.out.println(age);
	System.out.println(name);
	System.out.println(gamun);
	}
	}

	static class Inner2{
	void someMethod() {
	//System.out.println(age);
	//System.out.println(name);
	System.out.println(gamun);
	}
	}

	public static void main(String[] args) {
	new Outter2InnerTest().new Inner().someMethod();
	System.out.println();
	new Outter2InnerTest.Inner2().someMethod();

	}

	}
