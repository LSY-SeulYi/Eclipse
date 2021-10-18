package sort;

import java.util.*;

// VO에 정렬정책을 포함시킬 때에는 Comparable을 구현한다.
// 여러가지의 정렬정책을 구현하고자 할 때에는 별도의 Comparator를 구현한다.
public class TestComparable {

	public static void main(String[] args) {
		
		List<Student> slist = Arrays.asList(
			new Student ("1234112","컴공과","나간보","010-2222-3454",57),
			new Student ("1234113","컴공과","김수로","010-2222-3451",99),
			new Student ("1234119","컴공과","곽탁타","010-2222-3452",86),
			new Student ("1234115","컴공과","혁거세","010-2222-3453",74),
			new Student ("1234127","컴공과","김일등","010-2222-3456",64),
			new Student ("1234111","컴공과","이삼들","010-2222-3455",79),
			new Student ("1234123","컴공과","김등","010-2222-3457",88),
			new Student ("1234116","컴공과","오사등","010-2222-3459",57),
			new Student ("1234129","컴공과","가로등","010-2222-3458",56),
			new Student ("1234215","컴공과","박일등","010-2222-3450",99)
		);
		// 학번 정렬
		slist.sort(new Student());
		for(Student x:slist) {
			System.out.print(x+"\t\n");
			System.out.print("\n");
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		// 등수로 정렬
		slist.sort(new SortByRankNName());
		for(Student x:slist) {
			System.out.print(x+"\t\n");
			System.out.print("\n");
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		// 학생 이름으로 정렬
		slist.sort(new SortByStrudentName());
		for(Student x:slist) {
			System.out.print(x+"\t\n");
			System.out.print("\n");
		}
		System.out.println("-----------------------------------------------------------------------------------------");
	}
}
