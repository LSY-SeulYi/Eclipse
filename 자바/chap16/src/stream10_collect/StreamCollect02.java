package stream10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

// 사용자 정의 컨테이너(MyMemberList)의 활용 예제
public class StreamCollect02 {

	public static void main(String[] args) {
		List<MyMember> memList = Arrays.asList(
				new MyMember("hgd","홍길동","1234",MyMember.Gender.MALE,MyMember.City.DEAJUN),
				new MyMember("hgs","홍길순","1235",MyMember.Gender.FEMALE,MyMember.City.SEOUL),
				new MyMember("jc","정철","1236",MyMember.Gender.MALE,MyMember.City.BUSAN),
				new MyMember("rks","류관순","1237",MyMember.Gender.FEMALE,MyMember.City.DEAJUN),
				new MyMember("kwh","계월향","1238",MyMember.Gender.FEMALE,MyMember.City.SEOUL)
		);
		
		// 일반적 처리 방식
		Supplier<UserList> supplier = ()->new UserList();
		BiConsumer<UserList,MyMember> accumulator = (r,t)->r.accumulate(t);
		BiConsumer<UserList,UserList> combiner =(r1,r2)->r1.combine(r2);
		UserList userList = memList.stream()
				.filter(s->s.getGender()==MyMember.Gender.FEMALE)
				.collect(supplier,accumulator,combiner);
		
		// 람다방식으로 처리하기 
		UserList userList1 = memList.stream()
				.filter(s->s.getGender()==MyMember.Gender.FEMALE)
				.collect(
						() -> new UserList(),
						(r,t) -> r.accumulate(t),
						(r1,r2) -> r1.combine(r2));
					
		// 메소드 참조방식은 람다식보다 더 간편하다.
		UserList userList2 = memList.stream()
				.filter(s->s.getGender()==MyMember.Gender.FEMALE)
				.collect(UserList :: new , UserList :: accumulate, UserList :: combine);
		userList.getList().stream()
		.forEach(s->System.out.println(s));
	}
	// 실행 결과를 보면 순차 처리를 담당한 스레드는 main 쓰레드임을 알 있고,
	// MyMemberList() 생성자가 한번 호출되어 하나의 MyMemberList 객체가 생성되고
	// accumulate() 가 필터시 조건에 맞아 3번의 호출(여성인 경우만)로 수집되었다. 
}
