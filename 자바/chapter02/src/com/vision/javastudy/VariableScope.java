package com.vision.javastudy;
	// 변수의 영역
public class VariableScope {
	int outVar;	// 멤버필드(인스턴스필드) = 전역변수 (이 클래스 내 어디서든 쓸수 있음) = 전역변수는 초기값을 안줘도 기본으로 0이 들어가 있음
				// 객체를 만들어야 쓸수 있음.
				// int 앞에 static 넣어주면 프린트 됨.
	static int outVar1;
	public static void main (String[] args) {
		System.out.println("outVar1 : "+outVar1);	// static 쓰면 바로 프린트됨.
		System.out.println("outVar : "+new VariableScope().outVar);		// static 안쓰고 프린트할때 뉴 입력해서 쓰면 프린트 됨.
		int var1;		// 메인 메소드 전역에서 활동
		if(true) {
			int var2;		// 이 if문 내에서만 활동
			var1 = 10;
			var2 = 20;
			System.out.println("var1 : "+var1);
			System.out.println("var2 : "+var2);
		}
		System.out.println("var1 : "+var1);
		// System.out.println("var2 : "+var2);	// if 안에서만 사용해야 하는 var2라서 프린트 안됨.
		
		for(int i=0;i<1;i++) {		// i의 영역 : 이 for문 내에서만 활동
			int var3 = 30;
			var1 = 100;
			int var2 = 200;
			System.out.println("var3 : "+var3);
			System.out.println("var1 : "+var1);
			System.out.println("var2 : "+var2);
		}
		// System.out.println("var3 : "+var3);	// for 안에서만 사용해야 하는 var3라서 프린트 안됨.
		System.out.println("var1 : "+var1);
		// System.out.println("var2 : "+var2);	// for와 if 안에서만 사용해야 하는 var라서 프린트 안됨.
	}

}
