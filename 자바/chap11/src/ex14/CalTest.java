package ex14;

import java.util.Calendar;

public class CalTest {

	public static void main(String[] args) {
		
		Calendar CalTest = Calendar.getInstance();	// 오늘
		Calendar cal1 = Calendar.getInstance();	// 첫날
		Calendar cal2 = Calendar.getInstance();	// 막날
		
		int year = CalTest.get(Calendar.YEAR);
		int month = CalTest.get(Calendar.MONTH)+1;
		int week = 0;
		int day = 0;
		
		cal1.set(Calendar.YEAR, year);
		cal1.set(Calendar.MONTH, month -1);
		cal1.set(Calendar.DAY_OF_MONTH, 1);
		
		cal2.set(Calendar.YEAR, year);
		cal2.set(Calendar.MONTH, month);
		cal2.set(Calendar.DAY_OF_MONTH, 1);
		cal2.add(Calendar.DATE, -1);
		
		week = cal1.get(Calendar.DAY_OF_WEEK);
		day = cal2.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 달력\n" + "일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		int cnt = week-1;
		for(int i=1;i<=day;i++) {
			System.out.print(i+"\t");
			cnt++;			
		if (cnt == 7) {
			cnt = 0;
				System.out.println("\n");
			}
		}
		System.out.println();
	}

}