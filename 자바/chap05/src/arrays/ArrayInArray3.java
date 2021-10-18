package arrays;

import java.util.Arrays;

public class ArrayInArray3 {

	public static void main(String[] args) {
		String[] stds = {"강감찬", "정기룡", "유관순", "김좌진","박목월"};
		int[][] scores = {
				{78,89,90},
				{88,99,54},
				{78,76,90},
				{56,78,90,80},
				{67,89,90}
		};
		scoreList(stds,scores);
	}
	public static void scoreList(String[] stds, int[][] scores) {// return 문장 안쓸때 void 넣어줌
		for(int i=0;i<stds.length;i++) {
			System.out.print(stds[i]+"\t");
			for(int score:scores[i]) {
				System.out.print(score+"\t");
			}
			System.out.println();
		}
		
		//for(String name:stds) {
		//	System.out.println(name+"\t");
		//	for(int[] score:scores) {
		//		System.out.println(Arrays.toString(score));
		//					}	
		//}
	}
}
