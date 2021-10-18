package ex14;

import java.util.Calendar;

public class MyCalendar {
	// 달력만들기 
	// 달력생성의 원리  - 그달의 첫날짜의 요일과 마지막 일자를 알면된다. 
	// Calendar cal1 = Calendar.getInstance();
	// cal1.set(Calendar.YEAR,2021);

	public static void main(String[] args) {

		Calendar MyCalendar = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		int year = MyCalendar.get(Calendar.YEAR);
		int month = MyCalendar.get(Calendar.MONTH)+1;
		int week = 0;
		int day = 0;

		cal1.set(Calendar.YEAR, year);
		cal1.set(Calendar.MONTH, month - 1);
		cal1.set(Calendar.DAY_OF_MONTH, 1);

		cal2.set(Calendar.YEAR, year);
		cal2.set(Calendar.MONTH, month);
		cal2.set(Calendar.DAY_OF_MONTH, 1);
		cal2.add(Calendar.DATE, -1);

		week = cal1.get(Calendar.DAY_OF_WEEK);
		day = cal2.get(Calendar.DATE);
		
		System.out.println("------------------------------------------------------");
		System.out.println(year + "년 " + month + "월 달력\n" + "일\t월\t화\t수\t목\t금\t토");
		System.out.println("======================================================");
		
		for (int i=1;i<week;i++) {
			System.out.print("\t");
		}
		int cnt=week-1;
		for (int i=1;i<=day;i++) {
			System.out.print(i+ "\t");
			cnt++;
			if (cnt == 7) {
				cnt = 0;
				System.out.println("\n");
			}
		}
		System.out.println();
		System.out.println("======================================================");
	}
}