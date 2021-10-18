package ex01;
// 로칼클래스에서 특정변수의 사용 제한
// 자바 1.8버전 이전/이후 많이 달라짐
public class LocalClassNFinal {

	public void someMethod(final int age) {	// 1.8버전 이후는 final 안붙여도 final이 붙은거나 마찬가지로 로컬클래스에서 동작된다.
		class LC {
			public void dispInfo() {
//				age += 1;
//				age++;
//				age = age+1;
				System.out.println("당신은 1년후 "+(age+1)+"세 입니다.");
			}
		}
	}
	
}
