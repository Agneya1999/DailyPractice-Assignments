package practice;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		String str =scr.nextLine();
		String[] strArray=str.split("\\|");
		System.out.println("Social security number "+strArray[2]);
		

	}

}
