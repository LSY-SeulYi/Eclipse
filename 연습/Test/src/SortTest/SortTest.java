package SortTest;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		
		Student[] students = new Student[] {
			
			new Student ("김일등",27,99,87,79,0,0),
			new Student ("이삼들",1,69,87,89,0,0),
			new Student ("김등",3,87,96,79,0,0),
			new Student ("오사등",6,89,89,87,0,0),
			new Student ("가로등",9,99,76,79,0,0),
			new Student ("박일등",15,100,100,79,0,0)

		};
		Arrays.sort(students, new SortByName());
		for(Student x:students) {
			System.out.println(x);
		}
		System.out.println("=======================================================================");
		Arrays.sort(students, new SortByNo());
		for(Student x:students) {
			System.out.println(x);
		}
		System.out.println("=======================================================================");
		Arrays.sort(students, new SortByTotal());
		for(Student x:students) {
			System.out.println(x);
		}
		System.out.println("=======================================================================");
	}
}
