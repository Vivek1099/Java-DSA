package practice;

import java.util.Vector;

//synchronize
//can has duplicate elements

public class vectors 
{
	public static void main(String ags[])
	{
		Vector<Integer> v = new Vector<Integer>();
		
		//Insert elements
		v.addElement(23);
		v.add(34);
		v.addElement(26);
		v.addElement(90);
		v.addElement(23);
		
		
		//Print elements
		System.out.println(v);
		
		//Get index of elements
		System.out.println(v.indexOf(23));
		
		//To check whether empty or not.
		System.out.println(v.isEmpty());
		
		//Remove an element.
		v.removeElement(23);
		System.out.println(v);
		
		//Remove element by index
		v.remove(0);
		System.out.println(v);
	}
}
