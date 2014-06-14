public class Time {
	private int hour, minute, second;
	
	public Time(){
		this(System.currentTimeMillis());
	}
	
	public Time(long num) {
		long totalSeconds = num / 1000L;
		this.second = (int)(totalSeconds % 60L);
		long totalMinutes = totalSeconds / 60L;
		this.minute = (int)(totalMinutes % 60L);
		int totalHours = (int)(totalMinutes / 60L);
		this.hour = (totalHours % 24);
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Accessors
	public int getHour(){
		return hour;
	} public int getMinute(){
		return minute;
	} public int getSecond(){
		return second;
	}
}