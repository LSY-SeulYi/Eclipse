package stream14_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
	// Function 인터페이스 원형
	/*
	 * @FunctionalInterface  => 간단한 형변환으로 리턴시켜주는것
	 * public interface Function<T,R>{ 
	 * 		R apply(T t);// T를 받아 R을 리턴 시켜준다. }
	 */

	// 배열과 람다시그너쳐(함수형 디스크립터)를
	// 받아 리스트에 담아 리턴 시켜주는 메소드
	public static <T, R> List<R> map(T[] t, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T x : t) {
			result.add(f.apply(x));
		}
		return result;
	}

	public static void main(String[] args) {

		// MyMember 배열을 받아 Integer List를 리턴
		// Adapter 패턴에 적용할 수 있다.

		MyMember[] t = new MyMember[] { 
				new MyMember("강감찬", 48),
				new MyMember("김유신", 35),
				new MyMember("혁거세", 27),
				new MyMember("유관순", 18) };
		
		// 평균연령 내기 위한 작업 -----------------------------------------
		List<MyMember> temp  = Arrays.asList(t);
		double ageAvg = temp.stream()
				.mapToInt(x->x.getAge()).average().getAsDouble();
		//-------------------------------------------------------------------
		List<String> list = map(t, x -> x.getName()+"의 회원평균연령과 차이:" +( x.getAge()-ageAvg ));
		List<String> list2 = map(t,x->x.getName()+"님 안녕하세요?");

		System.out.println("결과출력1:");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("결과출력2:");
		for (String x : list2) {
			System.out.println(x);
		}

	}

	static class MyMember {
		private String name;
		private int age;

		public MyMember(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
}
