package l04_람다표현식의파라미터;
import java.util.function.IntConsumer;

// 함수형 인터페이스 종류
// Runnable, Supplier<T>,Consumer<T>,BiConsumer<T,U>
// Function<T,R>, BiFunction<T,R>, UnaryOperator<T>
// BinaryOperator<T>,Predicate<T>,BiPredicate<T,U>

public class TestLambda03 {
	public static void main(String[] args) {
		new TestLambda03().test();
	}

	public void test() {

		// 기성의 함수형 인터페이스 활용한 람다 호출 예
		repeat(10, i -> System.out.println("CountDown: " + (9 - i)));
		
		// 사용자 정의 함수형 인터페이스 활용한 람다 호출 예
		// 인터페이스 XXX 객체 x를 만드는데 매개변수 int num을
		// 전달 받으면 그놈을 다음문장의 num 변수부분에 전달하여 아래 문장을 수행한다.
		XXX x = (num) -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("합계(void형) ==>" + sum);
		};
		x.sum(100);
		
		YYY y = (num) -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println("합계(return형) ==>"+y.sum(100));
	}
	
	// IntConsumer - 미리제공된 함수형 인터페이스 (accept라는 메소드 하나가졌음)
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++)
			action.accept(i);
	}
	interface XXX {
		public void sum(int x); //void형
	}
	interface YYY{
		public int sum(int x); //return형
	}
}
