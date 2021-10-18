package ex02_class;
// 은행의 계정을 모델링 한 클래스
public class Account {
	private String accountNo;	// 계좌번호
	private String clientName;	// 예금주
	// private int balance;	=> 잔액 (차변과 대변의 차액을 말함)
	private int creditTotal;	// 차변총액
	private int debitTotal;	// 대변 총액
	
	public Account() {}	// 마우스오른쪽 -> 소스 > 프롬슈퍼클래스
	public Account(String accountNo, String clientName) {	// 마우스오른쪽 -> 소스 > 유징필드
		super();
		this.accountNo = accountNo;
		this.clientName = clientName;
	}
	// 예금하는 기능
	public void deposit(int amount) {
		creditTotal += amount;
	}
	// 인출하는 기능
	public void withdraw(int amount) {
		debitTotal += amount;
	}
	public int getBalance() {
		return this.creditTotal-this.debitTotal;
	}
	// 계정의 구좌번호, 예금주, 차변합, 대변합, 잔액 목록을 보여주는 메소드
	public String toString() {
		return "구좌번호 : "+accountNo+", "+"예금주 : "+clientName+", "+"차변합 : "+creditTotal+", "+"대변합 : "+debitTotal+", "+"잔액 : "+getBalance();
	}

	public static void main(String[] args) {
		// 홍길동이 은행 계좌(통장)를 개설한다.
		Account a = new Account("111-00-111111","홍길동");
		// 통장을 만들때 200000원 저축한다.
		a.deposit(200_000);
		// 첫 월급 타서 전액을 저축 하다.
		a.deposit(2_500_000);
		// 친구가 어찌 알았는지 찾아 왔어요. 삼겹살 구워먹기 위해 50000원 인출
		a.withdraw(50_000);
		// 은행 계정의 현황
		System.out.println(a);
		
		Account acc = new Account("222-00-222222","유관순");
		acc.deposit(3_000_500);
		acc.withdraw(500);
		System.out.println(acc);
	};


}
