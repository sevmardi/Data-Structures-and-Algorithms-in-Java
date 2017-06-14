package DoubleEndedLists;

public class FirstLastList {

	private Link first; // ref to the first link
	private Link last; // ref to the last link

	public FirstLastList() {
		first = null; // no links
		last = null; // no links
	}

	public boolean isEmpty() {
		return first == null; // true if no links
	}

	/**
	 * Insert at the front of the list
	 * 
	 * @param data
	 */
	public void insertFirst(long data) {
		Link newLink = new Link(data);

		// if empty, insert last
		if (isEmpty()) {
			last = newLink;
		}
		// newlink next is first
		newLink.next = first;
		first = newLink;
	}

	/**
	 * Insert at the end of the list
	 * 
	 * @param dd
	 */
	public void insertLast(long dd) {
		Link newLink = new Link(dd);

		// check if list is empty
		if (isEmpty()) {
			first = newLink; // set first as the newLink
		} else
			last.next = newLink; // oldlast --> newLink
		last = newLink; // newLink <-- last
	}

	/**
	 * Delete first data, assuming non-empty list
	 * 
	 * @return long
	 */
	public long deleteFirst() {
		Long temp = first.data; // save the first into temp

		if (first.next == null) {
			last = null; // null <-- last
		}

		first = first.next;

		return temp;
	}

	/**
	 * Display the list
	 */
	public void displayList() {
		System.out.println("List (first --> last): ");

		Link current = first; // start the the beginning

		while (current != null) {
			current.display();
			current = current.next; // move to the next link
		}
		System.out.println(" ");
	}

	// end of the class

}
