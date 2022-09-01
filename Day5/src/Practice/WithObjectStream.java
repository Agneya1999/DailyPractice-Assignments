package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WithObjectStream {
	public WithObjectStream() {
		
	}

	public void writeToFile() {
		int obj1=12;
		String fileContent=" Writing to file using object stream";
		
		try {
			FileOutputStream file=new FileOutputStream("withObjectStream.txt");
			ObjectOutputStream output=new ObjectOutputStream(file);
			output.writeInt(obj1);
			output.writeObject(fileContent);
			output.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void readFromFile() {
		try {
			FileInputStream fileStream=new FileInputStream("withObjectStream.txt");
			ObjectInputStream o=new ObjectInputStream(fileStream);
			System.out.println("Integer int:"+o.readInt());
			System.out.println(("String data"+o.readObject()));
			o.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
