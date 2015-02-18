package Linkedlist_v02;

public class List {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(1, 1.91);
		list.insert(1, 2.6);
		list.insert(1, 5.6);

		list.printList();
		while (!list.isEmpty()) {
			Link deletedlink = list.delete();
			System.out.println("Deleted:");
			deletedlink.printLink();
			System.out.println("");

		}
		list.printList();
	}

}
