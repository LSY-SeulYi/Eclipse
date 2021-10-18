package com.vision.javastudy;

public class ByteExeample {
	
	public static void main(String[] args) {
		byte var1 = -128;
		System.out.println(var1);
		var1 = (byte)128;		// 오버플로우 생김
		System.out.println(var1);
		// 낱자를 저장할 수 있는 타입
		char var2 = '가';
		char var3 = 'A';
		char var4 = '韓';
		char var5 = '★';
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var1+var2+var3+var4+var5);	// 앞에 문자열표시 "" 안넣으면 그냥 숫자로 프린트 됨.
		System.out.println("문자열로 나오게 하려면 : "+var1+var2+var3+var4+var5);
		// 응용
		// '가'의 코드값이 알고 싶을 때
		System.out.println(var2+0);	// '가'의 코드값은 44032
		// '힣'의 코드값을 알아보자
		System.out.println('힣'+0);	// '힣'의 코드값은 55203
		// 한글 코드값의 개수는?
		System.out.println(('힣'+0)-(var2+0)+1);		// 한글에 할당된 코드값은 총 11,172개가 됨.
		
		for(int i=44032;i<=55203;i++) {		// int타입의 44032~55203은 한글 가~힣까지임. char로 바꿨을때한글로 바뀐거임
			System.out.println((char)i);	// int타입을 char타입으로 바꿔서 프린트 되게함.
		}
	}
}
