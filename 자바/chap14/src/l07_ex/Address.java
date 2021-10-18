package l07_ex;
import l07_ex.Address;
import l07_ex.MyMember;

public class Address {
	
	private String add;
	private String remain;
	
	public Address(String add, String remain) {
		this.add = add;
		this.remain = remain;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getRemain() {
		return remain;
	}
	public void setRemain(String remain) {
		this.remain = remain;
	}
	@Override
	public String toString() {
		return add + " " + remain;
	}
}