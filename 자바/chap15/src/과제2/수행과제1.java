package 과제2;

import java.util.*;

public class 수행과제1 {

	// Score 객체(학번,학생이름,국어,영어,수학)를 List에 담아 정렬을 총점이 높은 순으로 하기
// 정렬 우선순위는 총점으로 내림차순하되, 총점이 같은 경우 수학 성적을 우선순위로 하기.
// 객체 표현 양식 => 학번	이름	국어	영어	수학	총점	평균으로 나오게 출력
	ArrayList<Score> list;
	public 수행과제1() {
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