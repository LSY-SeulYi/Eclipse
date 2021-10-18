package ex01;

public class MyTask2 implements Runnable{

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
