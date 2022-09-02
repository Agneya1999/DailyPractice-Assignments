package HRSystems;

public class SoftEngineers extends Employee{
	

	 public SoftEngineers(String name, String address, int salary, 
			 String skillSet, String customers, int experience) {
		super(name, address, salary);
		this.skillSet = skillSet;
		this.customers = customers;
		this.experience = experience;
	}

	String skillSet;
	 String customers;
	 int experience;
	
	@Override
	void print() {
		super.print();
		System.out.println("From SoftEngineers Class");
		System.out.println("Skill Set: " +skillSet+"  Customer: "+ customers+"  Experience: "+ experience);
		System.out.println("");
	}

	@Override
	public String toString() {
		return super.toString()+" SoftEngineers [skillSet=" + skillSet + ", customers=" + customers + ", experience=" + experience + "]";
	}

	
}