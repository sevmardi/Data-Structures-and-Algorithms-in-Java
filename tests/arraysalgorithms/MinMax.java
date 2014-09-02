package arraysalgorithms;

public class MinMax {

	public static void main(String[] args) {
		// Finding a min or max value
		
		int[] nums={23,123,51,42,90};
		
		int currMax = nums[0];
		for(int i =1;i<nums.length;i++)
		{
			// you can easily change to find the minimaal value 
			// by changing the big or small operator
			if(nums[i] >currMax)
			{
				currMax = nums[i];
			}
		}
		System.out.println(currMax);
	}

}
