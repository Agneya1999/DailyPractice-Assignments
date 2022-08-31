package practice;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {13,14,1,2,8,11};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if((i+1)<arr.length) {
			if(arr[i]>arr[i+1]) {
				count=i+1;
			}
		}
		}
		System.out.println("It has to be moved with " + count +" position");
		
	}

}
