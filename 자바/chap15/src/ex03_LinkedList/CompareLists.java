package ex03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList와 ArrayList의 연산속도 비교
public class CompareLists {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long start = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0, i+"");
		}
		System.out.println("ArrayList에서 걸린 시간 : "+ (System.nanoTime()-start));
		
		start = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,i+"");
		}
		System.out.println("LinkedList에서 걸린 시간 : "+ (System.nanoTime()-start));
	}
}
