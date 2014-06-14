public class Stock {
	private String symbol; // Stock symbol
	private String name; // Stock name
	private double previousClosingPrice; // Price for previous day
	private double currentPrice; // Price at current time
	
	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	public void setPreviousClosingPrice(double newPreviousPrice) {
		previousClosingPrice = newPreviousPrice;
	}
	
	public void setCurrentPrice(double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}
	
	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / currentPrice;
	}
}