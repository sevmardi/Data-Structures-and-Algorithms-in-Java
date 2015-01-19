package HashTable_v1;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		
		Hashtable hash = new Hashtable();
		
		Enumeration names;
		String str;
		Double bal;
		
		hash.put("Zara", new Double(2323.23));
		hash.put("Mahbna", new Double(123.23));
		
		// show all the values 
		names = hash.keys();
		while(names.hasMoreElements())
			
		{
			str = (String)names.nextElement();
			System.out.println(str+":" + hash.get(str));
			hash.get(str);
			
		}
		System.out.println();
		// depost some money 
		bal = ((Double)hash.get("Zara")).doubleValue();
		hash.put("Zara", new Double(bal+100));
		
		hash.get("zara");
	}
}
