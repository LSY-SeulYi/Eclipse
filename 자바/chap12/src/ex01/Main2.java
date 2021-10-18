package ex01;

public class Main2 {

	public static void main(String[] args) {
		// 다형성 이용
		Thread[] th ={
				new MyThread(),
				new MyThread(),
				new MyThread(),
				new MyThread(),
				new MyThread(),
				new MyThread(),
				new Thread(new BeepTask())
		};
		for(int i=0;i<th.length;i++) {
			th[i].start();
		}
	}
}
