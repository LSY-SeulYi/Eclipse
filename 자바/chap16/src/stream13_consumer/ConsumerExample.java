package stream13_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	// Consumer 원형
	/*
	 * @FunctionalInterface
	 * public interface Consumer<T>{
	 * 		void accept(T t);
	 * }
	 */
	public static void main(String[] args) {
		// 사용한 예 1
		myForEach(Arrays.asList(1,2,3,4,5),i->System.out.print(i));
		// 사용한 예 2
		System.out.println();
		
		myForEach(Arrays.asList(1,2,3,4,5,6,7,8,9),i->{System.out.println(9+"*"+i+" = "+(9*i));
		});
	}
	public static <T> void myForEach(List<T> list,Consumer<T> c){	//  제네릭메소드를 위한 <T> 사용
		for(T x:list){
			c.accept(x);// 리턴값이 없고 소비만 하는 메소드 
		}
	}
}
