package practice;

public class MainForMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HeavyWorkRunnable h=new HeavyWorkRunnable();
     
    Thread t=new Thread(h);
    t.start();
	}

}
