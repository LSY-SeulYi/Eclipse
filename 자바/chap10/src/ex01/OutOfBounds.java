package ex01;

public class OutOfBounds {

	public static void main(String[] args) {
		
//		String[] names = new String[5];
//		names[0] = "강나라";
//		names[3] = "빛나리";
//		names[5] = "유난희";
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at ex01.OutOfBounds.main(OutOfBounds.java:10)
//		배열 범위가 0~4까지만 가능한데 5를 입력해서 에러남.
		String[] names = new String[5];
		names[0] = "강나라";
		names[3] = "빛나리";
		names[4] = "유난희";
		
	}
}
