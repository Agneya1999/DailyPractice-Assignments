package practice;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s=new Scanner(System.in);
	        StringBuffer str=new StringBuffer(s.nextLine());
	        String strr=str.toString();
	        str.reverse();
	        if(str.toString().equals(strr))
	            System.out.println(" is a Palindrome");
	        else
	            System.out.println(" is not a Palindrome");
	        
	    }
}
