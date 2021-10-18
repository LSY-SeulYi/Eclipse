package 과제2;
import java.util.*;
public class WordMachine extends Thread{
	Map<String,String> dicData;
	public WordMachine(Map<String,String> dicData) {
		this.dicData = dicData;
	}
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		try {
			for(String key:dicData.keySet()) {
				System.out.println("단어:"+key);
				Thread.sleep(2000);
				System.out.println("의미:"+dicData.get(key));
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("학습한단어수:"+dicData.size());
			System.out.println("학습시간: "+(System.currentTimeMillis()-start)+"ms");
		}
	}
}
