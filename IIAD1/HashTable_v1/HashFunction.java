package HashTable_v1;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashFunction {

	String[] arr;
	int arraySize;
	int itemInArr = 0;

	public static void main(String[] args) {

		//HashFunction balance = new HashFunction();

		Hashtable balance = new Hashtable();

		String str;
		Enumeration names;
		double bal;
		
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));

		// show all balances in hash tables
		
		names = balance.keys();
		while (names.hasMoreElements()) 
		{
			str = (String) names.nextElement();
			System.out.println(str + ":" + balance.get(str));
		}
		System.out.println();
		// depost 1,000 into Zara's account
		// something wrong with this.
		bal = ((Double)balance.get("Zara")).doubleValue();
		
		balance.put("Zara", new Double(bal + 1000));
		System.out.println("Zara's new Balance: " + balance.get("Zara"));

	}
}
