package stream10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// collect() 메소드는 단순히 요소를 수집하는 기능 이외에 컬랙션의 요소들을
// 그룹해서 Map객체를 생성하는 기능도 제공한다. 
// collect()를 호출할 때 Collectors의 groupingBy()(쓰레드불안전한Map을 생성) -> 동기화가 안된 맵 생성
// 또는 groupingByConcurrent()(쓰레드에 안전한 Map을 생성)가	-> 동기화가 된 맵 생성
// 리턴하는 Collector를 매개값으로 대입하면 된다.

public class StreamCollect03 {

	public static void main(String[] args) {
		List<MyMember> memList = Arrays.asList(
				new MyMember("hgd","홍길동","1234",MyMember.Gender.MALE,MyMember.City.DEAJUN),
				new MyMember("hgs","홍길순","1235",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("jc","정철","1236",MyMember.Gender.MALE,MyMember.City.BUSAN),
				new MyMember("rks","류관순","1237",MyMember.Gender.FEMALE,MyMember.City.DEAJUN),
				new MyMember("kwh","계월향","1238",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("gjw","곽재우","1238",MyMember.Gender.MALE,MyMember.City.SEOUL)
		);
		// 남자리스트 생성
		Map<MyMember.Gender,List<MyMember>> mapBySexual = memList.stream()
				.collect(Collectors.groupingByConcurrent(MyMember::getGender));
		System.out.println(">>> 남자 <<<");
		mapBySexual.get(MyMember.Gender.MALE).stream()
		.forEach(s->System.out.println(s));
		// 여자 리스트 생성
		System.out.println(">>> 여자 <<<");
		mapBySexual.get(MyMember.Gender.FEMALE).stream()
		.forEach(s->System.out.println(s));
		
		//------------------------------ 조건에 맞는 자료중 특정 필드만 가져오기
		// getCity -> 도시에 해당되는 사람들의 getName을 가져오는 것
		Map<MyMember.City, List<String>> mapByCity = 
				 memList.stream().collect( Collectors.groupingByConcurrent(
				 MyMember::getCity, Collectors.mapping(MyMember::getName, Collectors.toList())
		  ));
		
		// 서울 
		System.out.println(">>> 서울 님들 이름 <<<");
		mapByCity.get(MyMember.City.SEOUL).stream()
		.forEach(s->System.out.println(s));
							 
		//-------------------------------------- 서울 남자들 id들 출력 
		Map<MyMember.City, List<String>> mapByCityNSexual = 
				 memList.stream().filter(s->s.getGender()==MyMember.Gender.MALE).collect( Collectors.groupingByConcurrent(
				 MyMember::getCity, Collectors.mapping(MyMember::getId, Collectors.toList())
		  ));
				
		System.out.println(">>> 서울에 사는 남자들의 아이디 <<<");
		mapByCityNSexual.get(MyMember.City.SEOUL).stream()
		.forEach(s->System.out.println(s));
			
	}
}
