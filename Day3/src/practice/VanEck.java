package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VanEck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int range=10;
		int next=0;
		int distance=0;
		
		for(int i=0;i<range;i++) {
			if(m.containsKey(next)) {
				distance=i-m.get(next);
			}
			else {
				distance=0;
			}
			m.put(next, i);
			System.out.println(next+"");
			next=distance;
		}
		
		
		
		
		

	}

}
