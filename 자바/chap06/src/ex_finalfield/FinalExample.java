package ex_finalfield;

public class FinalExample {
	
	final String nation = "Korea";
	final String ssn;	// final 입력된 주민번호는 절대 고칠수 없음
	String name;
	
	public FinalExample(String ssn) {
		this.ssn = ssn;
	}
	public FinalExample(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}
	public static void main(String[] args) {
		// FinalExample ex = new FinalExample(); => 이러면 기본 생성자가 없기에 에러가 남.
		FinalExample ex = new FinalExample("050504-3812334");
		ex.name = "홍길동";
		ex.name = "홍길만";

	}
}
