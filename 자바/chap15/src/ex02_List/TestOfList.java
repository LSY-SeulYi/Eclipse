package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// List형 자료는 순서가 있고, 중복을 허용하는 자료구조체이다.
public class TestOfList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();	// 폴리모피즘 방식(polyMorpism) => 상위의 클래스로 하위의 객체를 만든다.
		ArrayList<String> list1 = new ArrayList<>();	// <> => 다이아몬드 연산자
		
		// 객체 추가 방식 3가지 타입
		list.add("홍길동");list.add("강감찬");list.add("정약용");list.add("윤시내");	// 오버로딩
		list.add(1,"유관순");	// 지정한 위치에 저장 (오버로딩)
		System.out.println(list);
		list.set(4, "윤가네");	// 지정한 위치 값 수정
		System.out.println(list);
		for(String x:list) {
			System.out.print(x+ "\t");
		}
		// 객체를 검색하는 방법
		boolean res = list.contains("정약용");
		System.out.println((res)?"다산":"소산");
		System.out.println("자료가 비어있는가? "+list.isEmpty());
		System.out.println("총 자료의 개수는? "+list.size());
		// 객체 삭제
		System.out.println("삭제된 자료는? "+list.remove(4));
		System.out.println("정약용이 삭제되었는가? "+list.remove("정약용"));
		System.out.println(list);
		System.out.println("총 자료의 개수는? "+list.size());
		list.clear();// 값 전체 삭제
		System.out.println("총 자료의 개수는? "+list.size());
		
		// 리스트에 여러 항목을 편리하게 동시에 넣는 법
		List<String> list2 = Arrays.asList("홍길동","지국총","정철","윤선도");
		List<Integer> list3 =  Arrays.asList(56,78,90,88,77);
		System.out.println(list2);
		System.out.println(list3);
		
	}

}
