package hellojava;

public class Manager extends Employee5 {
	//instance field
	private double bonus;
	//constructor
	public Manager(String name,double salary,int year,int month,int day){
		//call for super constrctor
		super(name, salary,year,month,day);
		bonus = 0;
	}
	//methods
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary +bonus;
	}

	public void setBonus(double b){
		this.bonus = b;
	}
}
