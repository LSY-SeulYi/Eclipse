package stream07_looping;

import java.util.Arrays;

public class LoopingSample {
	// peek ~ 살짝엿보다.
	public static void main(String[] args) {
		int[] intArr ={1,2,3,4,5,6,7,8,9,10};
//		System.out.println("peek()만 호출한 경우 결과무");
//		Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		
		// peek() 메소드는 중간처리 메소드이므로
		// 반드시 최종처리메소드를 더불어 호출해야한다.
		// (...) => 파이프라인 
		System.out.println("peek()와 최종처리 메소드를 호출한 경우");
		int total = Arrays.stream(intArr).
			filter(a->a%2==0).	// filter => 걸러주는것, true & false가 결과임, 
			peek(n->System.out.println(n)).	// peek 는 힐끗 보는것임 (2,4,6,8,10)
			sum();// 최종처리메소드
		
		System.out.println("짝수합: "+total);
		
		// --------- 
		System.out.println("\n최종처리 메소드로 forEach()를 사용한 예");
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));

	}
}
