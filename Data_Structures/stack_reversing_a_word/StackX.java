package stack_reversing_a_word;

//Stack is used to reverse a string

public class StackX {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackX(int max) {

		this.maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}

	/**
	 * Add element to a stack
	 * 
	 * @param j
	 */
	public void push(char j) 
	{
		stackArray[++top] = j;
	}

	/**
	 * Remove an element from stack
	 */
	public char pop() 
	{
		return stackArray[top--];
	}

	/**
	 * Check if stack is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() 
	{
		return (top == -1); 
	}

	/**
	 * Peek at the top of stack
	 * 
	 * @return
	 */
	public char peek() 
	{
		return stackArray[top];
	}

}
