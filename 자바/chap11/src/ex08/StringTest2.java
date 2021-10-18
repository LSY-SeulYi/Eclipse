package ex08;

import java.sql.Date;

public class StringTest2 {

	public static void main(String[] args) {
		
		String ssn = "540405-1233789";
		int BYear = Integer.parseInt(ssn.substring(0, 2));
		int BMonth = Integer.parseInt(ssn.substring(2, 4));
		int BDay = Integer.parseInt(ssn.substring(4, 6));
		
		Date birthday = new Date(BYear,(BMonth-1),BDay);
		System.out.println(birthday);
		
		
	}
}
