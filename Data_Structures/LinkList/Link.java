package LinkList;

public class Link {

	public int number;
	public double salary;
	public Link next;
	
	
	public Link(int number, double salary) {
		this.number = number; // initialize number
		this.salary = salary; // initialize salary  
		this.next = null; 
	}
	
	public void  displayLink() {
		System.out.println("{" + number + ", " + salary + "}");
	}	
}


