public class CheckingAccount extends Account {
	
	public CheckingAccount(int id, double balance) {
		setId(id);
		setBalance(balance);
	}
	
	@Override
	void withdraw(double amount) {
		if(getBalance() - amount < -100) {
			System.out.println("Overdraft error");
		} else {
			super.withdraw(amount);
		}
	}
}