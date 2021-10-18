package 과제2;

import java.util.Comparator;

public class SortByTotalNMath implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
		int res = o1.total-o2.total;
		if(res == 0) {
			res = o1.getMath()-o2.getMath();
		}
		return -res;
	}

}
