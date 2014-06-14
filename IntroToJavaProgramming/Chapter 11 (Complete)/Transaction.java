import java.util.Date;

public class Transaction<E> {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(char type, double amount, double balance, String description) {
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.String = description;
	}
	
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return despcription;
	}
}