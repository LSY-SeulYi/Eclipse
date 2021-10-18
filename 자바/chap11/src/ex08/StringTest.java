package ex08;

public class StringTest {

	public static void main(String[] args) {
		
		String ssn = "540405-1233789";
		char genderCode = ssn.charAt(7);
		switch(genderCode) {
		case '1': case '3': case '9':
			System.out.println("남자입니다.");
			break;
		case '2': case '4': case '0':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("성 식별 불가!");
		}
		
	}
}
