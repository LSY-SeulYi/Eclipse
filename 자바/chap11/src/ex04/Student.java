package ex04;
// Compare (비교) 할수 있는 클래스를 설계하려면 VO클래스 내에 Comparable이나 Comparator 인터페이스를 구현해야 함
// 순서 정렬
// Comparator => 정렬 클래스를 따로 만들어주는 것.

public class Student implements Comparable{

	int sno;	// 학생번호
	String name;	// 학생이름
	int score;	// 입학성적
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sno, String name, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", score=" + score + "]";
	}

	// 비교 정책(정렬 정책)을 기술해야 함
	@Override
	public int compareTo(Object o) {
		// 학생번호로 정렬한다면
		int res = this.sno - ((Student)o).sno;
		return res;
		
		
	}
	
	
}
