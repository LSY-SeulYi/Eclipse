package ex09_scores;

import java.util.Comparator;

public class Score implements Comparator<Score>{

	// 객체 생성시 입력
	public String no;
	public String name;
	public int kor;
	public int eng;
	public int math;
	// 내부적인 연산
	public int rank;
	public int total;
	public double avg;
	
	// 기본 생성자
	public Score() {}
	// 일반 생성자
	public Score(String no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (int)((total/3.0)*100)/100.0;
	}
	@Override
	public String toString() {
		return "Score [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", rank="
				+ rank + ", total=" + total + ", avg=" + avg + "]";
	}
	@Override
	public int compare(Score o1, Score o2) {
		return - (o1.total - o2.total);
	}
	
	
	
}
