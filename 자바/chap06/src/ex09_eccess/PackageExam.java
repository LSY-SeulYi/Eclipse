package ex09_eccess;

import ex09_eccess.a.Mycom;

public class PackageExam {

	public static void main(String[] args) {
		Mycom mycom = new Mycom();
		System.out.println(mycom.model);
		ex09_eccess.b.Mycom mycom2 = new ex09_eccess.b.Mycom();
		System.out.println(mycom2.model);
	}
}
