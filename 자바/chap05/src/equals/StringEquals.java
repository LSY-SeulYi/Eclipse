package equals;

public class StringEquals {
	// 스트링 비교시 유의할 사항
	public static void main(String[] args) {
		// String 객체는 참조타입
		// 동일한 힙영역에 생성
		String name1 = "이슬이";
		String name2 = "이슬이";
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		// 다른 힙영역에 새성
		String name3 = new String("이슬이");
		String name4 = new String("이슬이");
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
	}

}
