package ex12;

import javax.swing.JOptionPane;

public class MethTest {

	public static void main(String[] args) {

		double someNum = 3.142592;

		// ceil => 소수점 이하 자르고 올려줌
		System.out.println(Math.ceil(someNum));
		// floor => 소수점 이하 자름
		System.out.println(Math.floor(someNum));
		// round => 소수점없애줌
		System.out.println(Math.round(someNum));

		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println("-------------------------------------------------------------------");

		// 사용자가 만든 반올림 메소드
		someNum = -someNum;
		System.out.println(Math.ceil(someNum));
		System.out.println(Math.floor(someNum));

		//
		System.out.println(myRound(someNum, 4));

		// 배열로 받은 수 중 최대값 찾기
		String[] numStr = (JOptionPane.showInputDialog("숫자나열 ','로")).split(",");
		double[] nums = new double[numStr.length];
		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Double.parseDouble(numStr[i]);
		}
		System.out.println("최대값 : " + myMax(nums));

	//
		String[] numSt = (JOptionPane.showInputDialog("숫자 나열 ','로")).split(",");
		double[] num = new double[numSt.length];
		for (int i=0;i<numSt.length;i++) {
			num[i] = Double.parseDouble(numSt[i]);
		}
		System.out.println("최소값 : " + myMin(num));
	}


	public static double myMax(double[] arr) {
		double res = Double.MIN_VALUE;
		for (double x : arr) {
			res = Math.max(res, x);
		}
		return res;
	}
	public static double myMin(double[] arr) {
		double res = Double.MAX_VALUE;
		for (double x : arr) {
			res = Math.min(res, x);
		}
		return res;
	}

	// 반올림한 결과 소수점 pos 위치까지 나타내게 하는 메소드 설계
	public static double myRound(double a, double pos) {
		double mul = Math.pow(10.0, pos);
		double res = Math.round(a * mul) / mul;
		return res;
	}
}
