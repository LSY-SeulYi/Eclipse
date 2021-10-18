package ex14;

import java.util.Calendar;

// Calendar 클래스는 추상클래스 - 객체 생성 못함
// Calendar cal = new Calendar() => X
// Calendar cal = Calendar.getInstance(); => O
// 추상클래스로 만든 이유 - 각 지역마다 날짜 표기가 다를 수 있으므로
// 날짜 연산에 꼭 필요한 기능만 콘크리트화 시키고 나머지는 지역에서 알아서 사용하도록 추상화 시켜 놓았다.
public class CalenderTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();	// 오늘
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		// 요일 정수
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 오전인지 오후인지 알고 싶을때
		int ampm = cal.get(Calendar.AM_PM);
		
		// 시간알아내기
		int hour = cal.get(Calendar.HOUR);
		int hour1 = cal.get(Calendar.MINUTE);
		int hour2 = cal.get(Calendar.SECOND);
		
		
	}
}
