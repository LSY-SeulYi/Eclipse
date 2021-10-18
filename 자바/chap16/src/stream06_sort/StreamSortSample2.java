package stream06_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortSample2 {

	public static void main(String[] args) {
		ArrayList<MyMember> list = new ArrayList<>();
		list.add(new MyMember("hgd", "홍길동", "1234", "동서번쩍"));
		list.add(new MyMember("lsm", "리승만", "1234", "초대대통령"));
		list.add(new MyMember("kk2", "김구", "1234", "임시정부수반역임"));
		list.add(new MyMember("kk", "김구", "1234", "경상도 농사꾼"));

		// // 정렬전 출력
		System.out.println("정렬전:");
		for (MyMember member : list) {
			System.out.println(member);
		}
		// // 정렬후 출력
		Collections.sort(list);
		System.out.println("정렬후:");
		for (MyMember member : list) {
			System.out.println(member);
		}

//		Collections.shuffle(list); => 섞는것
		// 새로운 방식 - Stream을 이용하는 방식 - 주의 parallelStream()을 이용하면 안된다.
		Stream<MyMember> stream = list.stream();
		// ---------------- 오름차순
		// 1방법
		System.out.println("1방법:");
		stream.sorted().forEach(obj -> System.out.println(obj));
		
		System.out.println("원본을 정렬하였는지 확인 :");
		for(MyMember x:list) {
			System.out.println(x);
		}
		
		// 2방법
		stream = list.stream(); // 스트림은 사용하면 모두 소진되고 클로즈된다.
		System.out.println("2방법:");
		stream.sorted(Comparator.naturalOrder()).forEach(	// (Comparator => 추상메소드)
				obj -> System.out.println(obj));
		// 3방법 (2방법을 람다식으로 만든것)
		stream = list.stream();
		System.out.println("3방법:");
		stream.sorted((a, b) -> a.compareTo(b)).forEach(	// a,b => MyMember
				obj -> System.out.println(obj));
		// 4방법
		stream = list.stream();
		System.out.println("4방법:");
		stream.sorted(new MyMember()).forEach(obj -> System.out.println(obj));

		// ---------------- 내림차순
		// 내림 1방법
		stream = list.stream();
		System.out.println("내림1방법:");
		stream.sorted(Comparator.reverseOrder()).forEach(
				obj -> System.out.println(obj));
		// 내림2방법
		stream = list.stream();
		System.out.println("내림2방법:");
		stream.sorted((a, b) -> b.compareTo(a)).forEach(
				obj -> System.out.println(obj));

	}

}
