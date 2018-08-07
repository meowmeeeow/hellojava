package hellojava;

public class ManagerTest {
	public static void main(String[] args){
		Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
		boss.setBonus(5000);
		
		Employee5[] staff = new Employee5[3];
		
		staff[0] = boss;
		staff[1] = new Employee5("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee5("Tommy Tester",40000,1990,3,15);
		
		for (Employee5 e :staff)
			System.out.println("name"+e.getName()+"Salary"+e.getSalary());
			}
}
