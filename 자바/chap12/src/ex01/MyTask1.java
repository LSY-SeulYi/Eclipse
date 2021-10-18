package ex01;

public class MyTask1 implements Runnable{

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
