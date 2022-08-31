package demo;

public class Excersise4 {

	public static void main(String[] args) {
		
		for(int i=2;i<=1000;i++) {
			int count=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
				if(count==1) {
					System.out.println(i);
				}
			}
		}

	}


