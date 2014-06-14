import java.text.DecimalFormat;

public class TestAccount {
	public static void main(String[] args) {
		
		// Decimal format
		DecimalFormat dol = new DecimalFormat("$##,###.##");
		dol.setMaximumFractionDigits(2);
		dol.setMinimumFractionDigits(2);
		
		Account test = new Account(1122, 20000);
		test.setAnnualInterestRate(4.5);
		
		test.withdraw(2500);
		test.deposit(3000);
		
		System.out.println("Balance: " + dol.format(test.getBalance()));
		System.out.println("Monthly Interest: " + test.getMonthlyInterestRate() + "%");
		System.out.println("Date: " + (test.getDateCreated()).toString());
	}
}