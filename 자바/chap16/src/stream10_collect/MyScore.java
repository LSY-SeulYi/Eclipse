

package stream10_collect;

import java.util.Comparator;

public class MyScore implements Comparable<MyScore>{
	
	enum Sexual{MALE,FEMALE}
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	private Sexual sexual;
	
	public MyScore(){}
	
	public MyScore(String name, Sexual sexual, int kor, int eng, int math) {
		super();
		this.name = name;
		this.sexual = sexual;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal(kor+eng+math);
		setAvg(((int)(getTotal()/3.0*100.0))/100);
	}

	public Sexual getSexual() {
		return sexual;
	}
	public void setSexual(Sexual sexual) {
		this.sexual = sexual;
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
	
	@Override
	public String toString() {
		return "MyScore [name=" + name +", sexual=" + sexual + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", total=" + total + ", avg=" + avg + "]";
	}
	
	@Override
	public int compareTo(MyScore o) {
		// TODO Auto-generated method stub
		return Integer.compare(getTotal(), o.getTotal());
	}
	
}
