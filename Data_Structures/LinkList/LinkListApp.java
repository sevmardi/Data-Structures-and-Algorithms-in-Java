package LinkList;

public class LinkListApp {
	public static void main(String[] args) 
	{
		LinkList list = new LinkList();
		
		
		list.insertFirst(1, 21.0);
		list.insertFirst(1, 9.0);
		list.insertFirst(1, 20.0);
		
		
		list.displayList();
		
		while(! list.isEmpty())
		{
			Link link = list.deleteFirst(); // delete link
			System.out.println("Deleted ");
			link.displayLink();
			
		}
		list.displayList();
	}
}
