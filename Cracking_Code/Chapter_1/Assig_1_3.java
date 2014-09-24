package Chapter_1;
/**
 * 
 * @author SM
 *	
 *Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. 
 *NOTE: One or two additional variables are fine. An extra copy of the array is not.
 *
 */
public class Assig_1_3 {
	
	public static String removeDup(String x)
	{
		if(x == null)
			return null;
		
		if(x.length() <= 1)
		{
			return x;
		}
		char[] str= x.toCharArray();
		Boolean[] flag = new Boolean[256];
		int tail = 0;
		int cur = 0 ;
		while(cur<str.length)
		{
			if(flag[str[cur]] == false)
			{
				flag[str[cur]] = true;
				str[tail] = str[cur];
				tail++;
				cur++;
			}
			else
				cur++;
		}
		
		return new String(str,0,tail);
		
	}
	public static void main(String[] args)
	{
		String test = "aabcdeaffgeaxam";
		System.out.println(removeDup(test));
	}
	
}
