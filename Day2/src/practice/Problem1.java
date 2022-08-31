package practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		int year = scr.nextInt();
		System.out.println(year>0?(year%4==0?((year%400!=0 && year%100==0)?"Not a leap year":"Leap year"):"Not a leap year"):"Number should be greater than 0");

	}

}
