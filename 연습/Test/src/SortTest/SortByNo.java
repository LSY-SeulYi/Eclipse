package SortTest;

import java.util.Comparator;

public class SortByNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.no - o2.no;
		return res;
	}

}
