package Bloomberg_LP;

public class MergSort {
	
	public static void main(String[] args) {
		
		int[] arrayA = {1,2,3,4,5,6,7,8};
		int[] arrayB = {15,19,21,40,90,102};
		int[] arrayC = new int[14];
		
		merge(arrayA,8, arrayB,6,arrayC  );
		display(arrayC, 14);
	}
	public static void merge(int[] arrayA, int sizeA,  int[]arrayB, int sizeB, int [] arrayC)
	{
		int aDex = 0, bDex = 0, cDex = 0;
		
		while(aDex <sizeA  && bDex < sizeB) //neither array(s) are empty
		{
			if(arrayA[cDex] < arrayB[bDex])
			
				arrayC[cDex++] = arrayB[bDex++];
			else
				arrayC[aDex++] = arrayB[bDex++];
		}
		while(aDex<sizeA)					// arrayB is empty 
		{
			arrayC[cDex++] = arrayA[aDex++]; //  but arrayA is not empty
		}
		while(bDex <sizeB)					// arrayA is empty
		{
			arrayC[cDex++] = arrayB[bDex++]; // arrayB is not empty
		}
		
	}
	// end merge()
	
	public static void display(int[] array, int size)
	{
	for(int j=0;j<size;j++)
	{
		System.out.print(array[j] + " ");
	}
	System.out.println("");
	}
}
