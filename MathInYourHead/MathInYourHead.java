import java.util.*;

public class MathInYourHead {
	public static void main(String[] args) {
		int level = 0;
		
		System.out.println("Welcome to Math In Your Head!");
		manager(level);
	}
	
	public static void manager(int level) {
		switch (level) {
			case 0: level0(level);
					break;
		}
	}
	
	public static void level0(int level) {
		int correct = 0;
		int first = 0, second = 0, multiplier = 0, answer = 0;
		Integer[] list1; Integer[] list2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nWelcome to Level 0!");
		
		// Be able to add a single digit number or a number followed by 0's to
		// any other number
		System.out.println("Warm up with some easy addition!");
		while(correct < 10) {
			first = 1 + (int)(Math.random() * 9); 
			second = 1 + (int)(Math.random() * 99);
			multiplier = (int)(Math.random() * 4);
			switch(multiplier) {
				case 0: break;
				case 1: first *= 10; break;
				case 2: first *= 100; break;
				case 3: first *= 1000; break;
			}
			
			System.out.print(first + " + " + second + " = ");
			answer = input.nextInt();
			
			if(first + second == answer) {
				correct++;
				System.out.println(correct + " correct.");
			} else {
				correct = 0;
				System.out.println(correct + " correct.");
			}
		}
		
		
		// Multiply any number by 10, 100, or 1000
		System.out.println("Keep going with some even easier multiplication!");
		correct = 0;
		while(correct < 10) {
			second = 1 + (int)(Math.random() * 99);
			multiplier = (int)(Math.random() * 3);
			switch(multiplier) {
				case 0: first = 10; break;
				case 1: first = 100; break;
				case 2: first = 1000; break;
			}
			
			System.out.print(first + " * " + second + " = ");
			answer = input.nextInt();
			
			if(first * second == answer) {
				correct++;
				System.out.println(correct + " correct.");
			} else {
				correct = 0;
				System.out.println(correct + " correct.");
			}
		}
		
		// Multiples of 3 & 4 (mult. table)
		System.out.println("Many people have trouble with their 3's and 4's "
			+ "multiplication tables. Do you?");
		list1 = fillArr(0, 9, 1);
		multArr(list1, 3);
		list1 = fillArr(0, 9, 1); // Re-shuffle
		multArr(list1, 4);
		
		// Fill out multiplication table 1-10
		System.out.println("Keep going! Try the entire multiplication table to"
			+ " ten!");
		list1 = fillArr(1, 10, 1);
		list2 = fillArr(1, 10, 1);
		multArrs(list1, list2, 0);
		
		// Multiplication table, rows are 2-9, columns are 11-19
		System.out.println("Let's try a unique multiplication table from 2 to"
			+ " 9 and from 11 to 19.");
		list1 = fillArr(2, 9, 1);
		list2 = fillArr(11, 19, 1);
		multArrs(list1, list2, 0);
		
		// Multiplication table, 11-19
		// Help: Add first number to second digit of second, multiply that by 
		// 10, then add product of second digits
		// 17*15=, 17+5=22, 22*10=220, 7*5=35, 220+35=255
		System.out.println("Now it gets tricky. Try your 11-19 multiplication"
			+ " table.");
		list1 = fillArr(11, 19, 1);
		list2 = fillArr(11, 19, 1);
		multArrs(list1, list2, 1);
		
		
		// Multiply 2 and 3 digit numbers by 1 digit numbers
		System.out.println("A little brain exercise. Multiply 2 and 3 digit " +
			"numbers by 1 digit numbers.");
		tenRight(1, 9, 10, 999, 0); // 1st # range, 2nd # range, help ID
		
		// Multiply 11 by any two digit number, offer help if needed
		// Help: Add two digits, put sum in middle, 23*11=253
		//       If sum is greater than 9, 1 carries to first number, 85*11=935
		System.out.println("Relax a little. Multiply 2 digit numbers by 11!");
		tenRight(11, 11, 10, 99, 1);
		
		// Multiply 11 by any three digit number, offer help
		// Help: Add first two digits, then add second two, put in middle, 
		//		  314*11=3454
		System.out.println("This is a fun one, multiple a 3 digit number by"
			+ " 11!");
		tenRight(11, 11, 100, 999, 2);

		// Square all 2-digit numbers that end in 5
		// Help: Multiply first digit by next highest, put 25 on end, 35^2=1225
		// Min #, max #, increment by, length
		System.out.println("Alright! Doing good! Try squaring a few 2 digit "
			+ "numbers that end in 5.");
		list1 = fillArr(15, 95, 10);
		arrSquare(list1);
		
		// Square 105, 115, 125, ... 195, 205
		//Integer[] list = new Integer[11];
		System.out.println("Good, now go for three digit numbers that end in "
			+ " 5!");
		list1 = fillArr(105, 205, 10);
		arrSquare(list1);
		
		// Multiply 2-digit numbers with same first digits and last digits add
		// up to 10
		// Help: Take first digit times next highest, add product of last digits
	}
	
	public static int randRange(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	
	public static void help(int h) {
		switch(h) {
			case 0: System.out.println("Add the first number to the second " +
				"digit of the second number. Multiply that by 10, " +
				"then add the product of the second digits." +
				"\nex. 17*15 -> 17+5=22 -> 22*10=220 -> 7*5=35 -> " +
				"220+35=255"); break;
			case 1: System.out.println("Add the two digits, place that sum " +
				"in the middle.\n32*11=253\nIf the sum is greater than 9, " +
				"the 1 carries over to the first numbers.\n85*11=935"); break;
			case 2: System.out.println("Add the first two digits, then add " +
				"the second two. Put the sum in the middle.\n" +
				"314*11=3454"); break;
			case 3: System.out.println("Multiply the first digit by the next " +
				"highest and tack a 25 on the end.\n" +
				"35^2=1225"); break;
		}
	}
	
	public static Integer[] fillArr(int min, int max, int incr) {
		Integer[] list = new Integer[((max - min)/incr) + 1];
		for(int i = 0; i < list.length; i++) {
			list[i] = min + (i * incr);
		}
		Collections.shuffle(Arrays.asList(list));
		return list;
	}
	
	public static void arrSquare(Integer[] list) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		while(correct != list.length) {
			System.out.println("Enter '0' for help.");
			System.out.print(list[correct] + "^2 = ");
			int answer = input.nextInt();
			
			if(answer == 0) {
				help(3);
			} else if(answer == list[correct]*list[correct]) {
				System.out.println("Correct!");
				correct++;
			} else {
				System.out.println("Wrong.");
			}
		}
	}
	
	public static void multArr(Integer[] list, int n) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		while(correct < list.length) {
			System.out.print(n + " * " + list[correct] + " = ");
			int answer = input.nextInt();
		
			if(n * (list[correct]) == answer) {
				System.out.println("Correct!");
				correct++;
			} else {
				System.out.println("Wrong.");
			}
		}
	}
	
	public static void multArrs(Integer[] list1, Integer[] list2, int h) {
		Scanner input = new Scanner(System.in);
		int i = 0; int j = 0;
		while(i < list1.length) {
			while(j < list2.length) {
				if(h == 1) {
					System.out.println("Enter '0' for help.");
				}
				
				System.out.print(list1[i] + " * " + list2[j] + " = ");
				int answer = input.nextInt();
				
				if(answer == 0) {
					help(0);
				} else if(answer == list1[i] * list2[j]) {
					System.out.println("Correct!");
					j++;
				} else {
					System.out.println("Wrong.");
				}
			}
			j = 0;
			i++;
		}
	}
	
	public static void tenRight(int min1, int max1, int min2, 
		int max2, int help) {
		
		int correct = 0; int answer;
		Scanner input = new Scanner(System.in);
		int first = randRange(min1, max1);
		int second = randRange(min2, max2);
		
		while(correct != 10) {
			if(help > 0)
				System.out.println("Enter '0' for help.");
		
			System.out.print(first + " * " + second + " = ");
			answer = input.nextInt();
			
			if(answer == 0) {
				help(help);
			} else if(answer == first * second) {
				System.out.println("Correct!");
				correct++;
				first = randRange(min1, max1);
				second = randRange(min2, max2);
			} else {
				System.out.println("Wrong.");
			}
		}
	}
}