package 과제2;

import java.util.Comparator;

public class SortByTotal implements Comparator<Student>{

	@Override
	public int compare(과제2.Student o1, 과제2.Student o2) {
		int res = o1.total - o2.total;
		if(res == 0) {
			res = o1.math-o2.math;
		}
			return -res;
	}

}
