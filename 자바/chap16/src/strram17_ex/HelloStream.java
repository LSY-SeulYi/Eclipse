package strram17_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class HelloStream {

	public static void main(String[] args) {
		
		// 게터로 할경우
	List<String> data = Arrays.asList("김치국","윤시내","박찬국","육종원");
	// 자바 1.5이전
	Iterator<String> iterator = data.iterator();
	while(iterator.hasNext()) {
		String name = iterator.next();
		System.out.println(name);
	}
	// 자바 1.8 향상된 for문
	for(String x:data) {
		System.out.println(x);
	}
	// 전통적 for문
	for(int i=0;i<data.size(); i++) {
		System.out.println(data.get(i));
	}
	// 자바 1.8 스트림에 향상된 람다 대체 활용
	data.stream().forEach(System.out::println);
	// 자바 1.5 스트림 활용
	List<String> list = Arrays.asList("홍길동","신용권","강자바","스트림");
	Stream<String> stream = list.stream();
	// 자바 1.8 스트림 활용
	stream.forEach(name -> System.out.println(name));
	data.stream().forEach(x -> System.out.println(x));
	
	// 세터로 할 경우 (전통적 for문 사용할 수 없음)
	Set<Integer> set = new HashSet<>();
	set.add(56);set.add(69);set.add(71);set.add(88);set.add(91);set.add(74);
	// 자바 1.5이전
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		// 자바 1.8 향상된 for문
		for(int x:set) {
			System.out.println(x);
		}
		// 자바 1.8 스트림 활용
		set.stream().forEach(num -> System.out.println(num));
		// 자바 1.8 스트림에 향상된 람다 대체 활용
		set.stream().forEach(System.out::println);
	}
}
