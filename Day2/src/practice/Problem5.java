package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        List<String> ad=new ArrayList<String>();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Order Name in Code");

			String str = sc.nextLine();
			switch (str) {
			case "MD":ad.add("Masala Dosa");
				System.out.println("Masala Dosa");
				
				break;
			case "PD":ad.add("Plain Dosa");
				System.out.println("Plain Dosa");
				
				break;

			case "OD":ad.add("Open Dosa");
				System.out.println("Open Dosa");
				
				break;

			default:
				System.out.println("Please check and enter the correct Order Name in code");
			}
			System.out.println("Do you want to enter another item, y or n");
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("n")) {
				flag=false;
			}
		}
		if(ad!=null) {
			for(String food:ad) {
				System.out.println(food);
			}
		}

	}

}
