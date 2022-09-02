package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainForList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<DogForList> li=new ArrayList<>();
 	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the number of dogs");
	int j=scr.nextInt();
	scr.nextLine();
	for(int i=0;i<j;i++) {
	
	System.out.println("Enter dog Breed Name");
	String s=scr.nextLine();
	System.out.println("Enter Cost");
	long l=scr.nextLong();
	System.out.println("Enter Dog Age");
	int a=scr.nextInt();
	scr.nextLine();
	DogForList obj=new DogForList(s, l, a);
	li.add(obj);
	
	if(i==j-1) {
		
	obj.writeToFile(li);
    obj.readFromFile();
    obj.display(li);
    System.out.println("Enter the value which needs to be removed");
	int delete=scr.nextInt();
	obj.remove(li,delete);
    }
	
	}
	
     
	}

}
