package stream10_collect;

public class MyMember implements Comparable<MyMember>{
	
	public enum Gender{MALE,FEMALE}
	public enum City{SEOUL,BUSAN,DEAJUN}
	private String id;
	private String name;
	private String password;
	private Gender gender;
	private City city;
	
	public MyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyMember(String id, String name, String password, Gender gender,
			City city) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
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
	public Gender getGender() {
		return gender;
	}
	public City getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "MyMember [id=" + id + ", name=" + name + ", password="
				+ password + ", gender=" + gender + ", city=" + city + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyMember other = (MyMember) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public int compareTo(MyMember o) {
		
		return this.getId().compareTo(o.getId());
	}
	
	
}
