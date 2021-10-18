package stream11_concurrencyNParallelism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// ArrayList 와 LinkedList의 병렬처리 속도 비교 
public class ArrayListNLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		for(int i=0;i<=1_000_000;i++){
			arrayList.add(i);
			linkedList.add(i);
		}
		
		// 워밍업 - 정확한 측정을 위해 워밍업을 실시 (기계적 특성에 의해 먼저 돌아간 작업이 유리할 수 밖에 없어서 워밍업을 실시해 주는게 좋다.)
		
		parallelTest(arrayList);
		parallelTest(linkedList);
		
		// 본 측정 
		System.out.println("ArrayList:"+parallelTest(arrayList));
		System.out.println("LinkedList:"+parallelTest(linkedList));
	}
	public static void work(int value){}
	
	public static long parallelTest(List<Integer> list){	// 폴리모피즘
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		return System.nanoTime()-start;
	}
	public static long parallelTest(LinkedList<Integer> list){	// 폴리모피즘
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		return System.nanoTime()-start;
	}
	public static long parallelTest(Vector<Integer> list){	// 폴리모피즘
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		return System.nanoTime()-start;
	}

}
