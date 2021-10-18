package stream09_aggregate;

import java.util.Arrays;

public class AggregateSample {
	// Aggregate ~ sum(), count(), average(), max(), min()
	public static void main(String[] args) {
		// 카운트
		long cnt = Arrays.stream(new int[]{1,2,3,4,5})
				.filter(n->n%2==1)// 홀수만
				.count();// 카운트
		System.out.println("홀수의 갯수: "+cnt);
		
		// 집계
		long sum = Arrays.stream(new int[]{1,2,3,4,5})
				.filter(n->n%2==1)// 홀수만
				.sum();// 합계
		System.out.println("홀수만 합계: "+sum);
		
		// 평균 
		double avg = Arrays.stream(new int[]{1,2,3,4,5})
				.filter(n->n%2==1)// 홀수만
				.average().getAsDouble();// 평균
		System.out.println("홀수만 평균: "+avg);
		
		// 최대치 
		int max  = Arrays.stream(new int[]{1,2,3,4,5})
				.max().getAsInt();
		System.out.println("최대값: "+max);
		// 최소치
		int min  = Arrays.stream(new int[]{1,2,3,4,5})
				.min().getAsInt();
		System.out.println("최소값: "+min);
		// 최초값 찾기 
		int first  = Arrays.stream(new int[]{1,2,3,4,5}).filter(n->n%4==0)
				.findFirst().getAsInt();
		System.out.println("최초의 4의 배수: "+first);
		
		
		
	}

}
