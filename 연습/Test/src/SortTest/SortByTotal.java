package SortTest;

import java.util.Comparator;

public class SortByTotal implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.total - o2.total;
		return -res;
	}

}
