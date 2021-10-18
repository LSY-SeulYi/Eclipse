package fx_orders;
// DB의 Book Table과 메핑되게 만든다.
public class Customer {

	private int custid;
	private String name;
	private String address;
	private String phone;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	// 콤보박스에 반영시킬 정보
	@Override
	public String toString() {
		return name +"("+custid+")";
	}
	// 히스토리에 반영시킬 정보	
	public String toString2() {
		return custid + "," + name + "," + address + "," + phone;
	}
	
	
	
	
}
