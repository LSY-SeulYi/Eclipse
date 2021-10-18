package strram17_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestDistinct {

	public static void main(String[] args) {
		
		new TestDistinct().test();
	}
	public void test() {
		List<String> words = Arrays.asList(
				"강나루","밀밭길","구름","달","나그네","윤사월","문설주","별","구름","아해");
	
		Stream<String> stream = words.stream().distinct();
		System.out.println(stream);
		stream.forEach(a->System.out.print(a));	// distinct로 중복된것을 삭제하고 출력 됨	
	}
}
