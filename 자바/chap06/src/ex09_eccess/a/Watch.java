package ex09_eccess.a;

import java.sql.Date;

public class Watch {
	// 접근 제한자 default : 같은 패키지 내에서만 접근 가능
	String model = "Logadis";
	public int size = 2;
	public static Date today1;
	
	static {
		today1 = new Date(System.currentTimeMillis());
	}
	private static Date today;
	
	static {
		today = new Date(System.currentTimeMillis());
	}
	// private static Date today; => 밖에서 억지로 열수 있게 하는 코딩
	public Date getDay() {
		return today;
	}

	
	
}
