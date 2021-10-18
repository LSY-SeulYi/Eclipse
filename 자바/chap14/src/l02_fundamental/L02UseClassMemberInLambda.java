package l02_fundamental;
// 람다식의 실행 블록()에서 클래스의 멤버(필드와 메소드) 및 로컬 변수를 사용할 수 있다.
// 클래스의 멤버는 제약사항 없이 사용가능하지만 로컬변수(람다식으로 쓰면 final로 성질이 바뀜)는 제약사항이 따른다.
public class L02UseClassMemberInLambda {

	public static void main(String[] args) {
		UsingClass x = new UsingClass();
		UsingClass.Inner inner = x.new Inner();
		inner.someMethod();
	}
}
@FunctionalInterface
interface MyInterface1{	// 함수적 인터페이스
	public void xxMethod();
}
class UsingClass{
	public int outField=10;// UsingClass.this.outField
	class Inner{
		int innerField = 20;// this.innerField
		void someMethod(){
			int local = 30;
			//---------------------------------------------------------------------------
			// local변수가 람다 내부에 사용되면 final 성격을 가지게 되어 아래와 같이 
			// 수정 불가함.
			// local = 40; 
			//---------------------------------------------------------------------------
			MyInterface1 mi = ()->{
				System.out.println("outField:"+UsingClass.this.outField);
				System.out.println("innerField:"+this.innerField);
				// local+=10; 요렇게는 못하나
				System.out.println("localField:"+(local+10));//요렇게는 할 수 있다.
			};
			// 람다식을 수행시킴
			mi.xxMethod();
		}
	}
}
