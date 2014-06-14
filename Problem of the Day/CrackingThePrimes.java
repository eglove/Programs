/* One of the biggest areas in encryption is prime number generation. Eventually 
 * our computing power will grow to the point where RSA encryption will either 
 * need to be 1 million bits or a new key sharing standard will need to take 
 * over. In today's world a standard RSA key is 2048 bits. The key length is 
 * determined by the multiplication of 2 prime numbers, thus making it very hard 
 * to factor.

 * For today's challenge I have multiplied two small prime numbers together. 
 * Your objective is to find the two factors used. The 48 bit key can be 
 * bruteforced in a reasonable amount of time whereas the 146 bit key may take 
 * some more time and smarter engineering. As always feel free to post any code 
 * used in cracking the numbers.

 * Key (48 bit): 153728883468487

 * Key (146 bit): 50134918426382971596395239206900954838888151
 */
import java.math.BigInteger;

public class CrackingThePrimes {
	public static void main(String[] args) {
		double key1 = 153_728_883_468_487L;
		/* BigInteger key2 = new BigInteger(
			"50134918426382971596395239206900954838888151"); */
		
		// Find first prime % 0
		firstPrime(key1);
	}
	
	public static void firstPrime(double n) {
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				if(isPrime(i)) {
					System.out.println(i + ", " + (int)(n / i));
					break;
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}