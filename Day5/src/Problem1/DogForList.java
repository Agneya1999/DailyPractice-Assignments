package Problem1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class DogForList implements Serializable {

	private String breedName;
	private long cost;
	private int age;
	public DogForList(String breedName, long cost, int age) {
		super();
		this.breedName = breedName;
		this.cost = cost;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Dog Details [BreedName=" + breedName + ", Cost=" + cost + ", Age=" + age + "]";
	}


	public void writeToFile(List<DogForList> d) {
		
		try {
			FileOutputStream file=new FileOutputStream("withObjectStream.txt");
			ObjectOutputStream output=new ObjectOutputStream(file);
			
				output.writeObject(d);
			
			
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
	public void display(List<DogForList> li) {
		Iterator<DogForList> iterator=li.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println("");
		}
	}
	
	public void remove(List<DogForList> li,int delete) {
		li.remove(delete);
		System.out.println("0th index data is removed");
		System.out.println("Dog details after removing the 0th index dog"+li);
		writeToFile(li);
		System.out.println("After deleteing updated list from file");
		readFromFile();
	}
		
	}

	
	

