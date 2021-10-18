package quiz;

public class Ex1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z =(++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		// 학생한명이가지는 연필수
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		// 남은 연필수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		int valu = 356;
		System.out.println(valu/100*100);
	}
}
