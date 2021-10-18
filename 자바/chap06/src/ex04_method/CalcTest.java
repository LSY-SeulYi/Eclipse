package ex04_method;
// Calculator 클래스의 사용 예제
public class CalcTest {

	public static void main(String[] args) {
	
		Calculator calc1 = new Calculator();
		//calc1.powerOn();
		System.out.println(calc1.add(100, 200));	// double 로 만들었는데 100,200으로 입력하면 작은 자료형에서 큰자료형으로 진급한거라 제대로 소수점으로 호출이 되는거임.
		System.out.println(calc1.sub(100, 200));
		System.out.println(calc1.mul(100, 200));
		System.out.println(calc1.div(100, 200));
		// 정적메소드(static)는 객체 생성없이 객체명 대신 클래스 명으로도 쓸수 있음
		System.out.println(Calculator.mul(100, 200));
		// 계산기가 켜져 있는 상태에서만 나누기 계산이 가능하게 만든다면
		System.out.println(calc1.div(100, 200));
		calc1.powerOn();
		System.out.println(calc1.div(100, 200));
	}
}
