package l02_fundamental;

import java.util.function.Function;

public class L04FunctionTypeInterfaceExample {
	// 중요:
	// -----------------------------------------------------------------------------------------------------------
	// 그리고 자바 8부터 빈번하게 사용되는 패턴을 표준화하여 크게 5가지의 함수적 인터페이스로
	// 분류해서 제공하고 있다.
	// Consumer 타입 ==> 매개값은 있지만 리턴값은 없는 패턴 타입 (소비타입)
	// Supplier 타입 ==> 매개값은 없고, 리턴값은 있음 (공급타입)
	// ############################################################
	// Function 타입 ==> 매개값도 있고, 리턴값도 있음, 주로 매개값을 리턴값으로 매핑(타입변환) - 함수타입
	// ############################################################
	// Operate 타입 ==> 매개값도 있고, 리턴값도 있음, 주로 매개값을 연산하고 결과를 리턴 - 연산타입
	// Predicate 타입 ==> 매개값 있고, 리턴 타입은 boolean, 주로 매개값을 조사해서 true/false를 리턴 -
	// 기술타입
	// -------------------------------------------------------------------------------------------------------------------

	// 위 중 Function 타입 사용 예
	// 종류 - Function<T,R> 	R apply(T t) T객체를 R객체로 매핑 (리턴의 R)
	// BiFunction<T,U,R> 	R apply(T t,U u) T객체와 U객체를 R객체로 매핑
	// DoubleFunction<R>	R apply(double value) double을 객체 R로 매핑
	// IntFunction<R> 		R apply(int value) int를 객체 R로 매핑
	// IntToDoubleFunction double applyAsDouble(int val) int를 double로 매핑
	// LongToDoubleFunction double applyAsLong(long val) long을 double로 매핑
	// LongToIntFunction int applyAsInt(long value) long을 int로 매핑
	// ToDoubleBiFunction<T,U> double applyAsDouble(T t,U u) t객체와 u객체를 double로
	// 매핑

	public static void main(String[] args) {
		
		Function<Integer, String> func1 = (x) -> {
			String res ="";
			switch(x) {
			case 0:
				res = "영";
				break;
			case 1:
				res = "일";
				break;
			case 2:
				res = "이";
				break;
			case 3:
				res = "삼";
				break;
			case 4:
				res = "사";
				break;
			case 5:
				res = "오";
				break;
			case 6:
				res = "육";
				break;
			case 7:
				res = "칠";
				break;
			case 8:
				res = "팔";
				break;
			case 9:
				res = "구";
				break;
			}
			return res;};
			System.out.println(func1.apply(8));
			System.out.println(func1.apply(1));
	}
}
