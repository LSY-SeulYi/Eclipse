package test;

public class Test4 {

	String name;
	String no;
	int kor;
	int eng;
	int sum;
	double avg;
	
	int a;	// 3의 배수
	int b;	// 구구단 6단
	public Test4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test4(String name, String no, int kor, int eng, int sum, double avg, int a, int b) {
		super();
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.sum = sum;
		this.avg = avg;
		this.a = a;
		this.b = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Test4 [학생 이름 : " + name + ", 학번 : " + no + ", 국어점수 : " + kor + ", 영어점수 : " + eng + ", 총점 : " + sum + ", 평균 : " + avg
				+ ", 3의 배수값=" + a + ", 구구단 6단=" + b + "]";
	}

	
	
	
}
