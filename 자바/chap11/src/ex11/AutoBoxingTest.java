package ex11;
// AutoBoxing  / AutoUnBoxing
public class AutoBoxingTest {
	public static void main(String[] args) {
		
		// 전통적인 객체 생성 방법
		Integer obj = new Integer(365);
		//
		Integer obj2 = 365; // int 정수가 자동으로 포장되어 Integer객체가 되도록 문법을 확장
		
		System.out.println(obj + obj2); // Integer 객체가 자동으로 풀려 int 연산을 함.
		
		Boolean res = new Boolean(true);
		Boolean res2 = true;
		boolean someRes = !res2;
		
		
	}

}
