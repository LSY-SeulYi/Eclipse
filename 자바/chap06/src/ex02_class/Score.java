package ex02_class;
// 학생들의 점수를 객체화 시키는 클래스
public class Score {
	
	// 멤버필드 선언
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 총점과 평균은 자동계산하여 대입할 수 있다.
	private int total;	// 총점
	private double avg;	// 평균
	
	// 생성메소드 - 일반 생성자를 넣을때에는 기본 생성자를 명시화 시켜야 함.
	public Score() {} // => 기본 생성자
	public Score(String name,int kor,int eng,int math) { // 일반 생성자 => 기본 생성자를 살려 놓고 만들어야 함.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	public String toString() {
		return "이름 : "+name+", "+"국어점수 : "+kor+", "+"영어점수 : "+eng+", "+"수학점수 : "+math+", "+"총점 : "+total+", "+"평균 : "+avg;
	}
	
	// 마우스 오른쪽 -> 소스 -> 제너레이트게터세터 -> 만들거 체크 후 확인
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
