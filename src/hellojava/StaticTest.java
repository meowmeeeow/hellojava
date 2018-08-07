package hellojava;

public class StaticTest {
	public static void main( String[] args){
		Employee2[] staff = new Employee2[3];
		staff[0] = new Employee2 ("TOM",4000);
		staff[1] = new Employee2("Dick",5000);
		staff[2] = new Employee2("Harry",6400);
		
		for(Employee2 e :staff){
			e.setId();
			System.out.println("name"+ e.getName());
			
		}
		int n = Employee2.getNexId();
		System.out.println("Next available id ="+n);
		
	}
}

class Employee2{
	private static int nexId = 1;
	private String name;
	private double salary;
	private int id;
	
	public Employee2(String n ,double s ){
		name = n;
		salary = s;
		id = 0;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getId(){
		return id;
	}
	public void setId(){
		id = nexId;
		nexId++;
	}
	public static int getNexId(){
		return nexId;
	}
	public static void main(String[] args){
		Employee2 e = new Employee2("harry",5000);
		System.out.println(e.getName());
	}
}
