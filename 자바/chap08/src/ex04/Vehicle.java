package ex04;

public interface Vehicle {
	int WHEEL = 4;
	void start();
	void stop();
	void speedUp();
	void speedDn();
	default void run() {
		System.out.println("고속도로를 달립니다.");
	}
	static String getInfo() {
		return "제원 : 바퀴수:"+WHEEL;
	}
}
