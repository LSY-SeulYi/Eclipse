package stream06_sort;

import java.util.Comparator;

public class ScoreComparator implements Comparator<MyScore>{

	@Override
	public int compare(MyScore o1, MyScore o2) {
		// TODO Auto-generated method stub
		return (new Integer(o1.getTotal()).
				compareTo(new Integer(o2.getTotal())));
	}

}
