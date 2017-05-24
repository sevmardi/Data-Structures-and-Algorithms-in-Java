package Queues;

public class QueueApp 
{

	public static void main(String[] args) {
		
		Queue qu = new Queue(5);
		
		System.out.println("inserted");
		qu.enqueue(10);
		qu.enqueue(12);
		qu.enqueue(14);
		qu.enqueue(16);
		qu.enqueue(20);
		
		
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();


		qu.enqueue(60);
		qu.enqueue(80);
		qu.enqueue(21);

		
		
		while(!qu.isEmpty())
		{
			long n = qu.dequeue();
			System.out.println(n);
			System.out.println("");
			
		}
		
		System.out.println("");
		
	}
}
