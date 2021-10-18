package ex10_vo;
// VO => Value Object(주로 데이터베이스로 값을 전달하거나, 데이터베이스에서 받은 정보를 적절한 객체로 표현하는 클래스를 VO클래스라고 함.)
// DTO => 데이터의 소수신을 위해 만드는 객체로 VO와 혼용되고 있다.
// 예:엑셀에 데이터가 있는 경우 그 안에 있는 무수한 데이터를 각각 보내는게 아니라 통으로 하나의 객체로 보낼수 있게 하는것을 VO라 함.
// 게시판 기본으로 쓰는 클래스
public class MyMember {
	
	// 사용할 필드를 정의 (데이터베이스 컬럼에 해당)
	private String name;
	private int age;
	private String addr;
	private String phone;
	private String pwd;
	
	// 생성 메소드(최소 2가지 만들어야 함 - 기본, 일반생성자)
	public MyMember() {	// 기본생성자
		super();
	}
	public MyMember(String name, int age, String addr, String phone, String pwd) {	// 일반생성자
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {	// 패스워드 자리수 제한하는 방법
		// 비즈니스로직(유효성판단)
		if(pwd.length()>8) {
			System.out.println("암호가 너무 길어요.");
			return;
		}
		this.pwd = pwd;
	}
	@Override	// 어노테이션
	public String toString() {	// 내가 표현(보여주고싶은)하고 싶은 것을 toString을 사용
		return "MyMember [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	
}
