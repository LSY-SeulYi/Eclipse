package ex01;
// 상속 - 확장, ~ is a 관계
public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(char i='a';i<='z';i++) {
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
