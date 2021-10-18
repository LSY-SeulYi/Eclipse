package ex02;

public class RunnerTest implements Runner {

	public static void main(String[] args) {
		MyRunner runner = new MyRunner();
		runner.run();
		
		// 익명의 구현체 - 인터페이스를 구현한 구현체 없이 객체를 만든 경우
		Runner runner2 = new Runner() {
			@Override
			public void run() {
				System.out.println("사뿐사뿐 스텝을 밟고 있습니다.");
			}
		};
		runner2.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
