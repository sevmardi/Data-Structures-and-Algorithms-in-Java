package datastucture;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	
	public static void main(String[] args) {
		
		// working with queues
		
		// queue is an interface and not object, this is what happing below!
		Queue<String> qu = new LinkedList<String>();
		
		qu.add("person1");
		qu.add("person2");
		
		String person1 = qu.remove();
		// String person2 = qu.remove();
		
		
		System.out.println("this has been removed from the list:" +person1);
		
		System.out.println("this is the top now: "+qu.peek());
	}
}
