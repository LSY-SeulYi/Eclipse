package ex02;

import java.util.Arrays;

public class 경마장 {

	public static void main(String[] args) {
		
		MyHorse[] horse = {
			new MyHorse("각주구검"),
			new MyHorse("금상첨화"),
			new MyHorse("유유자적"),
			new MyHorse("권토중래"),
			new MyHorse("평사낙안"),
			new MyHorse("새옹지마"),
			new MyHorse("유구무언"),
			new MyHorse("타산지석"),
			new MyHorse("천상천하"),
			new MyHorse("마이동풍"),
		};
		MyHorse.start = System.currentTimeMillis();
		
		
		horse[5].setPriority(10);
		
		for(int i=0;i<horse.length;i++) {
			horse[i].start();
		}
		for(int i=0;i<horse.length;i++) {
			try {
				horse[i].join();	// 메인 스레드 이 스레드가 수행끝날때 까지 정지됨.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Arrays.sort(horse);
		System.out.println("경주가 끝났습니다.");
		for(int i=0;i<horse.length;i++) {
			System.out.println(horse[i].getName()+":"+horse[i].rank+"등"+", 걸린시간 : "+horse[i].timeTaken/1000.0+"sec");
		}
	}
}
