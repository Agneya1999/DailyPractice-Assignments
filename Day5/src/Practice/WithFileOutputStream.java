package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithFileOutputStream {

	
	public void writeToFile() {
	String fileContent= "Write into file using FileOutputStream";

	try
	{
		FileOutputStream outputStream = new FileOutputStream("fileOutputStream.txt");

		byte[] strToBytes = fileContent.getBytes();
		outputStream.write(strToBytes);
		System.out.println("File is created successfully with the content.");
		outputStream.close();
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
	
	}
	
	 public void readFromFile() {
		try {
			FileInputStream input=new FileInputStream("fileOutputStream.txt");
			
		input.skip(5);
		System.out.println("\n*********Input Stream after skipping 5 bytes:");
		int i=input.read();
		while(i!=-1) {
			System.out.println((char) i);
			i=input.read();
		}
		input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
