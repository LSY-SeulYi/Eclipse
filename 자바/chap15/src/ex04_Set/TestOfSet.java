package ex04_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// 중복되지 않은(집합), 순서없는 자료
public class TestOfSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(123);set.add(456);set.add(789);set.add(10123);
		set.add(123);
		System.out.println(set.size());
		
		// Lotto
		Set<Integer>lotto = new TreeSet<>();	// HashSet과 결과 차이를 알것임
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(Arrays.toString(lotto.toArray()));
		// 향상된 for문으로 출력
		for(int x:lotto) {
			System.out.print(x+"\t");
		}
		System.out.println();
		
		// Iterator활용
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		System.out.println();
	}
}
