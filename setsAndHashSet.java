package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;



/*
 *-hashset has no order but arraylist has order.
 *-hashset do not allow duplicates.
 *-we cannot remove elements by index because it has no order.
 *-HashSet(no duplicate,randomize)
 */
public class setsAndHashSet 
{
	public static void main(String args[])
	{
		Set<String> names =new HashSet<>();
		
		names.add("Walter");
		names.add("Skyler");
		names.add("Jesse");
		names.add("Mike");
		names.add("Saul");
		
		System.out.println(names);
		
		//Remove an element
		names.remove("Walter");
		System.out.println(names);
		
		//Size of set
		System.out.println(names.size());
		
		//Check elements whether present or not
		System.out.println(names.contains("Walter")); // return boolean 
		
		//To check empty or not
		System.out.println(names.isEmpty());
		
		//To delete all elements
		//names.clear();
		System.out.println(names);
		
		//Print all elements using loop(lambda expression) and Iterator
		names.forEach(System.out::println);
		
		Iterator<String> namesIterator = names.iterator();
		while(namesIterator.hasNext())
		{
			System.out.println(namesIterator.next());
		}
		
		//////////////////////////////////////////////////////////////////////////////
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		
		System.out.println(numberList);
		
		//Putting arraylist into a hashset
		Set<Integer> numberSet =new HashSet<>();
		numberSet.addAll(numberList); //any collection and add all of its elements to another collection.
		System.out.println(numberSet);
		
	}
}
