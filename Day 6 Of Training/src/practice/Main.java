package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EagerInitializedSingleton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializedSingleton.getInstance();
		ThreadSafeSingleton.getInstance();
		
		EagerInitializedSingleton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializedSingleton.getInstance();
		ThreadSafeSingleton.getInstance();
	}

}
