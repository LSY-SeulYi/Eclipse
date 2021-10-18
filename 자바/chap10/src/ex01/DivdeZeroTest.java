package ex01;

public class DivdeZeroTest {
	public static void main(String[] args) {
		
		new DivdeZeroTest().test1();
		new DivdeZeroTest().test2();
		new DivdeZeroTest().test3();
		new DivdeZeroTest().test4();
	}

	private void test1() {
		try { 
			int a = 50/0;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("수고~~");
	}
	private void test2() {
			
		}
	private void test3() {
		
	}
	private void test4() {
		
	}
}
