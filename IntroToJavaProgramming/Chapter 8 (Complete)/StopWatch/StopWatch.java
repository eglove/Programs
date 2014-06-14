public class StopWatch {
	private long startTime;
	private long endTime;
	
	// No-arg, initializes startTime
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	void start() {
		startTime = System.currentTimeMillis();
	}
	
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long getElapsedTime() {
		return endTime - startTime;
	}
}