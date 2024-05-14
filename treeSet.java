package practice;

import java.util.TreeSet;
/*
 * -TreeSet(no duplicate,sorted order)
*/
public class treeSet 
{
	public static void main(String args[])
	{
		TreeSet<Integer> numberList = new TreeSet<>();
		
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
