package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr= new Scanner(System.in);
		System.out.println("Please Enter the value of N");
		int n=scr.nextInt();
		System.out.println("Please Enter the value of M");
		int m=scr.nextInt();
		int[] arr=new int[n];
		Arrays.fill(arr, 1);
		int count=0;
		int i=0;
		while(arr[i]==1) {
		arr[i]=0;
		count++;
		i=((i+m)>=n)?i+m-n:i+m;
		}
		System.out.println("Total Number of chocolates eaten : "+count);
	}

}
