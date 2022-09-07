package HRSystems;

public class Calling {

	public static void main(String[] args) {
		try {
			Employee e = new Ceo(6, "", "Bangalore", 100000, "Java,spring,Angular,Mysql", "SVB", 2, 5, 10, 4000000, 5, 6000);
			e.print();
			if(e.name.equals(null)||e.name.isEmpty()||e.name.isBlank()) {
				throw new NullException("Name not give, Please check");
			}
			
		}
		catch (NullException n) {
			// TODO: handle exception
			n.printStackTrace();
		}
	
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("There is some error. Please check the code");
		}
		finally {
			System.out.println("Operation successfull");
		}
		
		
	}
}

class NullException extends Exception{
public NullException(String s) {
	// TODO Auto-generated constructor stub
	super(s);
} 
		
	}

