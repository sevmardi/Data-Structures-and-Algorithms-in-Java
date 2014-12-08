package Palantir_Interview_Questions;

import java.util.PriorityQueue;

public class SumOfSmallestThreeNumbers {
	
	public static void main(String[] args) {
		
		
		
	}
	
	/**
	* Returns the sum of the three smallest integers in an array.
	* Wrote the method like this in the event that we need to return
	* more than the sum of three variables we could easily expand.
	* Solution is O(n) - One pass through array + O(1) removal from
	* PriorityQueue
	*
	* Solution could also be solved by holding three variables
	* and if the current number in the list is smaller than any
	* of the variables replace
	*
	* @param input - An array of integers
	* @return the sum of the three smallest numbers
	*/
	
	public static int SumThreeSmallest(int[] input)
	{
		PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
		int sum  = 0;
		if(input!=null)
		{
			for(Integer ints : input)
			{
				if(ints != null)
				{
					qu.add(ints);
				}
			}
			for(int i = 0; i<3; i++)
			{
				if(qu.peek() !=null)
				{
					sum= sum+qu.poll();
				}
				else{
					break;
				}
			}
		}
		return sum;
			
	}
}
