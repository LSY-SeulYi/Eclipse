package ex04;

import java.util.Comparator;

public class SortByScore implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// 학생 성적순
		int res = o1.score - o2.score;
		return -res;
	}
	

}
