package stream10_collect;

import java.util.*;
import java.util.stream.Collectors;

// Collectors.groupingBy() 메소드는 그룹핑 후, 매핑이나 집계(평균, 카운팅, 연결, 최대, 최소, 합계)
// 를 할 수 있도록 두번째 매개값으로 Collector를 가질 수 있다. 
// Collectors가 가지는 메소드들 
// mapping(),averageDouble(),counting(), joining(), maxBy(), minBy(), 
// summingInt(),summingLong(),summingDouble()
public class StreamCollect04 {
	
	// Grouping & Reduction
	public static void main(String[] args) {
//		private String name;
//		private int kor,eng,math;
//		private int total;
//		private double avg;
		List<MyScore> scoreList = Arrays.asList(
				new MyScore("홍길동",MyScore.Sexual.MALE, 100, 45, 45),
				new MyScore("박찬호",MyScore.Sexual.MALE, 56, 67, 54), 
				new MyScore("곽재우",MyScore.Sexual.MALE, 67, 78, 89),
				new MyScore("류관순",MyScore.Sexual.FEMALE, 37, 88, 89)
		);
		
		// 성별로 평균점수를 저장하는 Map 만들어 보기 
		Map<MyScore.Sexual,Double> mapBySexual = 
				scoreList.stream().collect(
						Collectors.groupingBy(
								MyScore :: getSexual,
								Collectors.averagingDouble(MyScore::getAvg)
								
						)
				);
		
		System.out.println("남학생 평균 점수: "+mapBySexual.get(MyScore.Sexual.MALE));
		System.out.println("여학생 평균 점수: "+mapBySexual.get(MyScore.Sexual.FEMALE));
		
		// 성별 국어 평균점수를 저장하는 Map 만들어 보기 
				Map<MyScore.Sexual,Double> mapBySexual2 = 
						scoreList.stream().collect(
								Collectors.groupingBy(
										MyScore :: getSexual,
										Collectors.averagingDouble(MyScore::getKor)
										
								)
						);
				System.out.println("남학생 국어 평균 점수: "+mapBySexual2.get(MyScore.Sexual.MALE));
				System.out.println("여학생 국어 평균 점수: "+mapBySexual2.get(MyScore.Sexual.FEMALE));

		// 성별 이름을 쉼표로 나열하기 
				
				Map<MyScore.Sexual,String> mapName = 
						scoreList.stream().collect(
								Collectors.groupingBy(
										MyScore::getSexual,
										Collectors.mapping(
												MyScore::getName, 
												Collectors.joining(",")
										)
								)
						);
							
				System.out.println("남학생 명단: "+mapName.get(MyScore.Sexual.MALE));
				System.out.println("여학생 명단: "+mapName.get(MyScore.Sexual.FEMALE));

	}

}
