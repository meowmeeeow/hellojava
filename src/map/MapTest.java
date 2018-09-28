package map;
import java.util.*;

import interfaces.Employee;
public class MapTest {

	public static void main(String[] args){
		Map<String,String> staff = new HashMap<>();
		staff.put("144-25-5464", "Amy Lee");
		staff.put("567-24-2546", "Harry Hacker");
		
		System.out.println(staff);
		
		staff.remove("567-24-2546");
		
		staff.forEach((k,v) ->
		  System.out.println(k+v));
	
	}
}
