package Linkedlist_v01;

public class LinkedListDemo
{

	
	public static void main(String[] args) {
		
		
		// create a linkedlist 
		LinkedList list= new LinkedList();
		
		// add elements to the linked list
		
		list.add("B");
		list.add("C");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("...");
		list.addLast("Z");
		list.addFirst("A");
		System.out.println("Orginal contents of List"+ list);
		
		// remove elemets from the linked list
		list.remove("B");
		list.remove(2);
		
		System.out.println("Contents of the list after deletion some objects " +list);
		
		// remove the first and last elements 
		list.removeLast();
		list.removeFirst();
		
		System.out.println("List after deleting first and the last element"+list);
		
		
		// get and set the value 
			
		Object object = list.get(2);
		
		System.out.println("list after change"+list);
		
		
		
	}

	
}
