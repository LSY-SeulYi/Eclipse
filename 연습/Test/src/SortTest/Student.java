package SortTest;

public class Student {

	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	int total = kor+eng+math;
	
	double avg = total/3.0;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int no, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (kor+eng+math)/3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
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
		this.total = kor+eng+math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = (kor+eng+math)/3.0;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + "]";
	}
	
	
}