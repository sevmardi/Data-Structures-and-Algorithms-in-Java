package HashTable_v2;

import java.util.Enumeration;
import java.util.Hashtable;
//http://www.java-samples.com/showtutorial.php?tutorialid=375
public class HTDemoV2 
{
	//Demonstrate a Hashtable 
	
	public static void main(String[] args) {
		
		Hashtable balance = new Hashtable();
		Enumeration names; 
		String str;
		double bal;
		
		balance.put("John Doe", new Double(3423.34));
		balance.put("Tom Smith", new Double(123.22)); 
		balance.put("Jane Baker", new Double(1378.00)); 
		balance.put("Todd Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-19.08)); 
		// Show all balances in hash table. 
		
		names = balance.keys();
		while(names.hasMoreElements())
		{
			str = (String)names.nextElement();
			System.out.println(str + ":"+ balance.get(str));
			
			
		}
		System.out.println();
		// Deposit 1,000 into John Doe's account 
		bal = ((Double)balance.get("John Doe")).doubleValue();
		balance.put("John Doe", new Double(bal+1000));
		System.out.println("John Doe's new Balance is " + balance.get("John Doe"));
		
	}
}
