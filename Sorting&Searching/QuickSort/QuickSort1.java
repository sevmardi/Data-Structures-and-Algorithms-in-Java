package QuickSort;
/**
 * QuickSort-1
 * Demonstrates simple version of quick sort
 * to run this program, use QuickSort App
 */
public class QuickSort1 {
	
	private long[] arr;
	private int nElems;
	
	/**
	 * 
	 * @param max
	 */
	public QuickSort1(int max) {
		arr = new long[max];
		nElems = 0;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void insert(long value)
	{
		arr[nElems] = value;
		nElems++;
	}
	
	public void display()
	{
		System.out.print("A=");
		for(int j = 0; j<nElems; j++)
		{
			System.out.println(arr[j] + " ");
		}
		System.out.println(" ");
	}
	
	public void quickSort()
	{
		recQuickSort(0, nElems-1);	
	}
	
	/**
	 * 
	 * @param left
	 * @param right
	 */
	public void recQuickSort(int left, int right)
	{
		if(right-left <= 0)
		{
			return ;
		}
		else
		{
			long pivot = arr[right];		
			int parition = paritionIt(left, right, pivot);		
			recQuickSort(left, parition-1);		// sort left side
			recQuickSort(parition+1, right);		//sort right side 
		}
	}
	
	/**
	 * 
	 * @param left
	 * @param right
	 * @param pivot
	 * @return
	 */
	public int paritionIt(int left, int right, long pivot)
	{
		int leftPtr = left -1;
		int rightPtr = right;
		
		while(true)
		{
			while(arr[++leftPtr] < pivot)
			{
				;// nop
			}
			while(rightPtr > 0   && arr[--rightPtr] > pivot)
			{
				;// nop
			}
			if(leftPtr >= rightPtr)
			{
				break;
			}
			else
			{
				swap(leftPtr, rightPtr);
			}
		
		}
		swap(leftPtr, rightPtr);
		return leftPtr;
	}
	
	/**
	 * 
	 * @param dex1
	 * @param dex2
	 */
	public void swap(int dex1, int dex2)
	{
		long temp = arr[dex1];
		arr[dex1] = arr[dex2];
		arr[dex2] = temp;
	}
}
