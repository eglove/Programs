import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date date = new Date();
	
	// No-arg contructor
	Account() {
	}
	
	// Constructor for specific id and initial balance
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// Accessor methods
	int getId() {
		return id;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	Date getDateCreated() {
		return date;
	}
	
	// Mutator methods
	void setId(int id) {
		this.id = id;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	void setAnnualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}
	
	// Get monthly interest rate and monthly interest
	double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}
	double getMonthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}
	
	// Withdraw method to take specified amount out
	void withdraw(double amount) {
		this.balance -= amount;
	}
	
	// Deposit method that adds specified amount
	void deposit(double amount) {
		this.balance += amount;
	}
}