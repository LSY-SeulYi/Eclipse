package ex01_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestOfCollection {

	public static void main(String[] args) {
		Collection collection = new ArrayList();	// LickedList, Vector 상관없음
		collection.add("홍길동");
		collection.add(97);	// 자동포장기능 (Autoboxing)
		collection.add(new Foo());
		System.out.println(collection);
		
		// Generics Type의 활용
		Collection<String> col1 = new ArrayList<>();	// <> 다이아몬드 연산자 => 분리수거통 만들기(String만 들어가게 함)
		Collection<Integer> col2 = new ArrayList<>();
		Collection<Foo> col3 = new ArrayList<>();
		
		// Generics Type에 add하는 요소가 일치되어야 함
		col2.add(145);
		col1.add("유관순");
		
		Collection<String> strCol = new ArrayList<>();
		strCol.add("소정방");
		strCol.add("소배압");
		strCol.add("소지섭");
		col1.addAll(strCol);
		col1.add("홍길동");
		System.out.println(col1);
		// 자료 확인
		for(String x:col1) {
			System.out.println(x);
		}
		// 자료 제거
		col1.clear();
		for(String x:col1) {
			System.out.println(x);
		}
		// 자료검색시 사용 (contains)
		boolean res = col1.contains("소배압");
		if(true) {
			System.out.println("소배압이 출석했습니다~!");
		}else {
			System.out.println("소배압이 결석하였습니다~!");
		}
			System.out.println("정방,배압,지섭 모두 있는지? : "+col1.containsAll(strCol));
	}
	static class Foo{}

}
