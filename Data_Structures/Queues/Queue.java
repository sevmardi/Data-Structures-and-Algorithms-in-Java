package Queues;

public class Queue {

	private int maxSize;
	private long[] queArray;
	private int front, rear, nItems;

	public Queue(int s) {

		this.maxSize = s;
		this.queArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	/**
	 * Put/Insert/Enqueue items into array
	 * 
	 * @param j
	 */
	public void enqueue(long j) {
		// check if read has wraparound
		if (rear == maxSize - 1) {
			rear = -1; // if son, set rear at -1
		}
		queArray[++rear] = j; // otherwise increment rear and insert
		nItems++; // finally increment items
	}

	/**
	 * Remove element from array
	 */
	public long dequeue() {
		// get value and incr front
		long temp = queArray[front++];

		// check if front has wrap around
		if (front == maxSize) {
			front = 0; // if so, deal with it.
		}
		nItems--;

		return temp;
	}

	/**
	 * Peek at the front of the queue
	 * 
	 * @return
	 */
	public long peek() {
		return queArray[front];
	}

	/**
	 * Check if queue is full
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (nItems == 0);
	}

	/**
	 * Check if queue is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return (nItems == maxSize);
	}

	/**
	 * Number of items in the queue
	 * 
	 * @return nItems
	 */
	public int size() {
		return nItems;
	}

}
