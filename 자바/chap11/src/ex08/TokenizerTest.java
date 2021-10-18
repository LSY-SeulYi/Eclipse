package ex08;

import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		
		String someText = "이연수,윤장환,윤보선,이승만";
		// 자료구조의 일종인 토크나이즈 객체 (단어 나열 시 하나씩 뽑아서 나열하는 것이기 때문에 다시 사용하려면 객체생성도 다시 해야함)
		StringTokenizer st = new StringTokenizer(someText,",");
		int cntWords = st.countTokens();	// 단어가 몇 단어인지 알수 있는 메소드
		for(int i=0;i<cntWords;i++) {
			String token = st.nextToken();
			System.out.println(token);	// 단어별로 잘라서 나열 (한번 나열해서 사용하면 재활용 못함)
		}
		System.out.println(cntWords);
		System.out.println("-----------------------------------------------------------------");
		
		
		st = new StringTokenizer(someText,",");	// 재활용이 안되므로 다시 객체 만듦
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
