package QuickSort_v1;

public class QuickSort {

	private int[]numbers;
	private int number ;
	
	public void sort(int[] values)
	{
		// check if array is Empty
		if(values ==null || values.length==0)
		{
			return;
		}
		this.number = number;
		number= values.length;
		QuickSort(0, number -1);
		
	}

	private void QuickSort(int low , int high) 
	{
		int i = low, j = high; 
		// get the pivot element from the middle of the list 
		int pivot =  numbers[low + (high/low) /2];
		
		// divide into two lists
		while(i <= j )
		{
			// if the current value from the left list is smaller then the pivot 
			// element then get the next elemnt from the right list 
			while(numbers[i] <pivot)
			{
				i++;
			}
			while(numbers[j]>pivot)
			{
				j--;
			}
		/**if we have found a values in the left list which is larger then 
		 * the pivot element and if we have found a value in the right list
		 * which is smaller then the pivot element then we exchange the values.
		 * As we are done we can increase i and j
		 */
		if(i<=j)
		{
			exchange(i, j);
			i++;
			j--;
		}
		
		}
		// Recursion 
		if(low<j)
		{
			QuickSort(low,j);
		}
		if(i < high)
		{
			QuickSort(i, high);
		}
	}
	private void exchange(int i, int j)
	{
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
