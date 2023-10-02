package Singleton;

public class LogManager {
	
	private static LogManager instance;
	
	private LogManager() {
		
		
	}
	
	public static LogManager getInstance() {
		if(instance == null)
		{
			instance = new LogManager();
		}
		return instance;
	}

	public void info(String msg) {
		System.out.println("Info: " + msg);
	}
	
	public void error(String msg) {
		System.out.println("Error: " + msg);
	}
	
	public void warn(String msg) {
		System.out.println("Warn: " + msg);
	}
}	
