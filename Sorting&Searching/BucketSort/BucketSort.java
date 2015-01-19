package BucketSort;

import java.util.Arrays;

public class BucketSort {
	
	public static void sort(int[ ] a, int maxVal) throws Exception
	{
		int [] bucket = new int[maxVal+1];
		
		for(int i=0; i<bucket.length; i++)
		{
			bucket[i] = 0;
		}
		  for (int i=0; i<a.length; i++)
		 {
		         bucket[a[i]]++;
		 }
		  
		int pos = 0;
		
		for(int i=0;i<bucket.length;i++)
		{
			for(int j=0;j<bucket.length; i++)
			{
				a[pos++]=i;
			}
		}
	}
	public static void main(String[] args) throws Exception 
	{
		int maxVal = 5;
		
		int [] data= {5,2,31,51,9,21,62,92,1,3};
		
		System.out.println("Before: "+ Arrays.toString(data));
		
		sort(data,maxVal);
		
		System.out.println("After" + Arrays.toString(data));
	}
	
}
