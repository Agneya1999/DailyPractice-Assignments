package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WithObjectStream w=new WithObjectStream();
//        w.writeToFile();
//        w.readFromFile();
//        
    
//		WithBufferedWriter b=new WithBufferedWriter();
//        b.writeToFile();
//        b.readFile();
		
		WithFileOutputStream f=new WithFileOutputStream();
		f.writeToFile();
		f.readFromFile();
		

	}

}
