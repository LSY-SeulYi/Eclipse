package l04_람다표현식의파라미터;
import java.util.Arrays;
// 람다표현식의 파라미터
public class TestLambda01 {
	public TestLambda01() {
		String[] names = new String[] { "zadsadasdasd", "asadsa", "mf23dsdfs",
				"kdsd", "arilangarilangaraliyo" };
		// 글자수로 오름 차순 정렬
		Arrays.sort(names,
				(o1, o2) -> Integer.compare(o1.length(), o2.length()));
		System.out.println(Arrays.toString(names));
	}
	public static void main(String[] args) {
		new TestLambda01();
	}
}
