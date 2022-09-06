package practice;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		//String str2 = sc.nextLine();
		int flag=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
