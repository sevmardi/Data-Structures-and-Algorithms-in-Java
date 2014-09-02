package arraysalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// selection sort
		
		int [] nums = {8,2,4,1,6,8,10};
		
		for(int i = 0; i <nums.length-1 ;i++)
		{
			for(int j = i+1;j<nums.length;j++)
			{
				if(nums[i] >nums[j])
				{
					int iVal = nums[i];
					nums[i]=nums[j];
					nums[j]=iVal;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
