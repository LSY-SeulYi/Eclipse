package test;

public class Test1 {

	public String name;
	public int age;
	public String addr;
	public String phone;
	public String pwd;
	public int math;
	public int eng;
	public int kor;
	public double sum;
	public double avg;
	
	public Test1() {}
	public Test1(String name,int age,String addr,String phone,String pwd,int math,int eng,int kor,double sum,double avg) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		this.pwd = pwd;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
		this.sum = this.math+this.eng+this.kor;
		this.avg = this.sum/3.0;
		
	}
	@Override
	public String toString() {
		return "Test1 [name=" + name + ", age=" + age + ", addr=" + addr + ", phone=" + phone + ", pwd=" + pwd
				+ ", math=" + math + ", eng=" + eng + ", kor=" + kor + ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	
}
