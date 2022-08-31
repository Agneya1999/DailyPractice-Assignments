package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//To fetch the phone number from a given string
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "(((\\+91)(-)?)+(7|8|9)\\d{9})|( )?(7|8|9)\\d{9}( )?";
		Pattern p=Pattern.compile(s);
		Matcher matc=p.matcher(str);
		while(matc.find()) {
			System.out.println(matc.group());
		}
		
		
	}

}
