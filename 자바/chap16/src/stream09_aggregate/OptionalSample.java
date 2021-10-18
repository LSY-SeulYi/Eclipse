package stream09_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

// OptionalXXX 클래스는 집계값을 저장하고, 집계값이 존재치 않을 경우
// 디폴트 값을 설정할 수 있으며, 집계 값을 처리하는 Consumer도 등록할 수 있다.
public class OptionalSample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();// 데이타가 없다.
//		list.add(1234);

		double avg = 7.7;

		// OptionalXXX 이용방식1
//		OptionalDouble option1 = list.stream().mapToInt(Integer::intValue)
//				.average();
		OptionalDouble option1 = list.stream().mapToInt(e->e.intValue())
				.average();	// 인트값의 인티저 값을 스트림 값으로 해서 평균 값으로 변환
		if (option1.isPresent()) {
			System.out.println("방법1: " + option1.getAsDouble());
		} else {
			System.out.println("방법1: " + "0.0");
		}

		// 방식2
		double avg1 = list.stream().mapToInt(Integer::intValue).average()
				.orElse(0.0);
		System.out.println("방법2: " + avg1);

		// 방식3 - 결과가 있어야 출력됨
		list.stream().mapToInt(Integer::intValue).average()
				.ifPresent(a -> System.out.println("방법3: " + a));
		
		// 전통적 예외처리 방식
		// 아래 소스는 예외를 발생시킨다.
		try {
			avg = list.stream().mapToInt(Integer::intValue).average()
					.getAsDouble();
		} catch (NoSuchElementException e) {
		} finally {
			System.out.println("전통방법: " + avg);
		}
	}

}
