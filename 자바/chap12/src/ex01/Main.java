package ex01;

public class Main {

	public static void main(String[] args) {
		
		MyThread th1 = new MyThread();
		MyThread2 th2 = new MyThread2();
		MyThread3 th3 = new MyThread3();
		BeepThread th4 = new BeepThread();
		
		Thread t1 = new Thread(new MyTask1());	// 실무에서 많이 쓰는 스타일
		Thread t2 = new Thread(new MyTask2());
		Thread t3 = new Thread(new MyTask3());
		Thread t4 = new Thread(new BeepTask());

//		th1.run();	// run => 하나씩 실행
//		th2.run();
//		th3.run();
		th1.start();	// start는 수행할 스레드 동시에 실행
		th2.start();
		th3.start();
		th4.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
