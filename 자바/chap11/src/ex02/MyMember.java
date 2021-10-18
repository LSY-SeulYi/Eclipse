package ex02;
// 클론을 만들 수 있는 클래스
public class MyMember implements Cloneable {

	public String id;
	public String name;
	public String pwd;
	public int age;
	public boolean isAdult;
	public MyMember(String id,String name,String pwd,int age) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.isAdult = (age>18)?true:false;
		
	}
	@Override
	public String toString() {
		return "MyMember [id=" + id + ", name=" + name + ", pwd=" + pwd + ", age=" + age + ", isAdult=" + isAdult + "]";
	}
	public MyMember getMyMember() {
		MyMember cloned = null;
		try {
			cloned = (MyMember)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
}
