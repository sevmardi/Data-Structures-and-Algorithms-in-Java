package datastucture;

import java.util.Stack;

public class Stacks {
	
	public static void main(String[] args) {
		// using stack 
		
		Stack<String> sk = new Stack<String>();
		
		sk.push("Tentamen #1");
		sk.push("Tentamen #2");
		sk.push("Tentamen #3");
		sk.push("Tentamen #4");
		
		//String Tentamen1 = sk.pop();
		
		
		
		System.out.println(sk.peek());
	}

}
