package HRSystems;

import java.util.HashMap;
import java.util.Map;

public class HRManagementSystem {

	Map<Integer, Employee> obj;
	public void populate(){
		obj=new HashMap<Integer, Employee>();
		obj.put(1001,new Employee(1,"Ross", "Bangalore", 100000));
		obj.put(1002, new Employee(2,"Antony", "Chennai", 60000));
		obj.put(1003,new Employee(3,"David", "Delhi", 50000));
		obj.put(1004,new SoftEngineers(4,"Abhi", "mysore", 80000, "Java, python", "SVB", 2));
	}
	public void display(){
		for(Map.Entry<Integer,Employee> b: obj.entrySet()) {
			System.out.println(b.getKey()+ "  "+b.getValue());
		}
		
	}
	@Override
	public String toString() {
		return "HRManagementSystem [obj=" + obj + "]";
	}
	
}
