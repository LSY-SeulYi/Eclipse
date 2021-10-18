package stream08_match;

import java.util.Arrays;

public class MatchSample {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		boolean res = Arrays.stream(arr).allMatch(a->a%2==0);
		System.out.println("모두 2의 배수인가? "+res);
		// 
		res = Arrays.stream(arr).anyMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수가 있는가? "+res);
		// 
		res = Arrays.stream(arr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없는가? "+res);
	}

}
