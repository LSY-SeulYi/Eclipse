package ex04_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set ~ 중복 배제하는 자료 구조
public class TestOfSet2 {

	public static void main(String[] args) {
		
		Set<Score> scores = new HashSet<>();
		scores.add(new Score("홍길동",67));
		scores.add(new Score("홍경래",78));
		scores.add(new Score("홍길동",67));
		scores.add(new Score("김수로",88));
		
		System.out.println(scores);
		System.out.println(Arrays.toString(scores.toArray()));
		
		// 정렬할 수 없는 객체는 트리셑에 넣을 수 없다.	(Comparable 을 이용해서 따로 정렬 명령 해야 함)	
		// 정렬할 수 있다 함은 해당 클래스 선언 시 Comparable, Comparator 중 하나 구현.
		Set<Score> scores1 = new TreeSet<>();
		scores1.add(new Score("홍길동",67));
		scores1.add(new Score("홍경래",78));
		scores1.add(new Score("홍길동",67));
		scores1.add(new Score("김수로",88));
		
		System.out.println(scores1);
		System.out.println(Arrays.toString(scores1.toArray()));
	}
	static class Score implements Comparable<Score>{
		String name;
		int kor;
		public Score(String name, int kor) {
			super();
			this.name = name;
			this.kor = kor;
			
		}
		@Override
		public String toString() {
			return "Score [name=" + name + ", kor=" + kor + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + kor;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Score other = (Score) obj;
			if (kor != other.kor)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public int compareTo(Score o) {
			return -(this.kor-o.kor);
		}
		
	}
}
