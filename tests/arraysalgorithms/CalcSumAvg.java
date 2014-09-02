package arraysalgorithms;

public class CalcSumAvg {

	public static void main(String[]args)
	{
		// calculating the sum and average of integer values 
		
		int []nums= {5,20,10,25,31,50};
		
		int sum = 0;
		for(int i =0;i<nums.length;i++)
		{
			sum = sum + nums[i];
		}
		int avg = sum/nums.length;
		
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ avg);
	}
}
