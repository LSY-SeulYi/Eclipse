package stream10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// 스트림은 요소들을 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 
// collect()를 제공하고 있다. 이 메소드를 이용하면 필요한 요소만
// 컬렉션 (셋이나 리트스나 아무곳에다 다 담을수 있음)으로 담을 수 있고, 요소들을 그룹핑한 후 집계(리덕션)할 수 있다.

public class StreamCollect01 { // 필터링한 요소 수집 샘플 

	public static void main(String[] args) {
//		MyMember의 멤버필드
//		private String id;
//		private String name;
//		private String password;
//		private Sexual sexual;
//		private City city;
		List<MyMember> memList = Arrays.asList(
				new MyMember("hgd","홍길동","1234",MyMember.Gender.MALE,MyMember.City.DEAJUN),
				new MyMember("hgs","홍길자","1235",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("hgs","홍길순","1235",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("hgz","홍길순","1239",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("jc","정철","1236",MyMember.Gender.MALE,MyMember.City.BUSAN),
				new MyMember("rks","류관자","1237",MyMember.Gender.FEMALE,MyMember.City.DEAJUN)
		);
		// 남자회원만 묶어 List 생성하기 
		List<MyMember> maleMember = memList.stream()
				.filter(s->s.getGender()==MyMember.Gender.MALE)
				.collect(Collectors.toList());
		// 확인 출력 해보기 
		maleMember.stream()	// .stream() => 위에서 스트림화 했기 때문에 생략해도 됨
		.forEach(s->System.out.println(s));
		
		System.out.println();

		// 여자회원만 묶어 TreeSet 생성 해보기 
		Set<MyMember> treeSet  = memList.stream()
				.filter(s->s.getGender()==MyMember.Gender.FEMALE)
				.collect(Collectors.toCollection(TreeSet::new));	// (TreeSet::new)); => 생성 메소드 호출
		// 확인 출력 해보기 
		treeSet.stream()
		.forEach(s->System.out.println(s));
		
	}

}
