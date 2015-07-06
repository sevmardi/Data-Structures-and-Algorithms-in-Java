package QuickSort_v2;

/**
 * 
 * @author zero-root
 *	QuickSort In java Based on a tut provided by http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html
 */
public class QuickSort
{
	private int[] numbers;
	private int number;
	
	public void sort(int[] values)
	{
		// check for empty or null array 
		if(values == null || values.length == 0)
		{
			return; 
		}
		this.numbers = values;
		quickSort(0, number-1);
		
	}
	public  void quickSort(int low, int high)
	{
		int i = low, j = high;
		// get the pivot element from the middle of the list 
		int pivot = numbers[low + (high-low) /2];
		
		// Divide into two lists 
		while( i <= j)
		{
			// if the current value from the left list is smaller, then the pivot
			// element, then get the next element from the left list 
			while(numbers[i] < pivot)
			{
				i++;
			}
			// if the current value from the right list is larger the the pivot 
			// element, then get the next element from the right list 
			while(numbers[j] > pivot)
			{
				j--;
			}
			// if we have found a values in the left list which is larger then the pivot
			// element and if we have found a value in the right list 
			// which is smaller then the pivot element then we exchange the values. 
			// As we are done we can increase i and j
			if(i <= j)
			{
				//exchange(i, j);
				i++;
				j--;
			}
		}
		// recrusion 
		if(low < j)
		{
			quickSort(low, j);
		}
		if(i < high)
			quickSort(i, high);
			
	}
	private void exchange(int i, int j)
	{
		int temp = numbers[i];
		numbers[i]  = numbers[j];
		numbers[j] = temp;
	}
}
