package practice;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Perfect Numbers between 1 and 1000");
		for(int i=1;i<=1000;i++) {
			
		int value=i;
		int sum=0;
		for(int j=1;j<=value/2;j++) {
			if(value%j==0) {
				sum=sum+j;
				
			}
	}
		
		if(value==sum) {
			System.out.println(sum);
		}
	}
	}

}
