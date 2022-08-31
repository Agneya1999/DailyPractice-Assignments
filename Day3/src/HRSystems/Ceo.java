package HRSystems;

public class Ceo extends Manager {
 double bonus2;
 int noOfEmployeesReporting;
 


public Ceo(String name, String address, int salary, 
		String skillSet, String customers, int experience, int teams,
		double bonus, double budgets, 
		double bonus2, int noOfEmployeesReporting) {
	super(name, address, salary, skillSet, customers, experience, teams, bonus, budgets);
	this.bonus2 = bonus2;
	this.noOfEmployeesReporting = noOfEmployeesReporting;
}


void print() {
	 super.print();
	 System.out.println("From Ceo Class");
	 System.out.println("Bonus(From Ceo Class): "+bonus2+" No of Employees: "+noOfEmployeesReporting);
	 System.out.println("");
 }
}
