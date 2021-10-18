package ex02;

public class CloneTest {

	public static void main(String[] args) {
//		public String id;
//		public String name;
//		public String pwd;
//		public int age;
//		public boolean isAdult;
		// 복제했지만 틀린 객체로서 문제 없다.
		MyMember original = new MyMember("bluesky","김청천","1234",27);
		MyMember cloned = original.getMyMember();
		cloned.pwd = "6789";
//		
		System.out.println(original);
		System.out.println(cloned);
	//=============그러나 참조형 자료가 포함되어 있을때 deep clone을 고려해야함======================
		Student ori = new Student("윤선도",45,new int []{45,78,90});
		Student clo = ori.getStudent();
		clo.scores = new int []{90,90,90};
		System.out.println(ori);
		System.out.println(clo);
		}
}
