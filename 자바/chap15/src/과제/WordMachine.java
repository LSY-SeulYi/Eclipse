package 과제;

import java.util.Map;

public class WordMachine extends Thread{
	Map<String,String> dicData;
		
	public WordMachine(Map<String,String> dicData) {
		this.dicData = dicData;
	}
	
	@Override
	public void run() {
		long start = System.currentTimeMillis();
			for(String key:dicData.keySet()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("단어 : "+key);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		finally {
				System.out.println("학습한 단어수 : "+dicData.size());
//				System.out.println("학습시간 : "+System.currentTimeMillis()-((long).start));
			}	
			System.out.println("뜻 : "+dicData.get(key));
			}
		}
}