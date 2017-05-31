package LinkList;

public class LinkListApp {
	public static void main(String[] args) 
	{
		LinkList list = new LinkList();
		
		
		list.insertFirst(21, 21.0);
		list.insertFirst(9, 9.0);
		list.insertFirst(20, 20.0);
		
		
		list.displayList();
		
		Link find = list.findKey(9);
		if(find != null){
			System.out.println("Found the link with key " + find.number);
		}
		else
			System.out.println("can't find the key, sorry mate");
		
		Link delete = list.deleteKey(20);
		if(delete != null){
			System.out.println("Found the link with key " + delete.number);
		}
		else
			System.out.println("can't find the key to delete, sorry mate");
		
	/*	while(! list.isEmpty())
		{
			Link link = list.deleteFirst(); // delete link
			System.out.println("Deleted ");
			link.displayLink();
			
		}*/
		list.displayList();
	}
}
