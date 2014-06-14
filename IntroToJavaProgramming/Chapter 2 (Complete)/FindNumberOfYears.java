import java.util.Scanner;

public class FindNumberOfYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double hours, days, years;
		
		System.out.print("Enter the number of minutes: ");
		double min = input.nextDouble();
		
		hours = min / 60;
		days = hours / 24;
		years = days / 365;
		days = days % 365;
		
		System.out.println(min + " minutes is approximately " + (int)years +
			" years and " + (int)days + " days");
	}
}