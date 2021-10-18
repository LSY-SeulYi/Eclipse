package ex02_List;
// VO클래스, DTO클래스 (자료를 주고받고 함)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestOfBoard {

	public static void main(String[] args) {
		
		List<Board> 게시판 =	new ArrayList<>();
		게시판.add(new Board("썸머 타임","이슬이",Calendar.getInstance(),"이제 6월 중순~!! 장마 시로~!!"));
		게시판.add(new Board("여름 휴가","이슬이",Calendar.getInstance(),"7월 말일 3일은 여름 휴가다~~!!"));
		for(Object x:게시판) {
			System.out.println(x);
		}
		
		List<Board> 게시판2 = Arrays.asList(
				new Board("썸머 타임","이슬이",Calendar.getInstance(),"이제 6월 중순~!! 장마 시로~!!"),
				new Board("여름 휴가","이슬이",Calendar.getInstance(),"7월 말일 3일은 여름 휴가다~~!!")
		);
		for(Board x:게시판2) {
			System.out.println(x);
		}
	}
}
