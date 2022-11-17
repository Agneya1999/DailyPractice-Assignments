package practice;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
		String ac="abcdeagsdea";
		char[] ab=ac.toCharArray();
		int count=0;
		for(int i=0;i<ab.length;i++) {
			for(int j=0;j<ab.length;j++) {
				if(ab[i]==ab[j]) {
					count++;
				}
				
			}
			System.out.println(ab[i]+"  "+count);
			count=0;
		}

	}

}
