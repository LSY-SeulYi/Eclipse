package 과제2;

import java.util.ArrayList;
public class 수행과제2 {
/////////////////////////////////////////////////////	
// Score 객체(학번,이름,국어,영어,수학) 을 list담아 정렬하기
// 정렬 우선 순위는 총점으로 내림차순정렬 함.
// 총점이 같은 경우는 수학 성적이 높은것으로 우선으로 정렬시킴 
// 객체표현 양식 :  학번  이름  국어  영어  수학  총점  평균 
/////////////////////////////////////////////////////
	ArrayList<Score> list;
	public 수행과제2() {
		list = new ArrayList<>();
		list.add(new Score("1212001","홍길동",78,89,59));
		list.add(new Score("1212002","김치국",98,56,69));
		list.add(new Score("1212003","정삼영",48,78,79));
		list.add(new Score("1212004","박영동",79,78,48));
		list.add(new Score("1212005","윤보수",77,89,99));
	}
	
	public void dispList() {
		Score.dispColumn();
		list.sort(new SortByTotalNMath());
		int rank=0;
		for(Score x:list) {
			x.setRank(++rank);
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		new 수행과제2().dispList();
	}
}
