package ex04;

public class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println("버스가 출발 합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("버스가 정지 합니다.");
		
	}

	@Override
	public void speedUp() {
		System.out.println("버스가 가속 합니다.");
		
	}

	@Override
	public void speedDn() {
		System.out.println("버스가 감속 합니다.");
		
	}
	

}
