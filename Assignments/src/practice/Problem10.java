package practice;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Strong Numbers from 1 to 500 are, ");
		for(int i=1;i<500;i++) {
			
		int num=i;
		int dup=num;
		int a1=num;
		int count=0;
		
		while(dup>0) {
			
			dup=dup/10;
			count++;
			
		}
		int result=0;
		while(count>0) {
			int a=num%10;
			int res=1;
			for(int j=1;j<=a;j++) {
				res=res*j;
			}
			result=result+res;
			num=num/10;
			count--;
			
		}
		if(a1==result){
			System.out.println(result);
		}
		
	}
	}
}
