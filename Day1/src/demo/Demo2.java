package demo;

public class Demo2 {

	public static  void main(String[] args) {
		if(args.length>0) {
			 Integer a=Integer.parseInt(args[0]);
			    
			    if(a%4==0 ) {
			    	if(a%400!=0 && a%100==0) {
			    		System.out.println("not a leap year");
			    	}
			    	else {
			    		System.out.println("it is a leap year");
			    	}
			    }
			    else {
			    	System.out.println(" not a leap year");
			    }
					
					
				}
		else{
			System.out.println("please provide the input");
		}
	    
		}
	
	
	
	
	
   
}
