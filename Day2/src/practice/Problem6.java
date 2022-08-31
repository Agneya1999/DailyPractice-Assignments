package practice;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
		int n=41;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)<n) {
					if(arr[i+j]==1) {
						arr[i+j]=0;
						
					}	
				}
				
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
