package test;

public class Test4_1 extends Test4{

	public static void main(String[] args) {
		Test4_1 a = new Test4_1();
			
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
				sum += i;
			}
			System.out.println(i);
		}
	}
}