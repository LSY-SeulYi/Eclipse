package stream06_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleSort {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 7, 4, 3, 2, 9, 1 });
		// 오름차순
		// IntStream,DoubleStream, LongStream 은
		// 내림차순은 없다.
		intStream.sorted().forEach(n -> System.out.print(n + ","));
		// --------------------------------------
		System.out.println();

		// 문자열의 정렬
		// --------------------------------------
		System.out.println("\n기본정렬-오름차순 ");
		// --------------------------------------
		Stream<String> stream = Arrays.stream(new String[] { "홍경래", "박찬호",
				"김홍주", "하위지", "유응부" });
		stream.sorted().forEach(n -> System.out.print(n + ","));

		// --------------------------------------
		System.out.println("\n내림차순으로 ");
		// --------------------------------------
		// 스트림은 재활용되지 않으므로 다시 생성
		stream = Arrays
				.stream(new String[] { "홍경래", "박찬호", "김홍주", "하위지", "유응부" });
		stream.sorted(new MyComparator(Sort.DESC)).forEach(
				n -> System.out.print(n + ","));	// iterator와 유사함
		// --------------------------------------
		System.out.println("\n오름차순으로 ");
		// --------------------------------------
		// 스트림은 재활용되지 않으므로 다시 생성
		stream = Arrays
				.stream(new String[] { "홍경래", "박찬호", "김홍주", "하위지", "유응부" });
		stream.sorted(new MyComparator(Sort.ASC)).forEach(
				n -> System.out.print(n + ","));
	}
	
	enum Sort{
		ASC,DESC
	}

	static class MyComparator<String> implements Comparator<String> {
		Sort howSort;
		public MyComparator(Sort howSort) {
			this.howSort = howSort;
		}

		// 내림차순용/오름차순겸용
		@Override
		public int compare(String o1, String o2) {
			if (howSort == Sort.ASC)
				return o1.toString().compareTo(o2.toString());
			else if (howSort == Sort.DESC)
				return -o1.toString().compareTo(o2.toString());
			else
				return 0;
		}

	}

}
