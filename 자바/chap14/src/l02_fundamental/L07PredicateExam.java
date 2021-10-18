package l02_fundamental;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

//Predicate 타입의 함수적 인터페이스는 
// and(), or(), negate() 와 같은 디폴트 메소드를 가지고 있다.
// 논리연산자인 &&,||,! 와 대응된다. 
// 이것의 활용법을 살펴본다.
// 이 타입의 클래스들 (Predicate,BiPredicate,DoublePredicate,IntPredicate,LongPredicate)

public class L07PredicateExam {
	public static void main(String[] args) {
		
		// 12가 2와 3의 공배수인가? - 두 Predicate를 논리연산한 새로운 Predicate 생성하기
		// 2의 배수검사 
		IntPredicate predicate2 = a->a%2 == 0;
		// 3의 배수검사 
		IntPredicate predicate3 = a->a%3 == 0;
		// 
		IntPredicate predicate23 = predicate2.and(predicate3); // (and = default메소드)
		boolean result = predicate23.test(12);	// 추상메소드
		System.out.println("12의 2와 3의 공배수 여부: "+ result);
		
		// 두개의 객체가 동일한지 테스트 해본다.
		
		Foo foo1 = new Foo();foo1.setName("박길동");
		Foo foo2 = new Foo();foo2.setName("박길동");
		
		Predicate<Foo> pre = Predicate.isEqual(foo1);// 비교대상 지정	(isEqual = static메소드)
		System.out.println(pre.test(foo2)); // 비교작업	(test = 추상메소드)
		
	}
	static class Foo{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		// 아래 2개의 메소드가 들어가야 동일객체인지 인식할 수 있다.
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Foo other = (Foo) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}
}
