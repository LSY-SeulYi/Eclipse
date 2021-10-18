package ex03;

// 아래패턴 => VO(DTO)클래스의 전형적인 모습

public class CellrulerPhone {
	
	// 캡슐화 (접근제한자)
	private String company;
	private String model;
	private String os;
	private int price;
	
	// 생성메소드 만들기 (기본생성자, 일반생성자)
	public CellrulerPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CellrulerPhone(String company, String model, String os, int price) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
		this.price = price;
	}
	
	// getter, setter 만들기
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 해시코드달라도 동일하거나 틀린것으로 만들어야할 때 필요.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + price;
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
		CellrulerPhone other = (CellrulerPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	// 입력창에 표현되는 방법 만들기. (객체표현양식)
	@Override
	public String toString() {
		return "CellrulerPhone [company=" + company + ", model=" + model + ", os=" + os + ", price=" + price + "]";
	}
	

	
}
