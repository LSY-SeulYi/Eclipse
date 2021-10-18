package ex02;

import java.util.Comparator;

public class MyHorse extends Thread implements Comparable<MyHorse>{

	public static int acuRank;	// 누산 등수 (static => 공유하는 것으로 Horse의 모든 점수 누산을 위해 static 사용함)
	
	public int rank;	// 순위 매길수 있는 것(객체 각각의 자신 등수)
	
	public static long start;
	
	public long timeTaken;	// 걸린시간
	
	public MyHorse(String name) {
		super.setName(name);	// 스레드의 고유 이름을 넣어줄 수 있음
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public void run() {
		super.run();
		start = System.currentTimeMillis();
		for(int i=0;i<=50;i++) {
			System.out.println(super.getName()+"이 "+ i+"구간을 통과하였습니다.");
			try {
				Thread.sleep((int) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		timeTaken = System.currentTimeMillis()-start;
		++acuRank;
		this.rank = acuRank;
	}
		@Override
		public int compareTo(MyHorse o) {
			return this.rank-o.rank;
	}
}
