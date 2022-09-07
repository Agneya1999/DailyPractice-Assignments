package HRSystems;

public class Manager extends SoftEngineers {
	 int teams;
	 double bonus;
	 double budgets;
	
	
	public Manager(int empID, String name, String address, int salary, 
			String skillSet, String customers, int experience,
			int teams, double bonus, double budgets) {
		super(empID, name, address, salary, skillSet, customers, experience);
		this.teams = teams;
		this.bonus = bonus;
		this.budgets = budgets;
	}


	@Override
	void print() {
		super.print();
		System.out.println("From Manager Class");
		System.out.println("Teams: "+teams+"  Bonus: "+bonus+"  Budget: "+budgets);
		System.out.println("");
	}

}
