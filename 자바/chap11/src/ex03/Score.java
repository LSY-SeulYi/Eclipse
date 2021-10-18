package ex03;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	// 일반 생성자 안만들면 그냥 기본생성자만 같고 하는 것임.
	
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
	
	@Override
	public String toString() {
		int total = eng+kor+math;
		double avg = total/3.0;
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	
}
