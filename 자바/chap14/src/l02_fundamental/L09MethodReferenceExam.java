package l02_fundamental;

import java.util.function.IntBinaryOperator;

// 메소드 참조(Method Reference)의 의의---------------------------------
// 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 스스로 알아내,
// 람다식에서 복잡하게 표현되는 매개변수를 제거하여 코드를 간결하게 한다.
// 정적메소드 나 인스턴스 메소드 모두를 참조할 수 있다.
//----------------------------------------------------------------------------
public class L09MethodReferenceExam {

	public static void main(String[] args) {
		// 2개의 int형 매개변수를 받아 적절한 연산후 리턴시켜주는 
		// Functional Interface
		IntBinaryOperator ibo;
		
		// 정적메소드 사용방법
		ibo =(x,y)->Calculator.staticMethod(x, y);
		System.out.println("결과1:"+ibo.applyAsInt(10,100));

		ibo = Calculator::staticMethod;	// 메소드 레퍼런스 방식 (람다보다간편하여 람다대체방법)
		System.out.println("결과2:"+ibo.applyAsInt(10,100));
		
		// 인스턴스메소드 사용방법 
		ibo =(x,y)->new Calculator().instanceMethod(x, y);
		System.out.println("결과3:"+ibo.applyAsInt(10,100));

		ibo = new Calculator()::instanceMethod;
		System.out.println("결과4:"+ibo.applyAsInt(10,100));
	}
}
class Calculator{
	public static int staticMethod(int x,int y){
		return x+y;
	}
	public int instanceMethod(int x,int y){
		return x+y;
	}
}
