package ex04;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// 학생 이름으로 정렬 (String은 해시코드로 비교정렬 하거나 compareTo를 사용)
		int res = o1.name.compareTo(o2.name);
		return res;
	}
	
	

}
