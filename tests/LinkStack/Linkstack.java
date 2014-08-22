package LinkStack;

public class Linkstack
{
	
	private Linklist thelist;
	
//-----------------------------------------------------
	
	public Linkstack()
	{
		
		thelist = new Linklist();
		
		
	}
//-----------------------------------------------------------------
	
	public void push(long j)
	{
		thelist.insetFirst(j);
		
	}
//-----------------------------------------------------------------	
	public long pop()
	{
		
		return thelist.deleteFirst();
	}
	//-----------------------------------------------------------------	
	public boolean isEmpty()
	{
		
		return thelist.isEmpty();
		
	}
	//-----------------------------------------------------------------
	public void displayStack()
	{
		
		System.out.println("stack (top -->bottom): ");
		thelist.displayList();
	}
	//end class
}
