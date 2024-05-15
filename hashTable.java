package practice;

import java.util.Hashtable;

/*
 * -value should not be null.
 * -display order is FIFO(First Come First Out).
*/
public class hashTable 
{
	public static void main(String args[])
	{
		Hashtable<String,Integer> empids = new Hashtable<>();
		
		//Insert elements.
		empids.put("John",12345);
		empids.put("Carl",54321);
		empids.put("Jerry",87365);
		empids.put("Carl",54444);
		
		//Print elements.
		System.out.println(empids);
		
		//Get a specific data
		System.out.println(empids.get("Carl"));
				
		//Check if  a certain key exist or not
		System.out.println(empids.containsKey("Jerry"));
				
		//Check if values exist or not.
		System.out.println(empids.containsValue(12345));
				
		//Update or replace key value pair
		empids.put("John",98765);
		System.out.println(empids);
				
		empids.replace("John",7777);
		System.out.println(empids);
				
		//Insert if the element is not there
		empids.putIfAbsent("Harry",8888);
		System.out.println(empids);
	}
}
