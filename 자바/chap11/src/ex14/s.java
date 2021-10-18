package ex14;

import java.util.Calendar;

public class s {
// 달력만들기 
// 달력생성의 원리  - 그달의 첫날짜의 요일과 마지막 일자를 알면된다. 
// Calendar cal1 = Calendar.getInstance();
// cal1.set(Calendar.YEAR,2021);

	public static void main(String[] args) {
		new s().dispCalendar(2021, 6);
	}

	public void dispCalendar(int year, int month) {
		Calendar cal1 = Calendar.getInstance();// 1일
		cal1.set(year, month -1, 1);
		cal1.set(Calendar.YEAR, year);
		cal1.set(Calendar.MONTH, month - 1);
		cal1.set(Calendar.DAY_OF_MONTH, 1);

		Calendar cal2 = Calendar.getInstance();// 마지막일자
		cal2.set(Calendar.YEAR, year);
		cal2.set(Calendar.MONTH, month);
		cal2.set(Calendar.DAY_OF_MONTH, 1);
		cal2.add(Calendar.DATE, -1);

		dispDate(cal1);
		dispDate(cal2);

		System.out.println("이달의 마지막 날짜는 " + cal2.get(Calendar.DAY_OF_MONTH) + "입니다.");
	}

	public void dispDate(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String yoil = "";
		switch (week) {
		case 1: // case Calendar.SUNDAY:
			yoil = "일요일";
			break;
		case 2: // case Calendar.MONDAY:
			yoil = "월요일";
			break;
		case 3: // case Calendar.TUESDAY:
			yoil = "화요일";
			break;
		case 4: // case Calendar.WEDNESDAY:
			yoil = "수요일";
			break;
		case 5: // case Calendar.THURSDAY:
			yoil = "목요일";
			break;
		case 6:// case Calendar.FRIDAY:
			yoil = "금요일";
			break;
		case 7: // case Calendar.STURDAY:
			yoil = "토요일";
			break;

		}
		System.out.print(year + "-" + month + "-" + day);
		System.out.println("\t" + yoil);
	}

}