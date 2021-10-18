package ex01;
// 상속 - 확장, ~ is a 관계
public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
