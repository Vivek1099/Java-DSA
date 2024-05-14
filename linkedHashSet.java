package practice;

import java.util.LinkedHashSet;
/*
 * -it has no duplicates.
 * -order is same as input.
*/
public class linkedHashSet 
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> numberList = new LinkedHashSet<>();
		
		numberList.add(24);
		numberList.add(34);
		numberList.add(87);
		numberList.add(1);
		numberList.add(14);
		numberList.add(34);
		
		//Print list
		System.out.println(numberList);
	}
	
}
