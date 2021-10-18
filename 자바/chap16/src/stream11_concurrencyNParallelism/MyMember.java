package stream11_concurrencyNParallelism;

public class MyMember implements Comparable<MyMember>{
	
	public enum Sexual{MALE,FEMALE}
	public enum City{SEOUL,BUSAN,DEAJUN}
	
	private String id;
	private String name;
	private String password;
	private Sexual sexual;
	private City city;
	
	public MyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyMember(String id, String name, String password, Sexual sexual,
			City city) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sexual = sexual;
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public Sexual getSexual() {
		return sexual;
	}
	public City getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "MyMember [id=" + id + ", name=" + name + ", password="
				+ password + ", sexual=" + sexual + ", city=" + city + "]";
	}
	@Override
	public int compareTo(MyMember o) {
		
		return this.getId().compareTo(o.getId());
	}
	
	
}
