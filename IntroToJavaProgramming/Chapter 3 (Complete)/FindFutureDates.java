/* Write a program that prompts the user to enter an integer for today's day of
 * the week (Sunday is 0, Monday is 1..., and Saturday is 6). Also prompt the
 * user to enter the number of days after today for a future day and display the
 * future day of the week. Here is a sample run:
 * Enter today's day: 1
 * Enter the number of days elapsed since today: 3
 * Today is Monday and the future day is Thursday
 * Enter today's day: 0
 * Enter the number of days elapsed since today: 11
 * Today is Sunday and the future day is Wednesday.
 */
import java.util.Scanner;

public class FindFutureDates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days from today: ");
		int elapsed = input.nextInt();
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Saturday"};
			
		int answer = today + (elapsed);
		
		if(answer > 6)
			System.out.println("Today is " + days[today] + " and the future " +
				"day is " + days[answer % 7]);
		else
			System.out.println("Today is " + days[today] + " and the future " +
				"day is " + days[answer]);
	}
}