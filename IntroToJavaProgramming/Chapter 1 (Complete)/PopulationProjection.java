public class PopulationProjection {
	public static void main(String[] args) {
		double pop = 312032486;
		double days = 365;
		double hours = 365 * 24;
		double minutes = hours * 60;
		double seconds = minutes * 60;
		double oneYear = (seconds / 7) - (seconds / 13) + (seconds / 45);
		
		System.out.println("Year 1: " + (int)(pop + oneYear));
		System.out.println("Year 2: " + (int)(pop + (oneYear * 2)));
		System.out.println("Year 3: " + (int)(pop + (oneYear * 3)));
		System.out.println("Year 4: " + (int)(pop + (oneYear * 4)));
		System.out.println("Year 5: " + (int)(pop + (oneYear * 5)));
	}
}