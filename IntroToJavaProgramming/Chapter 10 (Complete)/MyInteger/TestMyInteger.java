public class TestMyInteger {
	public static void main(String[] args) {
		// Method 1
		MyInteger value = new MyInteger(10);
		System.out.println(value.getValue() + " even " + value.isEven());
		System.out.println(value.getValue() + " odd " + value.isOdd());
		System.out.println(value.getValue() + " prime " + value.isPrime());
		MyInteger value2 = new MyInteger(11);
		System.out.println("\n" + value2.getValue() + " even " + value2.isEven());
		System.out.println(value2.getValue() + " odd " + value2.isOdd());
		System.out.println(value2.getValue() + " prime " + value2.isPrime());
		
		// Method 2
		System.out.println("\n10 even " + MyInteger.isEven(10));
		System.out.println("10 odd " + MyInteger.isOdd(10));
		System.out.println("10 prime " + MyInteger.isPrime(10));
		System.out.println("\n11 even " + MyInteger.isEven(11));
		System.out.println("11 odd " + MyInteger.isOdd(11));
		System.out.println("11 prime " + MyInteger.isPrime(11));
		
		// Method 3
		System.out.println("\n5 even " + MyInteger.isEven(new MyInteger(5)));
		System.out.println("5 odd " + MyInteger.isOdd(new MyInteger(5)));
		System.out.println("5 prime " + MyInteger.isPrime(new MyInteger(5)));
		System.out.println("\n6 even " + MyInteger.isEven(new MyInteger(6)));
		System.out.println("6 odd " + MyInteger.isOdd(new MyInteger(6)));
		System.out.println("6 prime " + MyInteger.isPrime(new MyInteger(6)));
		
		// Equals 1
		System.out.println("\n10 equals 5 " + value.equals(5));
		System.out.println("10 equals 10 " + value.equals(10));
		// Equals 2
		System.out.println("\n11 equals 5 " + MyInteger.equals(new MyInteger(11), 5));
		System.out.println("20 equals 20 " + MyInteger.equals(new MyInteger(20), 20));
		
		// Chars array to int
		char[] chars = new char[6];
		chars[0] = 'a'; chars[1] = 'b'; chars[2] = 'c';
		chars[3] = 'd'; chars[4] = 'e'; chars[5] = 'f';
		/* System.out.println("\nabcdef " + MyInteger.parseInt(chars)); */
		/* System.out.println("abcdefg " + MyInteger.parseInt("abcdefg")); */
	}
}