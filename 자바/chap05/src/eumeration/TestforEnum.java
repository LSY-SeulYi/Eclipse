package eumeration;

import java.util.Arrays;

// enum의 활용
public class TestforEnum {

	public static void main(String[] args) {
		
		Yoil today = Yoil.월;		// Yoil.월 이늄 상수라고 함.
		int pos = today.ordinal();
		System.out.println("요일 중 월요일은 "+(pos+1)+"번째 요일입니다.");
		
		LeeDynasty num = LeeDynasty.인조;
		pos = num.ordinal();
		System.out.println("인조왕은 조선조의"+(pos+1)+"번째 군주이다.");
		
		LeeDynasty someKing = LeeDynasty.세종;
		pos = someKing.ordinal();
		System.out.println("세종왕은 조선조의"+(pos+1)+"번째 군주이다.");
		
		switch(today) {
		case 월:
			System.out.println("월래 마시는 날");
			break;
		case 화:
			System.out.println("화끈하게 마시는 날");
			break;
		case 수:
			System.out.println("수시로 마시는 날");
			break;
		default:
			System.out.println("그냥 마시세요~~");
		}
		
		LeeDynasty a = someKing.valueOf("태종");
		System.out.println(a);
		System.out.println(Arrays.toString(someKing.values()));
		// 문종과 연산군의 순번차이 
		LeeDynasty x = someKing.valueOf("문종");
		LeeDynasty y = someKing.valueOf("연산군");
		System.out.println("문종과연산군의 순번차이:"+x.compareTo(y));
		}
	}

