package ex01;

import java.awt.Toolkit;
//소리나옴(비프음)
public class BeepThread extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// 싱글톤과 비슷
		for(int i=0;i<=5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
