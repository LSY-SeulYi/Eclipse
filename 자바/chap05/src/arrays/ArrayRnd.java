package arrays;

import java.util.Arrays;

public class ArrayRnd {
	
	public static void main(String[] args) {
		// TODO  
		int[] scores = new int[100]; // 기본 0으로 100개 세팅
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			scores[i] = getRndNum();
		sum += i;
		}
		System.out.println(Arrays.toString(scores));	// Arrays가 제공하는 toString 메소드를 지정해서 scores를 출력함
		System.out.println("총합 : " + sum);
		System.out.println("총합2 : " + getTotal(scores));
		System.out.println("평균 : " + sum/(double)scores.length);
		System.out.println("평균2 : " + getAvg(scores));
	}
	
	// 100개의 랜덤한 숫자 메소드 생성
	public static int getRndNum() {
		return (int)(Math.random()*101);	// 0~100 사이의 정수가 랜덤으로 만들어짐
	}
	public static int getTotal(int[] arr) { // 랜덤으로 만들어진 100개의 정수 의 합
		int sum = 0;
		for(int x:arr) {
			sum += x;
		}
		return sum;
	}
	public static double getAvg(int[] arr) {	// 100개 정수의 합의 평균
		return getTotal(arr)/(double)arr.length;
	}

}
