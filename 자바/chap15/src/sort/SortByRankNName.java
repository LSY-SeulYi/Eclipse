package sort;

import java.util.Comparator;

public class SortByRankNName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.rank - o2.rank;
		if(res == 0) {
			res = (o1.name).compareTo(o2.name);
		}
		return res;
	}
}
