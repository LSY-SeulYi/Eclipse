package strram17_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMapping1 {

	public static void main(String[] args) {
		
		new TestMapping1().test();
		
	}
	
	public void test() {
		List<Scroe> data = Arrays.asList(
				new Scroe("윤봉길", 100,99,80),
				new Scroe("박사달", 56,90,88),
				new Scroe("우장춘", 89,98,78),
				new Scroe("피천득", 45,33,56));
		
		// 객체의 일부분만 갖고와서 쓰고 싶을때 FlatMap을 사용
		Stream<String> nameStream = data.stream().map(s->s.name);
		nameStream.forEach(System.out::println);
		// 국어성적 스트림
		Stream<Integer> korStream = data.stream().map(s->s.kor);
		data.stream().map(s->s.kor).forEach(System.out::println);
		data.stream().map(s->s.kor).forEach(x->System.out.println(x));
		
		data.stream().map(s->s.total).forEach(System.out::println);
		
		// 단어로만 이루어진 스트림
		List<String> poems = Arrays.asList(
				"나그네여 강나루", "건너서 밀밭길을","구름에 달 가듯이 가는 나그네","길은 외줄기 남도 삼백리","술익은 마을마다 타는 저녁놀"
				);
//		poems.stream().flatMap(str->Arrays.stream(str.split(" "))).forEach(s->System.out.print(s+" "));
		// 새로운 스트림으로 담아내기
		Stream<String> 시어 = poems.stream().flatMap(str->Arrays.stream(str.split(" ")));
		// 새로운 리스트로 담아 내기
		List<String> poemsWords = poems.stream().flatMap(str->Arrays.stream(str.split(" "))).collect(Collectors.toList());
		System.out.println(poemsWords);
	}
	
	class Scroe {
		
		String name;
		int kor;
		int math;
		int eng;
		int total;
		
		public Scroe() {
			super();
			
		}
		
		public Scroe(String name, int kor, int math, int eng) {
			super();
			this.name = name;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
			this.total = kor+math+eng;
		}

		@Override
		public String toString() {
			return "Scroe [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		}
}
}
