package proxyPattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CommandExecutor executor = new CommandExecutorProxy("User1", "wrong pwd");
     try {
    	 executor.runCommand("Is -Itr");
    	 executor.runCommand(" rm -rf abc.pdf");
    	 
     }
     catch(Exception e) {
    	 System.out.println("Exception Message::"+e.getMessage());
     }
	}

}
