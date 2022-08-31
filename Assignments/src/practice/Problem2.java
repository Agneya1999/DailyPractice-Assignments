package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "(( )?([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/\\d\\d\\d\\d)|(( )?([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/\\d\\d)";
		Pattern p=Pattern.compile(s);
		Matcher matc=p.matcher(str);
		while(matc.find()) {
			System.out.println(matc.group());
		}
	}

}
