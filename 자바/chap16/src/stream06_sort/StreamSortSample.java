package stream06_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortSample {

	public static void main(String[] args) {
		// MyScore의  total 값으로 내림차순 정렬
		MyScore[] array = {
				new MyScore("홍길동",89,90,45),
				new MyScore("정길동",19,10,15),
				new MyScore("류관순",99,99,100)
		};
		Stream<MyScore>  stream = Arrays.stream(array);
		
		//---------------- 오름차순 
		// 1방법 - MyScore가 Comparable을 구현했다(총점 오름차순으로)
		//stream.sorted().forEach(obj->System.out.println(obj));
		// 2방법
		//stream.sorted(Comparator.naturalOrder()).forEach(obj->System.out.println(obj));
		// 3방법
		//stream.sorted((a,b)->a.compareTo(b)).forEach(obj->System.out.println(obj));
		// 4방법
		//stream.sorted(new ScoreComparator()).forEach(obj->System.out.println(obj));
		// 5방법
		//stream.sorted(new ScoreComparator()::compare).forEach(obj->System.out.println(obj));
		
		
		//---------------- 내림차순
		// 1방법
		//stream.sorted(Comparator.reverseOrder()).forEach(obj->System.out.println(obj));
		// 2방법
		//stream.sorted((a,b)->b.compareTo(a)).forEach(obj->System.out.println(obj));
		// 3방법
		stream.sorted((a,b)->-( a.compareTo(b)) ).forEach(obj->System.out.println(obj));
	
		
	}

}
