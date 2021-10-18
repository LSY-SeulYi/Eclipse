package strram17_ex;

import java.util.Arrays;
import java.util.List;

public class LoopingTest {

	public static void main(String[] args) {
	
		new LoopingTest().test();
	}
	public void test() {
		List<Score> list = Arrays.asList(
				new Score("홍길동",56,89),
				new Score("홍경래",99,79),
				new Score("이소라",55,77));
		
		// 원하는 데이터는 평균
//		double avg = list.stream().flatMap(x->x.total).peek(s->System.out.println(s)).average().getAsDouble();
		
		
		long cnt = list.stream().peek(s->System.out.println(s)).count();
		System.out.println("자료수 : " + cnt);
		
	}
	
	class Score{
		
		String name;
		int kor;
		int eng;
		int total;
		
		public Score() {}
		public Score(String name,int kor,int eng) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.total = kor+eng;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		@Override
		public String toString() {
			return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + "]";
		}
		
	}
	
}
