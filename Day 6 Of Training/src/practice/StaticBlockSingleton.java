package practice;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		System.out.println("StaticBlockSingleton is called");
	}
	
	static {
	try

	{
		instance = new StaticBlockSingleton();
	}catch(Exception e) {
		throw new RuntimeException("Exception occured in creating singleton instance");
	}
}
public static StaticBlockSingleton getInstance() {
	return instance;
}
}
