package l02_fundamental;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;

// 자바에서 제공하는 한개의 추상메소드를 가지는 모든 인터페이스는
// 람다식의 타겟이 될 수 있다. 
// 예) Runnable 인터페이스는 run() 메소드 
// 하나만 있으므로 람다식을 이용할 수 있다.

// 인터페이스가 추상 메소드가 오직 하나이면 함수형 인터페이스이다.
// 다만. default method(default라는 예약어를 붙인)는 여러 개라도 상관없이 
// 함수형인터페이스(Functional Interface)가 된다.


// 중요:  -----------------------------------------------------------------------------------------------------------
// 그리고 자바 8부터 빈번하게 사용되는 패턴을 표준화하여 크게 5가지의 함수적 인터페이스로
// 분류해서 제공하고 있다. 
// Consumer 타입 ==> 매개값은 있지만 리턴값은 없는 패턴 타입 (소비타입)
// Supplier 타입 ==> 매개값은 없고, 리턴값은 있음 (공급타입)
// Function 타입 ==> 매개값도 있고, 리턴값도 있음, 주로 매개값을 리턴값으로 매핑(타입변환) - 함수타입 (어뎁터 패턴)
// Operate 타입 ==> 매개값도 있고, 리턴값도 있음, 주로 매개값을 연산하고 결과를 리턴 - 연산타입
// Predicate 타입 ==> 매개값 있고, 리턴 타입은 boolean, 주로 매개값을 조사해서 true/false를 리턴 - 기술타입(긴가민가타입)
//-------------------------------------------------------------------------------------------------------------------
// 각 타입은 많은 인터페이스들을 가지고 있다. 예를 들면 Consumer 타입을 살펴보면 
// Consumer<T>        추상메소드 void accept(T t) - 객체 t를 받아 소비 
// BiConsumer<T,U>                 void accept(T t,U u) - 객체 t,u를 받아 소비 
// DoubleConsumer                   void accept(double value) - double값을 받아 소비
// IntConsumer
// LongConsumer
// ObjDoubleConsumer<T>        void accept(T t,double value) -객체t와 double값을 받아 소비 
// ObjIntConsumer<T>
// ObjLongConsumer<T> 
// ------------------------------------------------------------------------------------------------------------------
public class L03StandardFunctionalInterface {
	 Thread thread,thread2;
	{
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep((long) (0.1 * 1000));
				} catch (InterruptedException e) {
				}
			}
		};
		thread = new Thread(runnable);
		thread2 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep((long) (0.1 * 1000));
				} catch (InterruptedException e) {
				}
			}
		});
		
	}
	public void test(){
		//    Consumer 인터페이스 사용예 -----------------------------------------------------
		BiConsumer<Thread,Thread> consumer = (thread,thread2)->{
			thread.start();
			thread2.start();
		};
		consumer.accept(thread, thread2);
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//----------------------------------------------------------------------------------------
		// 자 그렇다면 매개값은 없지만 연산 결과를 boolean Type으로 받는 함수적 인터페이스는 뭘까요? 
		// 매개값은 없지만 리턴값이 있는 타입은 Supplier 이지요? 
		// boolean Type을 리턴시키는 서플라이는 BooleanSupplier 입니다. 사용예를 살펴보면 
		final boolean flag = false;
		//flag =!flag;
		BooleanSupplier bs = ()->{
			// flag = true; 이와 같이 새로운 대입은 파이널 성질이어서 불가하나
			// !flag와 같은 연산은 가능하다.
			return !flag;
		};
		System.out.println(bs.getAsBoolean());
		
	}

	public static void main(String[] args) {
		new L03StandardFunctionalInterface().test();
	}
}
