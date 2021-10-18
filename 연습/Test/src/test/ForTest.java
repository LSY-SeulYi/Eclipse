package test;

import java.util.Calendar;

public class ForTest {

	public static void main(String[] args) {

		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j));
		
			}
			System.out.println();
			
		}
		
		Calendar ForTest = Calendar.getInstance();
		Calendar a = Calendar.getInstance();
		Calendar b = Calendar.getInstance();
		
		int year = ForTest.get(Calendar.YEAR);
		int month = ForTest.get(Calendar.MONTH)+1;

		a.set(Calendar.YEAR, year);
		a.set(Calendar.MONTH, month -1);
		a.set(Calendar.DAY_OF_MONTH, 1);
		
		b.set(Calendar.YEAR, year);
		b.set(Calendar.MONTH, month);
		b.set(Calendar.DAY_OF_MONTH, 1);
		b.add(Calendar.DATE, -1);
		
		int week = a.get(Calendar.DAY_OF_WEEK);
		int day = b.get(Calendar.DATE);
		
		System.out.println(year +"년 "+ month +"월 달력\n"+"일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		int cnt = week-1;
		for(int i=1;i<=day;i++) {
			System.out.print(i+"\t");
			cnt++;
			if(cnt==7) {
				cnt=0;
			System.out.println("\n");
			}
		}
		System.out.println();
	}
}
