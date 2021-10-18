package ex04;
// 은행 계정 휴내
public class Account {
	private long balance;
	public Account() {}
	public Account(int amt) {
		balance += amt;
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int amt) {
		balance += amt;
	}
	// 예외를 전가시키는 의의를 잘 알아야 함.
	public void withdraw(int amt) throws BalanceInsufficientEx {
		if(balance<amt) {
			throw new BalanceInsufficientEx("잔고 부족 : " + (amt-balance) + " 모자라요!");
		}
		balance -= amt;
	}
}
