public class AverageSpeedInKilometers {
	public static void main(String[] args) {
		double kilo = 24 * 1.6;
		double minuteF = 60/40; // Gets decimal for minutes
		double secondinMinute = 60 * 60;
		double secondF = (secondinMinute/35); 
		double dec = minuteF + secondF;
		
		System.out.println("Kilometers per hour is: " + kilo * (dec + 1)); 
	}
}