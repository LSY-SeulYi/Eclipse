package ex08;

// StringBuilder => 문자열을 결합시켜서 새로운 문자열 생성하는 것.
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// java.lang 패키지의 클래스에 있으므로 임포트 시키지 않음.
		StringBuilder builder = new StringBuilder();
		
		builder.append("자바공부");
		builder.append("\n");
		builder.append("프로그램 공부");
		builder.append("AI활용 웹/앱 개발자 과정");
		System.out.println(builder.toString());
		System.out.println("----------------------------------------------------");
		//
		String xxx = "자바공부";
		xxx += "\n";
		xxx += "프로그램 공부";
		xxx += "AI활용 웹/앱 개발자 과정";
		System.out.println(xxx.toString());
		
		// 동기화 처리 되도록 구성
		// 동기화 <---> 비동기화
		// 동기화 : 멀티 threading 작업이 끝날때까지 대기하는 것
		StringBuffer buffer = new StringBuffer();
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
			buffer.append(j+"*"+i+"="+(j*i)+"\t");
			}
		buffer.append("\n");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>구구단<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(buffer.toString());
	}

}
