package stream12_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePrinciple {
	// Predicate => 긴가민가
	// java.util.function.Predicate<T>는 functional 인터페이스(추상메소드 한개 있는것)로
	// boolean test(T t); 라는 추상메소드를 가지고 있다. 
	// 이 메소드를 람다방식에서 이용할 수 있는데, 그 결과를 true나 false가 오게 구현해서 사용하면 된다.
	// 람다 시그너쳐(함수 디스크립터)는 T -> boolean 이다.
	
	public static void main(String[] args) {
		// TODO 사용예 
		//str이라는 스트링을 test메소드의 매개변수로 보내고
		// !str.isEmpty()를 수행한 결과를 리턴시켜주는 객체로 
		// nonEmpty를 만들었다.
		Predicate<String> nonEmpty = str->!str.isEmpty(); 
		List<String> listOfString = Arrays.asList(
				"청산리","","벽개수야","","수이감을","자랑마라"
		);
		System.out.println("원래자료: "+listOfString);
		System.out.println("필터링후: "+filter(listOfString,nonEmpty));
		//System.out.println("필터링후: "+filter(listOfString,str->!str.isEmpty()));-> 이렇게 해도 됨
		//--------------------------------------------- 
		Predicate<String> isLagerWord = str->str.length()>=4;
		System.out.println("4자이상인 단어: "+filter(listOfString,isLagerWord));
		
		
		
	}
	/**
	 * 
	 * @param list 필터링 대상이 되는 자료구조
	 * @param p 사용할 프리디케이트 객체(긴가민가)
	 * @return 필터후 리스트를 리턴 
	 */
	public static <T> List<T> filter(List<T> list,Predicate<T> p){	// 메소드 호출할때만 쓸수 있는 제레릭 타입 T
		List<T> res = new ArrayList<>();
		for(T s:list){
			if(p.test(s)){
				res.add(s);
			}
		}
		return res;
	}

}
