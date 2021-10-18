package ex01;

public class NestedNthis {
	int age = 18;
	
	class XX{
		int age = 37;
		void someMethod() {
			System.out.println("Outter age : "+ NestedNthis.this.age);
			System.out.println("Inner age : "+ age);
		}
	}
	public static void main(String[] args) {
		new NestedNthis().new XX().someMethod();
	}

}
