package l01_before_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BeforeLambda01 {
	public static void main(String[] args) {
		String[] names = new String[] { "zadsadasdasd", "asadsa", "mf23dsdfs",
				"kdsd", "arilangarilangaraliyo" };
		// 문자열의 오름차순 정렬
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		//
		
		
		List<String> name2 = Arrays.asList(names);
		Collections.sort(name2);
		System.out.println(name2);
		Collections.shuffle(name2);
		System.out.println(name2);
		
		
	}
}
