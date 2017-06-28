package SortedList;

public class SortedList {

	private Link first; // ref to first item in the list 

	public SortedList() {
		first = null;
	}
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public void insert(long key)
	{
		Link newLink = new Link(key); // make new link
		Link previous = null; // start at first 
		Link current = first;  
		
		// until end of list
		while(current != null && key > current.dData)
		{
			previous = current;
			current = current.next;
		}
		
		// at the beginning of list
		if(previous == null)
		{ 
			first = newLink; // first --> newLink;
		}
		else
			previous.next = newLink;
		
		newLink.next = current;
	}
	
	public Link remove()
	{
		Link temp = first; // save first 
		first =	first.next; // delete first
		
		return temp; // return value
	}
	
	public void displayList()
	{
		System.out.println("List (first --> last): ");
		
		Link current = first; // start at the beginning of list
		
		while(current != null)
		{
			current.display();
			current = current.next;
		}
		
		System.out.println("");
	}
}
