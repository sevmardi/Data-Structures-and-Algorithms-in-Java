package LinkStack;

public class Linklist {
	private Link first; // ref to the first item

	public Linklist() {

		first = null; // no items on the list, yet

	}

	public boolean isEmpty() {
		// true if list is empty
		return first == null;

	}

	public void insetFirst(long dd) {
		// insert at start of list

		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
	}

	public long deleteFirst() {

		Link temp = first;
		first = first.next;
		return temp.dData; // return deleted link

	}

	public void displayList() {

		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;

		}
		System.out.println("");

	}

	// end class
}
