package l01_before_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class BeforeLambda02 {
	public BeforeLambda02() {}
	public static void main(String[] args) {
		String[] strs = new String[]{
				"청산리","벽개수야","수이감을 자랑","마라","일도창해"
		};
		Arrays.sort(strs,new LengthComparator());
		System.out.println(Arrays.toString(strs));
	}
	// 이너클래스, 중첩클래스 (static-정적) => 정렬정책을 담은 이너클래스, 글자길이로 오름차순 정렬
	static class LengthComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return Integer.compare(o1.length(), o2.length());
		}
	}
}
