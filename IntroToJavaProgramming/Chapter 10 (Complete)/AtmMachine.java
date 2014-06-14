import java.util.Scanner;

public class AtmMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// Create 10 accounts in an array, initial balance is 100
		Account[] array = new Account[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Account(i, 100);
		}
		
		// Ask user to enter id, if invalid, ask to enter correct id
		enterId(array);
	}
	
	public static void enterId(Account[] array) {
		Scanner input = new Scanner(System.in);
		
		// Enter id
		System.out.print("Enter an id: ");
		int id = input.nextInt();
		
		// Check if id is valid, if not get new input with new prompty
		boolean valid = false;
		while(!valid) {
			if(id >= 0 || id <= 9)
				valid = true;
			else {
				System.out.print("Enter a correct id: ");
				id = input.nextInt();
			}
		}
		
		// Send id and array onto main menu method
		mainMenu(id, array);
	}
	
	public static void mainMenu(int id, Account[] array) {
		Scanner input = new Scanner(System.in);
	
		// Display main menu
		System.out.print("\nMain Menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		int choice = input.nextInt();
		
		// Action for choice
		switch(choice) {
			case 1: System.out.println("The balance is: " 
				+ array[id].getBalance());
				break;
			case 2: System.out.print("Enter amount to withdraw: ");
				double w = input.nextDouble();
				array[id].withdraw(w);
				break;
			case 3: System.out.print("Enter amount to deposit: ");
				double d = input.nextDouble();
				array[id].deposit(d);
				break;
			case 4: enterId(array);
		}
		
		// After choice is made, prompt for new choice
		mainMenu(id, array);
	}
}