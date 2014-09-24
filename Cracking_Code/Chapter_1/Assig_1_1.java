package Chapter_1;

public class Assig_1_1 
{
	
	
	public static Boolean uniqueChar(String str)
	{
		boolean ContainUnieuq = false;
		for(char c: str.toCharArray())
		{
			if(str.indexOf(c) == str.lastIndexOf(c))
			{
				ContainUnieuq = true;
			}
			else
				ContainUnieuq = false;
			
		}
		return ContainUnieuq;
	}
	
	// refrence solve  >> off the book
	public static boolean isUniqueChar(String str)
	{
		if(str.length() > 26)
		{
			return false;
		}
		int checker = 0 ;
		for (int i=0; i <str.length(); i++)
		{
			int val = str.charAt(i) - 'a';
			if((checker &( 1 << val )) > 0) return false;
			checker |= (1 << val );
			
		}
		return true;
		
		
	}
	public static void main(String[] args)
	{
		String test = "asdasdo1ojolnansd";
		System.out.println(isUniqueChar(test));
	}
	
	
}
