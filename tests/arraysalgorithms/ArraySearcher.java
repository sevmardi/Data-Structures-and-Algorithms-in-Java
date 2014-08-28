package arraysalgorithms;
/**
 * 
 * @author HUNTED23
 * search within an array
 */
public class ArraySearcher {

	public static void main(String[] args) {
		
	String[] toys = {"Bike", "Action Figure", "YOYO"};
	int result=	stringSearcher(toys, "nice");
	if(result == -1)
	{
		System.out.println(" Sorry Brother, but no Match found");
	}
	else
		System.out.println("Result:"+toys[result]);
		
	}
	public static int stringSearcher(String[]arr, String val)
	{
		int match = -1;
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(val))
			{
				match=i;
				break;
			}
			
		}
		return match;
		
	}
}
