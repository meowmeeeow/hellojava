package hellojava;

public class ParamTest {
	public static void main(String[] args){
		//test1
		System.out.println("Testing TripleValue");
		double percent = 10;
		System.out.println("Before:percent="+percent);
		tripleValue(percent);
		System.out.println("After:percent="+percent);
	//test2
	System.out.println("\nTesting tripleSalary:");
	Employee3 harry = new Employee3("Harry",5000);
	System.out.println("Before salary:"+harry.getSalary());
	tripleSalary(harry);
	System.out.println("After salary:"+harry.getSalary());
	
	//test3
	System.out.println("\nTesting swap:");
	Employee3 a = new Employee3("Alice",70000);
	Employee3 b = new Employee3("Bob",60000);
	System.out.println("Befrore a:"+a.getName());
	System.out.println("Before b:"+b.getName());
	swap(a,b);
	System.out.println("After a :"+a.getName());
	System.out.println("After b:"+b.getName());
	
}
	public static void tripleValue(double x){
		x = 3*x;
		System.out.println("End of the method x="+x);
		
	}
	public static void tripleSalary(Employee3 x){
		x.raiseSalary(200);
		System.out.println("End of the method salary="+x.getSalary());
				
	}
	public static void swap(Employee3 x,Employee3 y){
		Employee3 temp =x;
		x = y;
		y = temp;
		System.out.println("End of method:x="+x.getName());
		System.out.println("End of the method:y="+y.getName());
	
	}
}
class Employee3{
	private String name;
	private double salary;
	
	public Employee3(String n ,double s){
		name = n;
		salary = s;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void raiseSalary(double byPercent){
		double raise = salary*byPercent/100;
		salary += raise;
	}

}
