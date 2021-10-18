package l04_람다표현식의파라미터;
import java.util.function.IntConsumer;
public class TestLambda02 {
	public static void main(String[] args) {
		repeat(10,i->System.out.println("CountDown: "+(9-i)));
		
	}
	public static void repeat(int n, IntConsumer action) {
		try {
			for (int i = 0; i < n; i++)
				action.accept(i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
}
