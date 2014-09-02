package datastucture;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

	public static void main(String[] args) {
		// Working with Linkedlists
		
		LinkedList<String> glist = new LinkedList<String>();
		
		glist.add("Beef");
		glist.add("Kaas");
		glist.add("Tomoto");
		glist.add("Aardabel");
		
	
		ListIterator<String> iter = glist.listIterator();
		
		if(iter.hasNext()){
			String next = iter.next();
			System.out.println(next);
		}
		
		
		
		
	}

}
