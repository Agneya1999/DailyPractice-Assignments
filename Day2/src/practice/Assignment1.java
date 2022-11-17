package practice;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		
		char[] c = a.toCharArray();
		for(int i=0;i<a.length();i++) {
			c[i]=a.charAt(i);
			System.out.println(c[i]);
		}
		

		
	}

}
