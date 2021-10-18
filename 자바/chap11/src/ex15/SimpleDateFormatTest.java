package ex15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(now);
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("지금은 yyyy년 MM월 dd일 a HH시 mm분 ss초 입니다.");
		System.out.println(sdf.format(now));
	}
}
