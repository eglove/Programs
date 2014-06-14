public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if(value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if(value % 2 != 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		for(int i = 2; i < value; i++) {
			if(value % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(int num){
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int num){
		if(num % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger num){
		if(num.getValue() % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger num){
		if(num.getValue() % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger num){
		for(int i = 2; i < num.getValue(); i++) {
			if(num.getValue() % i == 0)
				return false;
		}
		
		return true;
	}
	
	public boolean equals(int num) {
		if(num == value)
			return true;
		else
			return false;
	}
	
	public static boolean equals(MyInteger num, int entry){
		if(num.getValue() == entry)
			return true;
		else
			return false;
	}
	
	public static int parseInt(char[] chars){
		return Integer.parseInt(new String(chars));
	}
	
	public static int parseInt(String string){
		return Integer.parseInt(string);
	}
}