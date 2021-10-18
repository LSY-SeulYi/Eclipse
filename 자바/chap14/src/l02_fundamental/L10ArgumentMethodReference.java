package l02_fundamental;

import java.util.function.ToIntBiFunction;

// 매개변수의 메소드 참조 샘플
public class L10ArgumentMethodReference {

	public static void main(String[] args) {
		ToIntBiFunction<String,String> function,function2;
		
		function =(a,b)-> a.compareToIgnoreCase(b);
		int res = function.applyAsInt("java8", "JAVA8");
		if(res==0){
			System.out.println("대소문자 무시한 동일한 문자열입니다.");
		}else if(res<0){
			System.out.println("오름차순으로 먼저 오는 경우입니다.");
		}else{
			System.out.println("오름차순으로 나중 오는 경우입니다.");
		}
		
		function2 = String::compareToIgnoreCase;
		int res2 = function2.applyAsInt("java88", "java8");
		if(res2==0){
			System.out.println("대소문자 무시한 동일한 문자열입니다.");
		}else if(res2<0){
			System.out.println("오름차순으로 먼저 오는 경우입니다.");
		}else{
			System.out.println("오름차순으로 나중 오는 경우입니다.");
		}

	}

}
