package Problem1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Dog implements Serializable{
private String breedName;
private long cost;
private int age;
public Dog(String breedName, long cost, int age) {
	super();
	this.breedName = breedName;
	this.cost = cost;
	this.age = age;
}


@Override
public String toString() {
	return "Dog Details [BreedName=" + breedName + ", Cost=" + cost + ", Age=" + age + "]";
}


public void writeToFile(Dog[] d) {
	
	try {
		FileOutputStream file=new FileOutputStream("withObjectStream.txt");
		ObjectOutputStream output=new ObjectOutputStream(file);
		for(int i=0;i<d.length;i++) {
			output.writeObject(d[i]);
		}
		
		output.close();
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
public void readFromFile() {
	try {
		FileInputStream file=new FileInputStream("withObjectStream.txt");
		ObjectInputStream o=new ObjectInputStream(file);
		while(true) {
			try {
				System.out.println(o.readObject().toString());
			}
			catch(EOFException e) {
				o.close();
				break;
			}
		}
		
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	
}
