package l02_fundamental;
// 자바 8 부터는 인터페이스에 정적메소드를 콘크리트화 시킬수 있다.
public class L05FunctionInterfaceExam {

	public static void main(String[] args) {
		MyFunctionalInterface mi = (a,b)->{
			System.out.println(a+b);
		};
		mi.disp(10, 20);
		mi.hello2();
		MyFunctionalInterface.hello();
		
	}

}

@FunctionalInterface
interface MyFunctionalInterface{
	// 추상메소드
	public void disp(int a,int b);
	// 정적메소드
	public static void hello(){
		System.out.println("Hello~");
	}
	// default 메소드
	public default void hello2(){
		System.out.println("Hello2~");
	}
}
