package ex01;
// 인터페이스 의의 ~ 특수한 클래스 제작을 위한 가이드 라인 (메소드명토일)
public interface MyInter {
	// 인터페이스의 구성멤버 (4가지)
	// 필드(상수), 추상메소드, default메소드, static메소드
	double PI = 3.141592;	// 상수 필드 => public final static double PI =가 되는 거임.
	void disp();	// 몸통이 없는 추상메소드 => public abstract void disp() 가 되는 거임.
	
// 아래 default메소드, static메소드 멤버는 자바 1.8버전으로의 확장을 위해서 나온 추가된 기능이다.
	// default 메소드는 블럭(몸통)이 있어야 함. (public 안붙여도 숨어있음.)
	default int sum(int a, int b) {	// 메소드 이름 몰라도 사용 가능.
		return a+b;
	}
	
	// static 메소드는 블럭(몸통)이 있어야 함. (public 안붙여도 숨어있음.)
	static long someMethod() {
		return System.currentTimeMillis();
	}
}
