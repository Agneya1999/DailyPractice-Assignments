package practice;

import java.util.HashSet;
import java.util.Set;

public class CarsInIndia {
	
	

	Set<String> getcarIndia(){
		 Set<String> india=new HashSet<String>();
         india.add("Maruti");
         india.add("Mahindra");
         india.add("Tata");
         india.add("Hindustan Motors");
         india.add("Toyota");
         return india;	     
	}
	HashSet<String> getcarJapanese(){
		 HashSet<String> japan=new HashSet<String>();
        japan.add("Honda");
        japan.add("Toyota");
        japan.add("Nissan");
        japan.add("Mitsubhishi");
        japan.add("Maruti Suzuku");
        return japan;	     
	}
}
