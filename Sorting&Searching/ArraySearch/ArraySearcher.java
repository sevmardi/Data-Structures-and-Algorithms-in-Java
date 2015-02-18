package ArraySearch;

public class ArraySearcher {

	public static void main(String[] args) {
		// searching arrays 
		
		
		String[] arr= {"nice","PingPong"};
		int result = StringSearcher(arr, "Gana");
		
		if(result==-1)
		{
			System.out.println("No Match was found");
						
		}
		else
		{
			System.out.println("Result is:" +arr[result]);
			
		}
		

	}
	
	public static int StringSearcher(String[] arr, String val)
	{
		int match = -1;
		for(int i=0; i<arr.length;i++)
		{
			
			if(arr[i].equalsIgnoreCase(val)){
				
				match = i;
				break;
				
			}
			
			}
		return match;
		
	}

}
