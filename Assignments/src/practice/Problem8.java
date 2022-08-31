package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= new Integer[100];
		Arrays.fill(a, -1);
		List<Integer> list=Arrays.asList(a);
		list.set(0, 0);
		int preVlaue=0;
		for(int i=1;i<=99;i++) {
			preVlaue=list.get(i-1);
			if(preVlaue-i>=0 && !list.contains(preVlaue-i)) {
				list.set(i, preVlaue-i);
			}
			else {
				list.set(i, preVlaue+i);
			}
		}
		System.out.println(list);
		

	}

}
