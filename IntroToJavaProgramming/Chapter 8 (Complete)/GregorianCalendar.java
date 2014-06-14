import java.util.*;

public class GregorianCalendar {
	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)
			+ "-" + cal.get(Calendar.MONTH)
			+ "-" + cal.get(Calendar.DAY_OF_MONTH));
	}
}