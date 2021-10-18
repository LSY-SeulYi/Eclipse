package stream06_sort;

import java.util.Comparator;

public  class MyMember // 다중 구현과 다중 상속은 다름.
		implements Comparable<MyMember>,Comparator<MyMember>{
	public String id;
	public String name;
	public String password;
	public String remark;
	
	public MyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 편의상 일반생성자 이용 
	public MyMember(String id, String name, String password, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.remark = remark;
	}
	@Override
	public String toString() {// 객체표현양식
		return "MyMember [id=" + id + ", name=" + name + ", password="
				+ password + ", remark=" + remark + "]";
	}
	
	// 프로그램 내부에서 호출(프로그래머가 호출x)
	@Override
	public int compareTo(MyMember o) {
		// TODO 1,0,-1 리턴
		// 이름으로 정렬하고 이름이 같다면 id로 정렬 (오름차순)
		int rv = name.compareTo((o.name)); 
		if(rv==0){
			rv = id.compareTo(o.id); 
		}
		return rv;// 내림차순하려면 부호만 바꿔주면 끝.
	}
	@Override
	public int compare(MyMember o1, MyMember o2) {
		int rv = o1.name.compareTo(o2.name); 
		if(rv==0){
			rv =  o1.id.compareTo(o2.id); 
		}
		return rv;// 내림차순하려면 부호만 바꿔주면 끝.
	}
	
}
