package chap04;

public class CompareOpEx {

	public static void main(String[] args) {
		// TODO 비교 연산자 ~ 연산 결과는 boolean 타입임
		// 연산 결과 대입하려면 boolean type 으로 선언해야 함.
		boolean res = 10>20;
		System.out.println(res);
		// 즐겨 사용하는 장소 (결과는 true 아니면 false)
		// if(이자리), else if(이자리), for(;(이자리);), while(이자리), (이자리)?x:y, do while(이자리)
		// 논리 연산 사용하는 장소도 마찬가지
		
		double pia = 3.14d;	// d 생략가능 (3.14 뒤 소수점자리가 64비트)
		float pib = 3.14f;	// f 생략불가능 (3.14 뒤 소수점자리가 32비트)
		res = pia == pib;
		System.out.println(res);	// 같은 3.14라고 해도 타입이 달라서 false가 나옴
		
		long lv1 = 10L;
		int iv1 = 10;
		res = lv1 == iv1;
		System.out.println(res);	// long과 int 타입에서는 같은 정수로 계산이 들어가기 때문에 타입이 달라도 true가 나옴
		
		// 문자열 비교
		res = "성주원" == "성주원";
		System.out.println("문자열 비교 결과 :"+res);
		String name1 = new String("홍길동");
		String name2 = "홍길동";
		res = name1 == name2;
		System.out.println("문자열 비교 결과 :"+res);
		System.out.println("문자열 비교 결과 :"+name1==name2);
		// 객체를 비교할 때에는 그 객체가 가지는 값을 비교할 건지, 저장 장소(공간,레퍼런스값)를 비교할 건지 먼저 결정해야함.
		System.out.println("문자열 비교 결과3 :"+name1.equals(name2)); // 저장 공간이 다를 때 값이 같은지 비교하고 싶으면.
		// 숫자 동등 비쇼는 == 를 사용
		// 객체를 비교 할 때에는 주로 .equals() 메소드를 사용
	}

}
