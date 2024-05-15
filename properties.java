package practice;

import java.util.Properties;

/*
 * -It contain both key and value pair both as a string.
 * -If duplicate key recent value is shown.
*/
public class properties 
{
	public static void main(String args[])
	{
		Properties p = new Properties();
		
		//Input elements
		p.setProperty("london","Harry");
		p.setProperty("Macaw","Henry");
		p.setProperty("Paris","Lisa");
		p.setProperty("london","Mary");
		p.setProperty("Sydney","John");
		
		//Print elements
		System.out.println(p);
		
		//Get values with key
		System.out.println(p.get("Paris"));
		System.out.println(p.getProperty("london"));
		
		//Size of property
		System.out.println(p.size());
		
		//To check empty or not
		System.out.println(p.isEmpty());
		
		//Delete elements
		p.remove("Sydney");
		System.out.println(p);
	}
}
