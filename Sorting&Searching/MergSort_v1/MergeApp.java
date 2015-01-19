package MergSort_v1;

public class MergeApp
{
	public static void main(String[] args) {
		// make 2 arrays which are going to merge into the Arrayc
		int[] arrayA = {23,47,81,95};
		int[] arrayB = {7,14,39,55,62,74};
		int[] arrayC = new int[10];
		
		Merge(arrayA,4, arrayB,6,arrayC);
		display(arrayC,10);
//-----------------------------------------------------------------------------------------------------------------------------		
		// end main()	
	}
	public static void Merge(int[] arrayA, int sizeA, int[]arrayB, int sizeB,int[]arrayC)
	{
		int aDex = 0, bDex=0, cDex=0;
		// after this step, there are four while loops. 
		
		// // comparing both arrays 
		while(aDex <sizeA && bDex <sizeB) // neither array are empty
		{
			if(arrayA[aDex] <arrayB[bDex])
			{
				arrayC[cDex++] = arrayA[aDex++];
			}
			else
				arrayC[cDex++] = arrayB[bDex++];
		}
		// deals with the situation when all the elements have been transferred out of arrayB
		while(aDex <sizeA)
		{
			arrayC[cDex++] = arrayA[aDex++];		
		}
		// handels the same situation when the elemnets left or transferred out of arrayA
		while(bDex <sizeB)
		{
			arrayC[cDex++] = arrayB[bDex++];		
		}
		
		// end merge
	}
//==================================================================================================================================	
	// display array
	public static void display(int[] theArray, int size)
	{
		for(int j=0; j<size;j++)
		{
			System.out.println(theArray[j]+ "");
			
		}
		System.out.println("Nice one");
	}
	//------------------------------------------------------
	// end mergeApp
}
