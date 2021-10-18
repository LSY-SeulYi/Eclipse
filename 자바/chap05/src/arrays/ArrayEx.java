package arrays;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		// TODO 랜덤으로 50명의 과목 점수 합계와 평균 구해보기.
		
		int[] scores = new int[50];
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			scores[i] = getRndNum();
			sum += i;
		}

		System.out.println("랜덤 50명의 점수 :" + Arrays.toString(scores));
		System.out.println("랜덤 50명의 점수 합계 :" + sum(scores));
		System.out.println("랜덤 50명의 점수 평균 :" + getAvg(scores));
	}
	public static int getRndNum() {
		return (int)(Math.random()*51);
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int x:arr) {
			sum += x;
		}
		return sum;	
	}
	public static double getAvg(int[] arr) {
		int getAvg = 0;
		return sum(arr)/(double)arr.length;
	}
}
