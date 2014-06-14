import java.io.File;
import java.awt.*;

public class ComputerInfo {
	public static void main(String[] args) {
		// Display OS
		System.out.println("Operating System: " + System.getProperty("os.name"));
		
		// Display RAM
		com.sun.management.OperatingSystemMXBean bean =
			(com.sun.management.OperatingSystemMXBean)
			java.lang.management.ManagementFactory.getOperatingSystemMXBean();
		long memory = bean.getTotalPhysicalMemorySize();
		long gb = (long)(Math.pow(2,30));
		System.out.println("Memory: " + memory / gb + " GB");
		
		// Display processor model
		System.out.println("Processor: " + System.getenv("PROCESSOR_ARCHITECTURE"));
		
		// Display Hard Disk Size
		File file = new File("c:");
		long totalSpace = file.getTotalSpace();
		System.out.println("Disk Space: " + totalSpace / gb + " GB");
		
		// Display free space
		long freeSpace = file.getFreeSpace();
		System.out.println("Free Disk Space: " + freeSpace / gb + " GB");
		
		// Display screen resolution
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println("Resolution = " + (int)width + " x " + (int)height);
	}
}