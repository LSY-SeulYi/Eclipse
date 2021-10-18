package ex04;

public class RunTest {
	public static void tunnel(Vehicle v) {
		v.run();
	}
	public static void main(String[] args) {
		Vehicle texi = new Vehicle() {

			@Override
			public void start() {
				System.out.println("택시가 출발합니다.");
				
			}

			@Override
			public void stop() {
				System.out.println("택시가 정지 합니다.");
				
			}

			@Override
			public void speedUp() {
				System.out.println("택시가 가속 합니다.");
				
			}

			@Override
			public void speedDn() {
				System.out.println("택시가 감속 합니다.");
				
			}
			
		};
		Vehicle truck = new Vehicle() {

			@Override
			public void start() {
				System.out.println("트럭이 출발 합니다.");
				
			}

			@Override
			public void stop() {
				System.out.println("트럭이 정지 합니다.");
				
			}

			@Override
			public void speedUp() {
				System.out.println("트럭이 가속 합니다.");
				
			}

			@Override
			public void speedDn() {
				System.out.println("트럭이 감속 합니다.");
				
			}
		};
		RunTest.tunnel(texi);
		RunTest.tunnel(truck);
		RunTest.tunnel(new Bus());
		Vehicle sigolBus = new Bus();
		RunTest.tunnel(sigolBus);
		
		Vehicle[] passes = {
				texi,truck,sigolBus
		};
	}

}
