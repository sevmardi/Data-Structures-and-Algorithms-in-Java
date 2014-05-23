package Linkedlist_v03;

public class LinkedList {

	public Link firstlink;

	LinkedList() {
		firstlink = null;

	}

	public boolean isEmpty() {

		return firstlink == null;

	}

	public void insert(String booknaam, String author, int verkocht) {

		Link newlink = new Link(booknaam, author, verkocht);

		newlink.next = firstlink;
		firstlink = newlink;

	}

	public Link removeFirst() {

		Link Linkrefreneceremove = firstlink;

		if (!isEmpty()) 
		{

			// remove
			firstlink = firstlink.next;

		} else 
		{
			System.out.println("Empty list");

		}
		return Linkrefreneceremove;

	}

	public void display() 
	{
		Link showlink = firstlink;

		while (showlink != null) {

			showlink.display();
			System.out.println("Next Link" + showlink.next);

			System.out.println();

		}

	}

	public Link find(String booknaam) {

		Link thelink = firstlink;
		
		if(!isEmpty())
		{
			
			while(thelink.booknaam !=booknaam)
			{
				if(!isEmpty())
				{
					
					return null;
					
				}
			
				else
				{
					
					thelink= thelink.next
							;
					
				}
			}
			
		
		
		}
		else{
			
			System.out.println("Empty Linkedlist");
			
		}
		return thelink;
	}
	
	
	public Link removeLink(String booknaam)
	{
		
		
		Link currentlink = firstlink;
		Link previouslink= firstlink;
		
		while(currentlink.booknaam !=booknaam)
		{
			
			// check
			
			if(currentlink.next==null)
			{
				
				
				return null
	;
			}
			else{
				
				
				previouslink=currentlink;
				currentlink=currentlink.next;
			}
		}
		if(currentlink == firstlink)
		{
			firstlink=firstlink.next;
			
			
		}
		else
		{
			System.out.println("FOUND A MATCH");
			System.out.println("currentLink: " + currentlink);
			System.out.println("firstLink: " + firstlink);
			
			previouslink.next = currentlink.next;
			
			
		}
		return currentlink;
	}

}
