package stream15_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierExample {
	// 사용되는 람다 시그너쳐(함수 디스크립터)
	// () -> T   // 아무것도 입력받지 않지만 T타입의 객체를 리턴 시킨다.
	
	// Supplier 원형
		/*
		 * @FunctionalInterface
		 * public interface Supplier<T>{
		 * 		T get();
		 * }
		 */

	public static void main(String[] args) {
		// 간단한 예
		Supplier<MyMember> s = ()->new MyMember("지길용",45);
		System.out.println(s.get());
		
		// 복잡한 예 
		// 5개임의 로또번호를 생성시킨다. 
		Supplier<TreeSet<Integer>> ts;
		for(int i=0;i<10;i++){
			ts = ()->{
				TreeSet<Integer> lotto = new TreeSet<>();
				while(lotto.size()<6){	// 사이즈가 6까지만 while문이 돌아감
					lotto.add((int)(Math.random()*45)+1);
				}
				return  lotto; 
			};
			System.out.println(ts.get());
		}
	}
	
	
	
	
	
	
	static class MyMember {
		private String name;
		private int age;

		public MyMember(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "MyMember [name=" + name + ", age=" + age + "]";
		}
		
	}
}
