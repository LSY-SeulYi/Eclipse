package arrays;

public class ArrayInArray2 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{56,78,90,88},
				{73,78,89,90},
				{67,89,90,100},
				{56,78,67,89},
				{78,78,78,98},
		};
		System.out.println("총점 :"+ getTotal(scores));
		System.out.println("평균 :"+ getAvg(scores));
	}
	public static int getTotal(int[][] arr) {	// int는 반환타입, int[][] arr는 파라미터 타입
		int total = 0;
		for(int[] x:arr) {
			for(int value:x) {
				total += value;
			}
		}
		return total;
	}
	public static double getAvg(int[][] arr) {
		int cnt = 0;
		int total = 0;
		for(int[] x:arr) {
			for(int value:x) {
				cnt++;
				total += value;
			}
		}
		return (double)total/cnt;
	}
}
