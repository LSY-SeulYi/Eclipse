package ex07_singleton;

public class SingletonTest {

	public static void main(String[] args) {
		OnlyYou single= OnlyYou.getInstance();
		OnlyYou single2= OnlyYou.getInstance();
		System.out.println(single==single2);
	}
}
