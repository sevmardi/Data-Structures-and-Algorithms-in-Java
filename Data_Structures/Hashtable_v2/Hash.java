package Hashtable_v2;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash 
{
	public static void main(String[] args) throws Exception
	{
		
		// start with ten, expand by ten when limit reached
		Hashtable hash = new Hashtable(10,10);

		for(int i = 0 ; i<= 0;i++)
		{
			Integer integer = new Integer(i);
			hash.put(integer, "Number : " + i);
		}
		
		// get the value out again
		System.out.println(hash.get(new Integer(5)));
		
		// get the value out again 
		System.out.println(hash.get(new Integer(21)));
		
		System.in.read();
		
		// get all values 
		
		for(Enumeration e = hash.keys(); e.hasMoreElements();)
		{
			System.out.println(hash.get(e.nextElement()));
		}
		
	}
}
