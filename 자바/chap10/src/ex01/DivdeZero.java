package ex01;
// 예외처리 연습
public class DivdeZero {

	public static void main(String[] args) {
		new DivdeZero().test();
		new DivdeZero().test2();

	}

	private void test() {
//		int aa = 10/0;
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at ex01.DivdeZero.test(DivdeZero.java:10)
//		at ex01.DivdeZero.main(DivdeZero.java:6)
//		0으로 나눌수 없기 때문에 10번째 줄 수정 필요, 6번째 줄 실행 못함.

		int a = 10/2;
		System.out.println(a);
		
	}
	private void test2() {
		try {
			int aaa= 10/0;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("수고하셨습니다.");
	}
	private void test3() throws Exception{
		int aa = 10/0;
		System.out.println(aa);
		
	}
}
