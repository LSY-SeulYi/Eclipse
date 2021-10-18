package ex01;
// 지역 이너 클래스(로칼 클래스 - 메소드 안의 이너클래스)
public class TestLocalCalss {

	void somemethod() {
		class D {
			D() {}; // 기본생성자
			int age;
			String name;
			void dipInfo() {
				System.out.println(age + "세인 "+ name);
			}
			
		}
	D d = new D();
	d.age = 18;
	d.name = "순이";
	d.dipInfo();
	
	// Thread
	class MyThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			for(char i='a';i<='z';i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);  // Thread는 특수라 예외처리 해야함.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
		}
	}	// 로칼클래스 end
	MyThread Thread = new MyThread();
	Thread.start(); // Thread는 run으로 실행 안하고 start로 실행 함.

	
	
	}
	public static void main(String[] args) {
		new TestLocalCalss().somemethod();
	}
	
}
