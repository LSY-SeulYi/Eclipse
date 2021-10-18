package 과제;

import java.util.*;

public class ThreadMap extends Thread{

	@Override
	public void run() {
		
		Map<String,String> dic = new HashMap<>();
		dic.put("advice", "충고");
		dic.put("pole", "막대기");
		dic.put("all together", "다함께");
		dic.put("champion", "우승자");
		dic.put("site", "위치");
		dic.put("mission", "임무");
		dic.put("chicken", "닭");
		dic.put("dose", "복용량");
		dic.put("pray", "기도하다");
		dic.put("immoral", "비도덕적인");
		dic.put("grim", "엄숙한");
		dic.put("clash", "충돌");
		dic.put("pedal", "페달");
		dic.put("contact", "연락");
		dic.put("climactic", "절정의");
		dic.put("complement", "보완하다");

		for(String key:dic.keySet()) {
			try {
				Thread.sleep(2000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			System.out.println("단어 : ["+key+"]");
			try {
				Thread.sleep(2000);
			
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			
			}
			System.out.println("뜻 : "+dic.get(key));
			System.out.println();
			
		}
	}
}
