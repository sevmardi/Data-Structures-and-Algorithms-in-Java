package LinkStack;

public class Link 
{

	public long dData; // data item
	public Link next; // next link in list
	
	// constructor
	public Link(long dd)
	{
		dData =dd;
	}
	public void displayLink()
	{
		
		System.out.println(dData + "");
	}
	// end class 
}
