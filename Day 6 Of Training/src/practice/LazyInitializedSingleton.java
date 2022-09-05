package practice;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		System.out.println("LazyInitializedSingleton is called");
	}
	//object can be created only when the person calls the getInstance() method
	public static LazyInitializedSingleton getInstance() {
		if(instance==null) {
			instance= new LazyInitializedSingleton();
		}
		return instance;
		}
	}
