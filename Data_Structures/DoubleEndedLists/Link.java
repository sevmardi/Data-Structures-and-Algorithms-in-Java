package DoubleEndedLists;

public class Link {

	public long data; // data item
	public  Link next; // next link in the list
	
	
	public Link(long d ) {
		data = d;
	}
	
	public void display() {
		System.out.println(data + " ");	
	}

}
