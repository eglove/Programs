public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance) {
		setId(id);
		setBalance(balance);
	}
	
	@Override
	void withdraw(double amount) {
		if(getBalance() - amount < 0) {
			System.out.println("Overdraft error");
		} else {
			setBalance(getBalance() - amount);
		}
	}
}