package 과제2;
public class Score {
	private String no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	public int total;
	public double avg;
	public int rank;
	public Score() {
	}
	public Score(String no,String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = (int) ((total / 3.0) * 100) / 100.0;
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return no+"\t"+name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg+"\t"+rank;
	}

	public static void dispColumn() {
		System.out.println("===========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===========================================================");
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}