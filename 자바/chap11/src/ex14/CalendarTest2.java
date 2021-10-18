package ex14;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		// 오늘이 무슨 요일인지 알아내는 소스를 작성하세요.
		
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String wee = "";
		switch(week) {
		case 1:	
			wee = "일요일";
			break;
		case 2:
			wee = "월요일";
			break;
		case 3:
			wee = "화요일";
			break;
		case 4:
			wee = "수요일";
			break;
		case 5:
			wee = "목요일";
			break;
		case 6:
			wee = "금요일";
			break;
		case 7:
			wee = "토요일";
			break;
		}
		System.out.println("오늘 날짜는? :" + month +"월 " + day+"일");
		System.out.println("오늘의 요일은? :" + wee);

		
	}
}
//Calendar cal1 = Calendar.getInstance();
//cal1.set(Calendar.YEAR, 2021);
//cal1.set(Calendar.MONTH, 0);
//cal1.set(Calendar.DAY_OF_MONTH, 1);
//System.out.println(cal1);
//int yoil = cal1.get(Calendar.DAY_OF_WEEK);
//System.out.println(yoil);
//Calendar cal2 = Calendar.getInstance();
//cal2.set(Calendar.MONTH, 1);
//cal2.set(Calendar.DATE, -1);
//System.out.println(cal2);
//yoil = cal2.get(Calendar.DAY_OF_WEEK);
//System.out.println(yoil);
