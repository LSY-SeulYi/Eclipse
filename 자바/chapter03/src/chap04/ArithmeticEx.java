package chap04;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO 자바 산술 연산시 주의 사항
		int v1 = 7;
		int v2 = 2;
		System.out.println(v1/v2);		// 기대는 3.5나 실제는 3나옴
		double v3 = 7d;		// 더블타입은 d를 생략해도 더블로 간주함.
		double v4 = 2d;
		System.out.println(v3/v4);
		double v5 = 17;
		double v6 = 12;
		System.out.println(v5/v6);
		long v7 = 7L;		// 롱타입은 L을 생략할 경우 int로 인식하기 때문에 꼭 넣어줘야 함.
		long v8 = 2L;
		System.out.println(v7/v8);		// 값이 이상하게 나옴
		// 해결방법 ~ 둘 중 하나를 캐스팅연산(강제 형 변환)
		System.out.println((double)v7/v8);

	}

}
