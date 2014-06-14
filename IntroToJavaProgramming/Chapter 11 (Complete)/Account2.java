import java.util.Date;

public class Account2 {
	private int id ;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private String name;
	private ArrayList transaction = new ArrayList();
	
	// No-arg contructor
	Account2() {
		dateCreated = new java.util.Date;
	}
	
	// Constructor for specific id and initial balance
	Account2(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// New constructor with name
	Account2(int id, double balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
		dateCreated = new java.util.Date();
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
	
	public Date getDateCreated() {
		return dateCreated;
	}
}