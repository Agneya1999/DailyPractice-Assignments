package HRSystems;

public class Employee {

	 String name;
	 String address;
	 int salary;
	
	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	void print() {
		System.out.println("From Employee class ");
		
		System.out.println( "Name: "+this.name +"  Address: "+ this.address+"  Salary: "+ this.salary);
		System.out.println("");
		
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
