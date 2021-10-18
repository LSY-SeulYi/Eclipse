package stream09_aggregate;

import java.util.Arrays;
import java.util.List;
// reduce => 약식으로 줄여서 사용할수 있게 해줌
public class ReduceSample {

	public static void main(String[] args) {
		List<MyScore> scoreList = Arrays.asList(
				new MyScore("홍길동", 34, 45, 45),
				new MyScore("박찬호", 56, 67, 54), 
				new MyScore("곽재우", 67, 78, 89));
		
		// 총점얻기 
		
		
		// sum() 의 이용
		int total1 = scoreList.stream()
				.mapToInt(MyScore::getTotal)
				.sum();
		
		// reduce(IntBinary Operator op) 이용
		int total2 = scoreList.stream()
				.map(MyScore::getTotal)
				.reduce((a,b)->a+b)
				.get();
		
		// reduce(int identity,IntBinaryOperator op)이용 
		int total3 = scoreList.stream()
				.map(MyScore::getTotal)
				.reduce(0,(a,b)->a+b);
		
		System.out.println("1. "+total1+"\n2. "+total2+"\n3. "+total3);
		
		List<Long> factorial = Arrays.asList(1L,2L,3L,4L,5L);
//		long factValue = factorial.stream().mapToLong(e->e.longValue())
//				.reduce((a,b)->a*b).getAsLong();
		long factValue = factorial.stream().mapToLong(Long::longValue)
				.reduce((a,b)->a*b).getAsLong();
		System.out.println(factValue);

	}

}
