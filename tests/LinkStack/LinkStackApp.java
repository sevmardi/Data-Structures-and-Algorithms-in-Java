package LinkStack;

public class LinkStackApp 
{
	
	public static void main (String [] args)
	{
		
		Linkstack thestack = new Linkstack(); // make stack
		
		thestack.push(20);
		thestack.push(40);
		
		thestack.displayStack();
		
		
		thestack.push(60);
		thestack.push(80);
		
		thestack.displayStack();
		
		thestack.pop();
		thestack.pop();
		
		thestack.displayStack();
		// end main class 
	}

	
}
