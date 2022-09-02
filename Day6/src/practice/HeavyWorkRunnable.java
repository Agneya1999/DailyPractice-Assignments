package practice;

public class HeavyWorkRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Doing heavy IO processing - START"+Thread.currentThread().getName()+"  " +Thread.currentThread().getId()+ " "+Thread.currentThread().getStackTrace());
		try {
			Thread.sleep(1000);
			doFileProcessing();
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy FILE IO processing - END"+Thread.currentThread().getName());
	}
	private void doFileProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
}
