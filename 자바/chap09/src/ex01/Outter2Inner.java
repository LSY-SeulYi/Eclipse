package ex01;
// 바깥클래스의 변수값을 안쪽(Inner,중첩)클래스로 값을 전달
public class Outter2Inner {
	// 바깥 영역
	int age = 25;
	String name = "김수로";
	static String gamun = "김해김씨";

	// 안쪽 영역
	class Inner {
		int age = 18;
		String name = "순이";
		void someMetod() {
			System.out.println(Outter2Inner.this.age);
			System.out.println(Outter2Inner.this.name);
			System.out.println(this.age);
			System.out.println(this.name);
			System.out.println(gamun);
		}
	}
	
	static class Inner2 {
		int age = 50;
		String name = "복례";
		void someMetod() {
			System.out.println(age);
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// new Inner().someMetod(); => 이렇게 쓰고 싶으면 Inner 클래스 앞에 static 붙여주면 됨
		new Outter2Inner().new Inner().someMetod();
		System.out.println();
		Outter2Inner.Inner2 x = new Outter2Inner.Inner2();
		x.someMetod();
		System.out.println();

		
	}
	public static char[] name() {
		// TODO Auto-generated method stub
		return null;
	}
	public static char[] age() {
		// TODO Auto-generated method stub
		return null;
	}
}
