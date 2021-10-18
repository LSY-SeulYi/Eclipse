package chap04;

public class CharOpEx {

	public static void main(String[] args) {
		// TODO 문자 연산
		// a에서 z까지 출력
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
		//
		char cvar1 = 'a';
		System.out.println(cvar1+5);		// 아스키 값으로 계산됨 (a=97 + 5 = 102)
		// Z 에서 A 까지 출력
		for(char i='Z';i>='A';i--) {
			System.out.println("\t"+i+"\t");
		}
		System.out.println(); // 줄만 바꾸기
	}

}
