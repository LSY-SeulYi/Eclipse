package test;

public class Test6 {

	public static String name;
	public static int[] scores;
	public static int sum;
	public static double avg;
	
	public Test6() {}
	public Test6(String name,int[] scores,int sum,double avg) {
		this.name = name;
		this.scores = scores;
		this.sum = sum;
		this.avg = sum/5;
		for(int x:scores) {
			x += sum;
		}
	}
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Test6.name = name;
	}
	public static int[] getScores() {
		return scores;
	}
	public static void setScores(int[] scores) {
		Test6.scores = scores;
	}
	public static int getSum() {
		return sum;
	}
	public static void setSum(int sum) {
		Test6.sum = sum;
	}
	public static double getAvg() {
		return avg;
	}
	public static void setAvg(double avg) {
		Test6.avg = avg;
	}
	
	public static void main(String[] args) {
	
		Test6 a = new Test6 ("홍길동",new int[] {99,85,79,96,87},0,0);
		System.out.println(a);

		
		
	}
}
