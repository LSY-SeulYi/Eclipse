package ex05;

import java.util.Objects;

public class ObjectsRequireNonNullTest {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = null; // 객체를 할당하지 않았음을 의미.
		String name = null;
		
		try {
			name = Objects.requireNonNull(name2);	// 예외 발생
		} catch (Exception e) {
			System.err.println(e.getMessage()+"이 발생했습니다.");
		}
		
	//---------------------------------------------------------------------------------------
		try {
			name = Objects.requireNonNull(name2,"이름 지정이 안되었음!");	// 예외 발생
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	//------------------------------------------------------------------------------------------
		System.out.println(Objects.toString(name1));
		System.out.println(Objects.toString(name2));
		System.out.println(Objects.toString(name2,"이름이 지정되지 않았습니다!"));
	}
}
