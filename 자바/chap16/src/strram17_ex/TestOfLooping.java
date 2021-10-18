package strram17_ex;

import java.util.Arrays;
import java.util.List;

public class TestOfLooping {

	public static void main(String[] args) {
		new TestOfLooping(). test();
	}
	
	public void test() {
		
		List<Scroe> list = Arrays.asList(
				new Scroe("김일등", 100,99,80),
				new Scroe("이이등", 90,77,79),
				new Scroe("김삼등", 89,92,97),
				new Scroe("박사등", 79,92,86),
				new Scroe("최오등", 68,67,72)
				);
		List<Scroe2> list2 = Arrays.asList(
				new Scroe2(100,99,80),
				new Scroe2(90,77,79),
				new Scroe2(89,92,97),
				new Scroe2(79,92,86),
				new Scroe2(68,67,72)
				);
		long cnt = list.stream().peek(s->System.out.println(s)).count();
		System.out.println(cnt);
		
	}
	class Scroe2 {
		int kor;
		int math;
		int eng;
		public Scroe2() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Scroe2(int kor, int math, int eng) {
			super();
			this.kor = kor;
			this.math = math;
			this.eng = eng;
		}
		@Override
		public String toString() {
			return "Scroe2 [kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		}
		
	}
	class Scroe {
		
		String name;
		int kor;
		int math;
		int eng;
		
		public Scroe() {
			super();
			
		}
		
		public Scroe(String name, int kor, int math, int eng) {
			super();
			this.name = name;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
		}

		@Override
		public String toString() {
			return "Scroe [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		}
		
		
	}
}
