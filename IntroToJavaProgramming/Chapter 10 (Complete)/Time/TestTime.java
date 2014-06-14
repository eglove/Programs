import java.util.Date;

public class TestTime {
	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}
}