package practice;
/*
 * -HashMap/HashTable has two fields (key and value).
 * -It has no order.
 * -if key is duplicate latest value is shown 
*/
import java.util.HashMap;

public class hashMap 
{
	public static void main(String args[])
	{
		HashMap<String , Integer> empIds = new HashMap<>(); 
		
		//Add elements
		empIds.put("John",12345);
		empIds.put("Carl",54321);
		empIds.put("Jerry",87365);
		
		
		//Print elements
		System.out.println(empIds);
		
		//Get a specific data
		System.out.println(empIds.get("Carl"));
		
		//Check if  a certain key exist or not
		System.out.println(empIds.containsKey("Jerry"));
		
		//Check if values exist or not.
		System.out.println(empIds.containsValue(12345));
		
		//Update or replace key value pair
		empIds.put("John",98765);
		System.out.println(empIds);
		
		empIds.replace("John",7777);
		System.out.println(empIds);
		
		//Insert if the element is not there
		empIds.putIfAbsent("Harry",8888);
		System.out.println(empIds);
	}
}
