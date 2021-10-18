package ex08;

public class StringSplit {

	public static void main(String[] args) {
		
		// 스페이스로 단어 쪼개기
		String someText = "홍길동은 매우 좋은 사람이다. 의적이다.";
		String[] words = someText.split(" ");	// 스페이스로 쪼개짐.
		for(String x:words) {
			System.out.println(x);
		}
		// ,(콤마)로 단어 쪼개기
		String someText2 = "김연수,홍진영,배호,유관순,조미미,이장호";
		String[] words2 = someText2.split(",");	// ,로 쪼개짐.
		for(String x:words2) {
			System.out.println(x);
		}
		// 여러 문자 들어있을때 그거 제거해서 단어 쪼개기
		String someText3 = "김연수@홍진영#배호&유관순-조미미,이장호$이순신";
		someText3.replace("$", "-");	// 다른글자로 대체해주기 (전처리작업)
		String[] words3 = someText3.split("@|#|&|-|,|^");
		for(String x:words3) {
			System.out.println(x);
		}
	}
}
