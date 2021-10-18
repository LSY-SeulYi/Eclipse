package ex15;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		
		// DecimalFormat => 화면에 나타나는 값의 표현 변경
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("00000000000.00000");
		System.out.println(df.format(num));
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(0.1));
	}
}
