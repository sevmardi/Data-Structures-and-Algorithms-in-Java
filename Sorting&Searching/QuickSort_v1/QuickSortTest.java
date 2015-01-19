package QuickSort_v1;

import java.util.Random;

public class QuickSortTest
{
	private int[ ] numbers;
	private final static int SIZE= 7;
	private final static int MAX  = 20;
	

	void setup() throws Exception
	{
		numbers = new int[SIZE];
		Random generator = new Random();
		for(int i  = 0; i < numbers.length;i++)
		{
			numbers[i] = generator.nextInt(MAX);
		}
	}
	
	// test
	public void testNull()
	{
		QuickSort sorter = new QuickSort();
		sorter.sort(null);
	}
	public void testEmpty()
	{
		QuickSort sorter = new QuickSort();
		sorter.sort(new int[0]);
	}
	// test to be written
}
