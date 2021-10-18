package ex04;

public class Test {

	public static void main(String[] args) {
		
		Account acc = new Account (100_000);
		acc.deposit(200_000);
		try {
			acc.withdraw(500_000);
		} catch (BalanceInsufficientEx e) {
			System.err.println(e.getMessage());
		}
	}
}
