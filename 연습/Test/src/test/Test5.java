package test;

public class Test5 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		for(int i=1;i<=9;i++) {
			i += a;
			System.out.println(a+"*"+(i)+"="+(a*i++));
		}
	}
}
