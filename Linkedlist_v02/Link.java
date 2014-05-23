package Linkedlist_v02;

public class Link {

	public int data1;
	public double bool;
	public Link nextlink;

	// link constructor

	public Link(int data1, double bool)
	{

		this.data1 = data1;
		this.bool = bool;

	}

	// print link data
	public void printLink() 
	{

		System.out.println("{" + data1 + "," + bool + "}");

	}

}
