package ex04;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		
		Student[] students = new Student[] {
			
			new Student(45,"윤선도",78),
			new Student(4,"김일선",56),
			new Student(13,"김완선",67),
			new Student(5,"김시관",98),
			new Student(77,"성담수",89)
		};
		
		// 학번 정렬
		Arrays.sort(students);
		for(Student x:students) {
			System.out.println(x);
		}
		System.out.println("===============================================================");
		
		// 이름 정렬
		Arrays.sort(students, new SortByName());
		for(Student x:students) {
			System.out.println(x);
		}
		System.out.println("===============================================================");
		
		// 성적 정렬
		Arrays.sort(students, new SortByScore());
		for(Student x:students) {
			System.out.println(x);
		}
	}
}
