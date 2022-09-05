package practice;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance =new EagerInitializedSingleton();
	
	//Private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
		System.out.println("EagerInitializedSingleton is called");
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
