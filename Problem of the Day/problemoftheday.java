public class problemoftheday {
	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
			if(i % 1 == 0)
				System.out.print("problem");
			if(i % 5 == 0)
				System.out.print("of");
			if(i % 25 == 0)
				System.out.print("the");
			if(i % 100 == 0)
				System.out.print("day");
			System.out.println();
		}
	}
}