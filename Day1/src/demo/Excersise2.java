package demo;

public class Excersise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int a=1;
		int b=1;
		int result=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++) {
			result=a+b;
			a=b;
			b=result;
			System.out.println(result);
		}
		
	}

}
