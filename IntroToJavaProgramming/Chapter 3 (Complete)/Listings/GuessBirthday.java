import java.util.Scanner;

public class GuessBirthday {
	public static void main(String[] args) {
		String set1 =
			"1\t3\t4\t7\n" +
			"9\t11\t12\t15\n" +
			"17\t19\t21\t23\n" +
			"25\t27\t29\t31";
		
		String set2 =
			"2\t3\t6\t7\n" +
			"10\t11\t14\t15\n" +
			"18\t19\t22\t23\n" +
			"26\t27\t30\t31";
			
		String set3 =
			"4\t5\t6\t7\n" +
			"12\t13\t14\t15\n" +
			"20\t21\t22\t23\n" +
			"28\t29\t30\t31";
			
		String set4 =
			"8\t9\t10\t11\n" +
			"12\t13\t14\t15\n" +
			"24\t25\t26\t27\n" +
			"28\t29\t30\t31";
			
		String set5 =
			"16\t17\t18\t19\n" +
			"20\t21\t22\t23\n" +
			"24\t25\t26\t27\n" +
			"28\t29\t30\t31";
		
		int day = 0;
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt();
		
		if(answer == 1)
			day += 1;
			
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for NO and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer == 1)
			day += 2;
			
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer == 1)
			day += 4;
			
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer == 1)
			day += 8;
			
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer == 1)
			day += 16;
			
		System.out.println("\nYour birthday is " + day + "!");
	}
}