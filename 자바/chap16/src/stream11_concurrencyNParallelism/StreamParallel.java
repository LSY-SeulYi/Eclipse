package stream11_concurrencyNParallelism;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

// 사용자 정의 컨테이너(MyMemberList)의 활용 예제
public class StreamParallel {

	// 병렬처리 스트림( parallelStream()) 은 포크 단계에서 차례로 요소를 적절히
	// 나누는 알고리즘에 의해 수행된다.
	// 포크조인 프레임워크는 포크와 조인 기능 이외에 스레드풀인 ForkJoinPool
	// 을 제공하는데, 각각의 코어에서 서브 요소를 처리하는 것은 개별 스레드가 해야하므로
	// 스레드 관리가 필요하다. 포크조인 프레임워크는 ExecutorService(클래스)의 구현 객체인 
	// ForkJoinPool을 사용해서 작업 스레드를 관리한다.
	// 병렬처리가 항상 우수한것은 아니다. 일단 컴퓨터의 CPU수가 많아야 좋고
	// 컬렉션의 요소수가 적고 처리시간이 짧으면 오히려 순차 처리가 나을 수도 있다.
	// 왜냐하면 스레드풀 생성, 스레드 생성 등의 추가적인 비용이 발생하기 때문이다.
	// ArrayList, 배열은 인덱스 요소로 관리하기 때문에 포크 단계에서 요소의 분리 작업이
	// 편해서 병렬처리 기간이 절약된다. 하지만, TreeSet, HashSet, LinkedList 등은 링크를
	// 따라가는데 필요한 소요기간이 있어 상대적으로 병렬처리가 늦다.
	
	// 싱글 코어 CPU 보단 코어의 수가 많을 수록 병렬처리 속도가 빨라진다.
	
	
	
	
		
	public static void main(String[] args) {
		List<MyMember> memList = Arrays.asList(
				new MyMember("hgd","홍길동","1234",MyMember.Sexual.MALE,MyMember.City.DEAJUN),
				new MyMember("hgs","홍길순","1235",MyMember.Sexual.FEMALE,MyMember.City.SEOUL),
				new MyMember("jc","정철","1236",MyMember.Sexual.MALE,MyMember.City.BUSAN),
				new MyMember("rks","류관순","1237",MyMember.Sexual.FEMALE,MyMember.City.DEAJUN),
				new MyMember("kwh","계월향","1238",MyMember.Sexual.FEMALE,MyMember.City.SEOUL),
				new MyMember("nys","노영숙","1239",MyMember.Sexual.FEMALE,MyMember.City.BUSAN),
				new MyMember("nsg","남상구","1240",MyMember.Sexual.MALE,MyMember.City.BUSAN)
		);
		// 사용자 정의 자료구조 UserList
		UserList userList = memList.parallelStream()
				.filter(s->s.getSexual()==MyMember.Sexual.FEMALE)
				.collect(UserList :: new ,UserList :: accumulate,UserList :: combine);	// 메소드 레퍼런스방식
		// x-> new UserList(x)
		userList.getList().stream()
		.forEach(s->System.out.println(s));

	}
}
