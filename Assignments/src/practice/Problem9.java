package practice;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int value=scr.nextInt();
		System.out.println("All Factors of the Number are");
		
		
		for(int i=1;i<=value/2;i++) {
			if(value%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
