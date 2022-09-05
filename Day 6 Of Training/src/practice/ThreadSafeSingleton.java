package practice;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		System.out.println("ThreadSafeSingleton is called");
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
}
