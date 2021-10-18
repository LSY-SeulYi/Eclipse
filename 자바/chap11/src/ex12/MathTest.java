package ex12;

import javax.swing.JOptionPane;

public class MathTest {

	public static void main(String[] args) {
		double someNum = 3.141592;
		System.out.println(Math.ceil(someNum));// 4
		System.out.println(Math.floor(someNum));// 3
		System.out.println(Math.round(someNum));// 3
		System.out.println(Math.round(someNum));// 3
		System.out.println(Math.E);
		System.out.println(Math.PI);
//----------------- 조심 
		someNum = -someNum;
		System.out.println(Math.ceil(someNum));// -3
		System.out.println(Math.floor(someNum));// -4

// 사용자가 만든 반올림 메소드 
		System.out.println(myRound(someNum, 4));

// 임의의 숫자 입력 받기 
		String[] numStr = (JOptionPane.showInputDialog("숫자나열 ','로 ")).split(",");
		double[] nums = new double[numStr.length];
		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Double.parseDouble(numStr[i]);
		}
		System.out.println("최대값:" + myMax(nums));
	}

// 배열로 받은 수 중 최대값을 반환시켜 주는 나만의 메소드 
	public static double myMax(double[] arr) {
		double res = 0;
		for (double x : arr) {
			res = Math.max(res, x);
		}
		return res;
	}

// 반올림한 결과 소숫점 pos위치까지 나타내게하는 메소드의 설계 
	public static double myRound(double a, double pos) {
		double mul = Math.pow(10.0, pos);
		double res = Math.round(a * mul) / mul;
		return res;
	}

}
