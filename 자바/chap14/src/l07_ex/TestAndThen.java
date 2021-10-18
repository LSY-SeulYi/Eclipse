package l07_ex;

import java.util.function.Consumer;
import java.util.function.Function;
import l07_ex.Address;
import l07_ex.MyMember;

//자바8부터 인터페이스에 디폴트 및 정적메소드를 포함시킬수 있다.
//그래서 제공되는 표준 FunctionalInterface 중 
//Consumer,Function,Operator 는 andThen() 메소드도 가지고 있고
//Function 과 Operator 타입중 DoubleUnaryOperator,IntUnaryOperator,LongUnaryOperator는 (Unary = 한개)
//compose() 메소드도 가지고 있다.
//이들은 모두 함수적 인터페이스를 수행시켜 처리 결과를 다음 으로 순차적으로 연결하는 기능을 가지고 있다.
//이둘의 차이점은 어떤 함수적 인터페이스부터 먼저 처리하는냐이다. 
public class TestAndThen {

	public static void main(String[] args) {
	//----------------Consumer의 순차연결
//	Consumer<MyMember> consumerA = (m)->{
//		System.out.println("Consumer A : "+m.getId()+"/"+m.getName());
//	};
//	consumerA.accept(
//			new MyMember(
//					"SJW","성주원","1234",
//					MyMember.Gender.MALE,
//					MyMember.City.Deajun,
//					new Address("중구 태평동","파라곤아파트")
//			)
//	);
//	
//	//----------------
//	Consumer<MyMember> consumerB = (m)->{
//		System.out.println("Consumer B : "+m.getCity()+" "+m.getAddress());
//	};
//	consumerB.accept(
//			new MyMember(
//					"HGD","홍길동","1234",
//					MyMember.Gender.MALE,
//					MyMember.City.Deagu,
//					new Address("수성구 달구벌대로 2450","(범어동)")
//			)
//	);
//	
//	
//	
//	//---------------두개를 연결
//	Consumer<MyMember> consumerAB = consumerA.andThen(consumerB); (andThen = default메소드)
//	consumerAB.accept(
//			new MyMember(
//					"SJW","성주원","1234",
//					MyMember.Gender.MALE,
//					MyMember.City.Deajun,
//					new Address("중구 태평동","파라곤아파트")
//			)
//	);
//	
////	---------------Function의 순차연결 
////	 여기서 Address는 두 함수적인터페이스의 전달데이터 이다.
//	Function<MyMember,Address> functionA = (m) ->{
//		return m.getAddress();
//	};
//
//	Function<Address,String> functionB = (m) ->{
//		return m.getAdd()+m.getRemain();
//		return  m.toString();
//	};
//	
//	// compose() 와 andThen은 결합순서만 다르다.
//	Function<MyMember,String> functionAB = functionB.compose(functionA);
////	Function<MyMember,String> functionAB = functionA.andThen(functionB);
//	
//	String city = functionAB.apply(
//			new MyMember(
//					"SJW","성주원","1234",
//					MyMember.Gender.MALE,
//					MyMember.City.Deajun,
//					new Address("중구 태평동","파라곤아파트")
//			)
//	);
//	System.out.println("주거지:"+city);
	}
}
