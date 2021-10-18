package stream12_predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	// (L,R) -> boolean
	// test(a,b)
	public static void main(String[] args) {
		// TODO 두수를 입력받아 앞수가 뒷수보다 큰지 boolean 타입으로 리턴
		BiPredicate<Integer,Integer> bp = (a,b)->a>b;
		System.out.println("10 이 3 보다 큰가?:"+bp.test(10, 3));
	}

}
