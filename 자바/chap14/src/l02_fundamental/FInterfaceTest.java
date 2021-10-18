package l02_fundamental;

/*
 함수형 인터페이스(Functional Interface,@FunctionalInterface)와 
 마커인터페이스(Marker Interface)
  
 - 마커인터페이스(marker interface) -  구현해야 되는 추상메소드가 없는 인터페이스를 의미한다. 
 - 단지 그 인터페이스를 구현했다고 기술한 클래스에 어떤 의미를 부여하기 위한것이다.

 - Functional Interface -  추상메소드가 하나뿐인 인터페이스
 - java.lang.Runnable - 함수형 인터페이스 이다.(void run() 추상메소드 하나 있다.)
 - ActionListener interface역시 함수형 인터페이스이다.(actionPerformed() 추상메소드 하나 있다.)
 - 이러한 함수형 인터페이스의 인스턴스를 생성하기 위해 익명 클래스등을 주로 사용했지만 
   람다식을 이용하면 아주 편하다.
 - @FunctionalInterface 어노테이션은 JAVA8에서 추가되었으며 함수형 인터페이스 임을 나타낸다.

 - Runnable 인터페이스의 인스턴스를 람다식을 이용하여 아래처럼 얻을 수 있다.
 - Runnable r = () -> System.out.println("xxxxxxxxxxxxxx");
 - 쓰레드를 생성할 때 아래처럼 람다식을 이용할 수도 있다.
 	new Thread(
 		() -> System.out.println("xxxxxxxxxxxxx")
 	).start();
 */

public class FInterfaceTest {
	static void execute(FInterface worker) {
		worker.foo();
		//worker.haha();
	}

	public static void main(String[] args) {
		// 익명의 inner Class 방식
		execute(new FInterface() {
			@Override
			public void foo() {
				System.out.println("Foo... xxxxxxxxxxx");
			}
		});
		// 람다 방식(위 방식을 간편하게 처리한것)
		execute(() -> System.out.println("Foo... xxxxxxxxxxxxxxx"));
		
		// default 메소드의 활용예 
		new FInterface(){
			@Override
			public void foo() {}
		}.haha(); 
		new FInterface(){
			@Override
			public void foo() {}
		}.hoho(); 
	}
}

// @FunctionalInterface
interface FInterface {
	public void foo();// 추상메소드는 오직 하나이어야 한다.
	// 인터페이스인데 default 예약어를 붙이면 concrete 메소드 여러 개도 가질 수 있다.
	public default void haha(){ 
		System.out.println("hahahahaha");
	};
	public default void hoho(){ 
		System.out.println("hohohohoho");
	};
}
