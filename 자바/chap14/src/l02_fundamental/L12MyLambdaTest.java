package l02_fundamental;

import java.util.Arrays;
import java.util.List;

public class L12MyLambdaTest {

	public static void main(String[] args) {
		List<Object> list = Arrays.asList(1, 3, 2, 4, 7);
		list.forEach(n -> System.out.println(n));
		list.forEach((Object n) -> System.out.println(n));
		//위 람다식을 더블콜론 연산자를 이용하여 바꾸면 아래와 같다.
		list.forEach(System.out::println);

		class Score{
			int x,y;
			public Score(int x,int y){
				this.x = x;this.y=y;
			}
			public String toString(){
				return "국어:"+x+" 영어:"+y;
			}
		}
		List<Score> list2 = 
				 Arrays.asList(new Score(45,56),new Score(12,34),new Score(56,45));
		list2.forEach(s->System.out.println(s));
		list2.forEach((Score s)->System.out.println(s));
		list2.forEach(System.out::println);

	}

}
