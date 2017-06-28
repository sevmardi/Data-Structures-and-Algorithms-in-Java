package SortedList;

public class SortedListApp {

	public static void main(String[] args) {
		
		SortedList list = new SortedList();
		
		list.insert(12);
		list.insert(90);
		
		list.displayList();
		
		
		list.insert(10);
		
		list.insert(50);
		list.insert(60);
		
		
		list.displayList();
		
		list.remove();
		
		list.displayList();
		
	}
}
