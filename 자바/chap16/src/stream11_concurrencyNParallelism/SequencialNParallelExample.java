package stream11_concurrencyNParallelism;

import java.util.Arrays;
import java.util.List;

public class SequencialNParallelExample {
	// 순차 처리와 병렬 처리의 성능 비교
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		// 워밍업 - 정확한 측정을 위해 워밍업을 실시 (기계적 특성에 의해 먼저 돌아간 작업이 유리할 수 밖에 없어서 워밍업을 실시해 주는게 좋다.)
		testSquential(list);
		testParallel(list);
				
		// 순차 스트림 처리 시간 
		System.out.println("순차처리:"+testSquential(list));
		// 병렬 스트림 처리 시간 
		System.out.println("병렬처리:"+testParallel(list));
	}

	// 요소 처리
	public static void work(int value) {
		try {
			Thread.sleep(100);// 인터발이 짧을 수록 순차의 속도가 빨라진다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 순차 처리
	public static long testSquential(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach(a -> work(a));
		return System.nanoTime() - start;
	}

	// 병렬 처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach(a -> work(a));
		return System.nanoTime() - start;
	}

}
