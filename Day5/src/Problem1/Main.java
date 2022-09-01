package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of dogs");
		int j=scr.nextInt();
		scr.nextLine();
		Dog[] d=new Dog[j];
		for(int i=0;i<j;i++) {
		
		System.out.println("Enter dog Breed Name");
		String s=scr.nextLine();
		System.out.println("Enter Cost");
		long l=scr.nextLong();
		System.out.println("Enter Dog Age");
		int a=scr.nextInt();
		scr.nextLine();
		Dog obj=new Dog(s, l, a);
		d[i]=obj;
		
		if(i==j-1) {
		obj.writeToFile(d);
        obj.readFromFile();
		}
		}
		
		
	}

}
