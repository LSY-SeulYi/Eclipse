package l02_fundamental;
// 함수적 스타일의 람다식을 작성하는 방법
// 기준작성방식 1
// (int a)->{System.out.println(a);};
// 매개변수 타입은 런타임시 대입값에 따라 자동인식하기 때문에 생략가능  2
// (a)->{System.out.println(a);};
// 하나의 매개변수만 있을 경우는 괄호() 생략가능 3
// a->{System.out.println(a);};
// 하나의 실행문만 있다면 중괄호 {} 생략가능 4
// a -> System.out.println(a);
// 매개변수가 없다면 괄호()는 생략할 수 없음  5
// ()->{실행문;....};
// 리턴값이 있는 경우 return문을 사용 6
// (x,y)->{return x+y;}; 
// 중괄호 {}에 return문만 있을 경우, 중괄호를 생략가능 7
// (x,y) -> x+y;
public class L01LambdaHello {

	public static void main(String[] args) {
		// 위 1번예 기준작성방식
		// Foo는 람다식의 TargetType foo 타겟변수 '=' 뒷부분 람다식 이다.
		// 람다식은 익명의 이너클래스를 생성하여 객체화 시키는 부분이다.  
		
		class F implements Foo {	// 람다 사용 전
			@Override
			public void disp(int a) {
				System.out.println(a);
			}
		}
		new F().disp(365);
			

		Foo foo = (int a)->{	// 람다 사용 후
			System.out.println(a);
		};
		foo.disp(365);
		
		Foo22 foo01 = (a)->{	// 람다 사용 후
			System.out.println(a);
		};
		foo01.disp("문자123456789문자");
		
		// 위 2번예 매개변수 타입은 런타임시 대입값에 따라 자동인식하기 때문에 생략가능
		Foo foo2 = (a)->{System.out.println(a);};
		foo2.disp(3);
		
		// 위 3번예 하나의 매개변수만 있을 경우는 괄호() 생략가능
		Foo foo3 = a->{System.out.println(a);};
		
		foo2.disp(3);
		
		// 위 4번예 하나의 실행문만 있다면 중괄호 {} 생략가능
		Foo foo4 = a-> System.out.println(a);
		foo4.disp(3);
		
		// 위 5번예  매개변수가 없다면 괄호()는 생략할 수 없음
		Foo2 foo5 = ()-> {System.out.println("매개변수가 없어요");};
		foo5.disp();
		
		// 위 6번예 리턴값이 있는 경우 return문을 사용
		Foo3 foo6 = (a,b)->{return a+b;};
		System.out.println(foo6.disp(10,20));
		
		// 위 7번예 중괄호 {}에 return문만 있을 경우, 중괄호를 생략가능
		Foo3 foo7 = (a,b)-> a+b;
		System.out.println(foo7.disp(10,20));
		
		// 내부 메소드를 람다식으로 호출한 예 
		Foo3 foo8 = (a,b)->add(a,b);
		System.out.println(foo8.disp(10, 20));
		Foo3 foo9 = (a,b)->substract(a,b);
		System.out.println(foo9.disp(10, 20));
		Foo3 foo10 = (a,b)->multiply(a,b);
		System.out.println(foo10.disp(10, 20));
		
		// 즉 아래 두 람다 이용방식((1),(2))은 같은 내용이다.
		//----------------------------------------------(1)
		Foo4 foo11 = (a,b)->divide(a,b);
		System.out.println(foo11.disp(10, 20));
		//----------------------------------------------(2)
		Foo4 foo12 = (a,b)->{
			return a/b;
		};
		System.out.println(foo12.disp(10, 20));
		//----------------------------------------------
	}
	
	public static int add(int x,int y){
		//System.out.println("내부메소드 수행부분1:"+(x+y));
		return x+y;
	}
	public static int substract(int x,int y){
		//System.out.println("내부메소드 수행부분1:"+(x-y));
		return x-y;
	}
	public static int multiply(int x,int y){
		//System.out.println("내부메소드 수행부분1:"+(x*y));
		return x*y;
	}
	public static double divide(double x,double y){
		//System.out.println("내부메소드 수행부분1:"+(x/y));
		return x/y;
	}
	
	
}
// 함수적 인터페이스들 - 메소드가 오직 하나밖에 없는 인터페이스 
// @FunctionalInterface 는 메소드가 하나인지를 체크해준다.

@FunctionalInterface
interface Foo{
	public void disp(int a);
}

@FunctionalInterface
interface Foo22{
	public void disp(Object obj);
}

@FunctionalInterface
interface Foo2{
	public void disp();
}

@FunctionalInterface
interface Foo3{
	public int disp(int a,int b);
}

@FunctionalInterface
interface Foo4{
	public double disp(double a,double b);
}
