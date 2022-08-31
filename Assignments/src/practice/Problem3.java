package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		 int amt=48;
		 Map<Integer, Integer> b=new HashMap<Integer, Integer>();
		 int[] noteArr= {500,200,100,50,20,10,5,2,1};
	      for(int i=0;i<noteArr.length;i++) {
	    	  b.put(noteArr[i], 0);
	      }
	      for(int i=0;i<noteArr.length;i++) {
	    	  if(amt/noteArr[i]>0) {
	    		  b.put(noteArr[i], amt/noteArr[i]);
	    		  amt=amt%noteArr[i];
	    	  }
	      }
	      for(int i=0;i<noteArr.length;i++) {
	    	  System.out.println(noteArr[i]+" : "+b.get(noteArr[i]));
	      }

}
}