package Linkedlist_v03;



public class Link {
	
	public String booknaam;
	private String author;
	private int verkocht ;
	
	public Link next;
	public Link(String author, String booknaam, int verkocht) {
	
		this.booknaam=booknaam;
		this.author=author;
		this.verkocht=verkocht;
	
	}
	
	public void display(){
	
	
			System.out.println(booknaam + "-" + author + "-" + verkocht);
}
	
	public String toString()
	{
		
		return booknaam;
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
	
		
		
	}

}
