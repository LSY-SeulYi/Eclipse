
package stream11_concurrencyNParallelism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// List,Set,Map 과 같은 컬렉션이 아닌 사용자 정의 컨테이너 객체에 수집하는 방법
// 스트림은 요소들을 필터링, 매핑을 사용자 정의 컨테이너 객체에 수집할 수 있도록
// collect() 메소드를 추가적으로 제공한다.
// UserList는 ArrayList의 일종이다. is ~ a 관계
public class UserList extends ArrayList<MyMember>{ 

	public UserList(){
		System.out.println("["+Thread.currentThread().getName()+"] 가 UserList 생성메소드 호출");
	}
	public UserList getList(){
		return this;
	}
	
	// 스트림에서 요소를 수집하는 역할을 하는 수집Consumer 
	public boolean accumulate(MyMember member){
		boolean res = this.add(member);
		System.out.println("["+Thread.currentThread().getName()+"] 가 accumulate() 메소드 호출");
		return res; 
	}
	
	// 병렬처리시 최종처리를 위해 결합작업을 하는 Consumer
	// 병렬처리 할때에만 호출, 순차처리시에는 호출되지 않는다.
	public void combine(UserList other){
		System.out.println("combine..이 출력되나요?");
		this.addAll(other.getList());
	}
	
}
