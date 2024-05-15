package practice;

import java.util.ArrayList;
import java.util.Arrays;

/*
 -Dosen't need to specify the  size of array list.
 -it has dynamic sizing.
 -array can hold primitive datatype and objects.
 -arraylist can only hold objects.
 -you cannot add elements in array dynamically
 */


public class Arraylist 
{
	public static void main(String args[])
	{
		String[] friendsArray= {"John","Chris","Eric","Luke"};
		
		ArrayList<String> friendsArrayList=new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke"));
		
		//Get element
		System.out.println(friendsArray[1]);
		System.out.println(friendsArrayList.get(1));
		
		//Get size
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size()); 
		
		//Add an element
		//you can't do that with arrays :(
		friendsArrayList.add("Mitch");
		System.out.println(friendsArrayList.size());
		System.out.println(friendsArrayList.get(4));
		
		//Set an element
		friendsArray[0]="Carl";
		System.out.println(friendsArray[0]);
		friendsArrayList.set(0,"Carl");
		System.out.println(friendsArrayList.get(0));
		
		//Remove an element
		//Can't do this with the arrays :(
		friendsArrayList.remove("Chris");
		System.out.println(friendsArrayList.get(1));
		
		//Print
		System.out.println(friendsArray); // it gives memory address of the array
		System.out.println(friendsArrayList);
		
		
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(12,23,45,67,78));
		
		//Get element
		System.out.println(arr.get(2));
		
		//Get size
		System.out.println(arr.size());
		
		//Add an element
		arr.add(50);
		System.out.println(arr);
		
		//Set an element
		arr.set(1,24);
		System.out.println(arr);
		
		//Remove an element
		arr.remove(5);
		System.out.println(arr);
		
		//Print
		System.out.println(arr);
	}
}
