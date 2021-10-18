package strram17_ex;

import java.util.Arrays;

public class MatchTest {

	public static void main(String[] args) {
		
		new MatchTest().test();
	}
	public void test () {
		
		String[] names = new String[] {
				"마광수", "박차고나온달", "김마리아","박팽수","최현"
		};
		// 스트림 사용시
		boolean res = 
				Arrays.stream(names).allMatch(n->n.length()>=2);
		System.out.println("모든 이름이 2글자 이상인가?: "+ res);
		res = false;
		
		// 스트림 사용 안할시
		int cnt = 0;
		for(int i=0; i<names.length; i++) {
			if(names[i].length()>=2) {
				cnt += 1;
			}
		}
		res = cnt == names.length;	
		System.out.println("모든 이름이 2글자 이상인가? :"+ res);
	}
}
