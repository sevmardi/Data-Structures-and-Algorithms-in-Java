package SortedList;

public class Link {

	public long dData;
	public Link next;
	public Link(long dData) {
		super();
		this.dData = dData;
	}
	
	/**
	 * Display link
	 */
	public void display()
	{
		System.out.println(dData + " ");
	}
}
