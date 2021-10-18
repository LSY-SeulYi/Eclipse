package vo;

import java.util.Date;

public class Uni_Users {

	public Uni_Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String uni_no;
	private String uni_pos;
	private String uni_department;
	private String uni_name;
	private String uni_birth;
	private String uni_gender;
	private String uni_phone;
	private String uni_address;
	private String uni_id;
	private String uni_pw;
	private String uni_email;
	private Date uni_date;
	private int no;
	
	public Uni_Users(String uni_no, String uni_pos, String uni_department, String uni_name, String uni_birth,
			String uni_gender, String uni_phone, String uni_address, String uni_id, String uni_pw, String uni_email,
			Date uni_date, int no) {
		super();
		this.uni_no = uni_no;
		this.uni_pos = uni_pos;
		this.uni_department = uni_department;
		this.uni_name = uni_name;
		this.uni_birth = uni_birth;
		this.uni_gender = uni_gender;
		this.uni_phone = uni_phone;
		this.uni_address = uni_address;
		this.uni_id = uni_id;
		this.uni_pw = uni_pw;
		this.uni_email = uni_email;
		this.uni_date = uni_date;
		this.no = no;
	}
	
	public String getUni_no() {
		return uni_no;
	}
	public void setUni_no(String uni_no) {
		this.uni_no = uni_no;
	}
	public String getUni_pos() {
		return uni_pos;
	}
	public void setUni_pos(String uni_pos) {
		this.uni_pos = uni_pos;
	}
	public String getUni_department() {
		return uni_department;
	}
	public void setUni_department(String uni_department) {
		this.uni_department = uni_department;
	}
	public String getUni_name() {
		return uni_name;
	}
	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}
	public String getUni_birth() {
		return uni_birth;
	}
	public void setUni_birth(String uni_birth) {
		this.uni_birth = uni_birth;
	}
	public String getUni_gender() {
		return uni_gender;
	}
	public void setUni_gender(String uni_gender) {
		this.uni_gender = uni_gender;
	}
	public String getUni_phone() {
		return uni_phone;
	}
	public void setUni_phone(String uni_phone) {
		this.uni_phone = uni_phone;
	}
	public String getUni_address() {
		return uni_address;
	}
	public void setUni_address(String uni_address) {
		this.uni_address = uni_address;
	}
	public String getUni_id() {
		return uni_id;
	}
	public void setUni_id(String uni_id) {
		this.uni_id = uni_id;
	}
	public String getUni_pw() {
		return uni_pw;
	}
	public void setUni_pw(String uni_pw) {
		this.uni_pw = uni_pw;
	}
	public String getUni_email() {
		return uni_email;
	}
	public void setUni_email(String uni_email) {
		this.uni_email = uni_email;
	}
	public Date getUni_date() {
		return uni_date;
	}
	public void setUni_date(Date uni_date) {
		this.uni_date = uni_date;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "Uni_Users [uni_no=" + uni_no + ", uni_pos=" + uni_pos + ", uni_department=" + uni_department
				+ ", uni_name=" + uni_name + ", uni_birth=" + uni_birth + ", uni_gender=" + uni_gender + ", uni_phone="
				+ uni_phone + ", uni_address=" + uni_address + ", uni_id=" + uni_id + ", uni_pw=" + uni_pw
				+ ", uni_email=" + uni_email + ", uni_date=" + uni_date + ", no=" + no + "]";
	}
	
	
}
