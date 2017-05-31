package LinkList;

public class LinkList {

	public Link first;

	public LinkList() {
		first = null; // set first to null
	}

	public boolean isEmpty() {
		return (first == null);
	}

	/**
	 * Insert at start of list
	 * 
	 * @param number
	 * @param salary
	 */
	public void insertFirst(int number, double salary) {
		Link newLink = new Link(number, salary); // create new instance of Link
													// class
		newLink.next = first; // newlink --> old first
		first = newLink; // fist --> newLink
	}

	/**
	 * Delete first item
	 * 
	 * @his method doen't check whether the list is empty.
	 * @return
	 */
	public Link deleteFirst() {
		Link temp = first; // save ref to link
		first = first.next; // delete it: first --> old next;
		return temp; // return delete link
	}

	/**
	 * Display list
	 */
	public void displayList() {
		System.out.println("List(first-->last):");

		Link current = first; // start at the beginning of list
		while (current != null) {
			current.displayLink(); // print data
			current = current.next; // move to the next link
		}
		System.out.println("");
	}

	public Link findKey(int key) {
		Link current = first; // start at first ;

		// check if list is empty
		while (current.number != key) {
			// check if we are at the end of the list
			if (current.next == null) {
				return null;
			}

			else
				current = current.next; // set the currnet to next;

		}
		return current; // found it
	}

	public Link deleteKey(int key) {
		Link current = first;
		Link previous = first;

		while (current.number != key) {
			if (current.next == null)
				return null; // did not find it
			else {
				previous = current; // go to the next
				current = current.next;
			}
		}
		// found it 
		if (current == first) 
		{
			first = first.next; // if first link, change first
		} else
			previous.next = current.next; // otherwise, bypass it. 

		return current;
	}
}
