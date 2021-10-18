package strram17_ex;

import java.util.Arrays;
import java.util.List;

import strram17_ex.LoopingTest.Score;
import strram17_ex.TestMapping1.Scroe;

public class TestMapping2 {

	public static void main(String[] args) {
		
		new TestMapping2().test();
	}
	public void test() {
		List<Scroe> data = Arrays.asList(
				new Scroe("윤봉길", 100,99,80),
				new Scroe("박사달", 56,90,88),
				new Scroe("우장춘", 89,98,78),
				new Scroe("피천득", 45,33,56));
		List<Scroe> data1 = Arrays.asList(
				new Scroe("윤봉길", 100,99,80),
				new Scroe("박사달", 56,90,88),
				new Scroe("우장춘", 89,98,78),
				new Scroe("피천득", 45,33,56));
		
		data.stream().mapToInt(s->s.getTotal()).forEach(s->System.out.println(s));
		data.stream().mapToDouble(s->s.getTotal()/3.0).forEach(s->System.out.println(s));
		data1.stream().mapToInt(s->s.getKor()).sum();

		data.stream().forEach(s->System.out.println(getInfor(s)));
		
	}
	public String getInfor(Scroe x) {
		return "학생이름 :" +x.getName()+"\n"+"국어성적:"+x.getEng()+"\n"+"영어성적:"+x.getEng()+"\n"+"수학점수:"+x.getMath()+"\n"+"총점:"+x.getTotal()+"\n"+"평균:"+x.getTotal()/3.0+"\n";
	}
	class Scroe {
		
		String name;
		int kor;
		int math;
		int eng;
		int total;
		
		public Scroe() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Scroe(String name, int kor, int math, int eng) {
			super();
			this.name = name;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
			this.total = kor+math+eng;
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
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
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
			return "Scroe [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", total=" + total
					+ "]";
		}
	}
}
