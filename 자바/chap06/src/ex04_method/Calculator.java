package ex04_method;
// 메소드(객체의 기능, 객체(API) 사용방법) 만드는 연습
public class Calculator {
	// 전원을 껐다 켰다 하는 기능 (추상)
	boolean isOn;
	void powerOn() {
		this.isOn = true;
		System.out.println("계산기 ON!");
	}
	void powerOff() {
		this.isOn = true;
		System.out.println("계산기 OFF!");
	}
	static double add(double a, double b) {
		return a+b;
	}
	static double sub(double a, double b) {
		return a-b;
	}
	static double mul(double a, double b) {
		return a*b;
	}
	double div(double a, double b) {
		if(isOn) { // isOn==true이렇게 코딩 하는 것도 맞음
			return a/b;
		}else {
			System.out.println("전원이 꺼져있습니다.");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Calculator a = new Calculator();
		System.out.println(a.add(13,13));
		System.out.println(a.sub(13,13));
		System.out.println(a.mul(13,13));
		System.out.println(a.div(13,13));
	}
}
