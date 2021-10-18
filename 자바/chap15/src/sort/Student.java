package sort;

import java.util.Comparator;

// VO(DTO) 클래스 Value Object, Data Transfer Object
// 기본적인 VO의 정렬방식은 해당 VO의 클래스를 Comparable을 구현한다.
public class Student implements Comparable<Student>,Comparator<Student>{
	
	String no;
	String subject;
	String name;
	String phone;
	int rank;
	
	@Override
	public int compareTo(Student o) {
		int res = (this.no).compareTo(o.no);
		return res;
	}

	public Student(String no, String subject, String name, String phone, int rank) {
		super();
		this.no = no;
		this.subject = subject;
		this.name = name;
		this.phone = phone;
		this.rank = rank;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", subject=" + subject + ", name=" + name + ", phone=" + phone + ", rank=" + rank
				+ "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		int res = (o1.no).compareTo(o2.no);
		return res;
	}
	

}
