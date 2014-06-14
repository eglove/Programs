public class TestAccount {
	public static void main(String[] args) {
	
		CheckingAccount check = new CheckingAccount(1, 1000);
		SavingsAccount save = new SavingsAccount(2, 10000);
		
		check.withdraw(2000);
		System.out.println(check.getBalance());
		
		check.withdraw(100);
		System.out.println(check.getBalance());
		
		save.withdraw(10001);
		System.out.println(save.getBalance());
		
		save.withdraw(200);
		System.out.println(save.getBalance());
	}
}