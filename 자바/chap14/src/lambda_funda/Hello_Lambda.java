package lambda_funda;
// 람다식은 익명의 이너클래스를 간단하게 표현하는 방법이다.
public class Hello_Lambda {

	public static void main(String[] args) {
		
		
		Thread x = new Thread(new Runnable() {

			@Override
			public void run() {	// 익명의 이너클래스
				for(char i='a'; i<='z';i++) {
					System.out.println(i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
					}
				}
			}
		});
		
		Thread y = new Thread(()->{for(char i='A'; i<='Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}});
		
		x.start();
		y.start();
	}
}
