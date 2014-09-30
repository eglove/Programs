import java.util.Scanner;

public class TimeExecuted {
	public static void main(String[] args) {
		int n;
		double ans1 = 0, ans2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = input.nextInt();
		
		System.out.println("n^n\t\ti\t\t2^n");
		
		for(double i = 1; i <= n; i++) {
			ans1 = Math.pow(i,i);
			ans2 = Math.pow(2,i);
			System.out.println(ans1 + "\t\t" + i + "\t\t" + ans2 );
		}
	}
}