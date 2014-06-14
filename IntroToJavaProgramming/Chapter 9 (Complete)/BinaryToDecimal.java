import java.util.Scanner;

public class BinaryToDecimal{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		String s = input.nextLine();
		input.close();
		
		System.out.println("Decimal is: " + binaryToDecimal(s));
	}
	
	public static int binaryToDecimal(String binaryString) {
		int power = binaryString.length() - 1;
		int answer = 0;
		int num;
		
		for(int i = 0; i < binaryString.length(); i++) {
			num = Character.getNumericValue(binaryString.charAt(i));
			answer += num * Math.pow(2, power);
			power--;
		}
		
		return answer;
	}
}