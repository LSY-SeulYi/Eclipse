package l07_ex;

import oracle.net.jdbc.TNSAddress.Address;


public class MyMember implements Comparable<MyMember>{
	public enum Gender{MALE,FEMALE}
	public enum City{Deajun,Seoul,Busan,Deagu}
	private String id;
	private String name;
	private String password;
	private Gender gender;
	private City city;
	private Address address;

	public MyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyMember(String id, String name, String password, Gender gender,City city,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.city= city;
		this.address = address;
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
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "MyMember [id=" + id + ", name=" + name + ", password="
				+ password + ", gender=" + gender +", city=" + city + ", address=" + address + "]";
	}
	@Override
	public int compareTo(MyMember o) {
		return this.getId().compareTo(o.getId());
	}
}
