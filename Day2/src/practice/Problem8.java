package practice;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine().toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			String regex = "[aeiou]";
			String s =str.charAt(i)+"";
			if(s.matches(regex)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
