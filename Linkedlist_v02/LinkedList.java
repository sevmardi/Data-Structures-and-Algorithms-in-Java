package Linkedlist_v02;

public class LinkedList 
{
	private Link first;
	// linkedlist constructor 
	
	public LinkedList() {
		
		// Here to show the first Link always starts as null
		
		first = null;
	
	}
	 //Returns true if list is empty
	public boolean isEmpty()
	{
		
		return first== null;
		
	}
	//Inserts a new Link at the first of the list
	public void insert(int data1, double bool)
	{
		Link link = new Link(data1, bool);
		link.nextlink = first;
		first = link;

	}
	//Deletes the link at the first of the list
	public Link delete()
	{
		// Removes the Link from the List

		Link temp = first;
		first=first.nextlink;
		return temp;
				
	}
	public void printList()
	{
		Link currentlink = first;
		System.out.println("List: ");
		while(currentlink != null)
		{
			currentlink.printLink();
			currentlink=currentlink.nextlink;
			
			
		}
		
	}
	
	

}
