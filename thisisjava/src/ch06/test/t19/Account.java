package ch06.test.t19;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if( 0 <= balance && balance <= 1000000 ) {
			// 매개값이 0 <= balance <= 1000000 범위의 값만 가짐
			this.balance = balance;
		} else {
			// 매개값이 음수이거나 백만원을 초가하면 현재 balance 값을 유지
		}
	}
}
