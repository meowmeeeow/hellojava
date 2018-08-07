package hellojava;
import java.util.*;
public class ConstructorTest {

	public static void main(String[] args){
		//fill the staff array with three Employee objects
		Employee4[] staff = new Employee4[3];
		
		staff[0] = new Employee4("Harry",40000);
		staff[1] = new Employee4(60000);
		staff[2] = new Employee4();
		
		//pirnt out information about all Employee objects
		for (Employee4 e : staff)
			System.out.println("name="+e.getName()+"id="+e.getId()+"salary"+e.getSalary());
		
	}
}

class Employee4{
	private static int nexId;
	
	private int id;
	private String name="";//instance field initialization
	private double salary;
	//static initialization block
	static{
		Random generator = new Random();
		//set nexId to a random number between 0 and 9999
		nexId = generator.nextInt(10000);
		
	}
	//object initialization block
	{
		id = nexId;
		nexId++;
	}
	//three overload constructors
	public Employee4(String n ,double s){
		name = n ;
		salary = s;
		
	}
	public Employee4(double s){
		//calls the Employee4(String,double)constructor
		this("Employee#"+nexId,s);
		
	}
	//the default construtor
	public Employee4(){
		//name initialized to"" --see above
		//salary not explicitly set -- initialized to 0
		//id initialized in initialization block
		
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
	
}
