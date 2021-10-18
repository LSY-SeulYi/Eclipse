package ex04;

public class UserDefineE {

	public static void main(String[] args) {
		Account acc = new Account(50_000);
		//예금하기
		acc.deposit(100_000);
		System.out.println("현 잔고 : "+acc.getBalance());
		//출금하기
		try {
			acc.withdraw(200_000);
		} catch (BalanceInsufficientEx e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		
	}
}
