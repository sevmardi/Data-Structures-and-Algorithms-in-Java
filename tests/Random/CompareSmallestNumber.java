package Random;

/**
 * 
 * @author Sevak
 * 
 *         QUESTION: suppose that we want to create a function that, when given
 *         an array of integers greater than 0, will return the integer that is
 *         the smallest in that array.
 *
 */
public class CompareSmallestNumber {

	public int firstSolution(int array[]) {

		int x, curMin;

		// set smallest value to first item in array
		curMin = array[0];

		/*
		 * iterate through array to find smallest value and also assume there
		 * are only 10 elements
		 */
		for (x = 1; x < 10; x++) {
			if (array[x] < curMin) {
				curMin = array[x];
			}
		}
		// return the smallest value in the array
		return curMin;
	}

	public int secondSolution(int array[]) {
		boolean min;

		int x, y;

		/*
		 * iterate through each element in array, assuming there are only 10
		 * elements:
		 */

		for (x = 0; x < 10; x++) {
			min = true;
			for (y = 0; y < 10; y++) {
				/*
				 * compare the value in array[x] to the other values if we find
				 * that array[x] is greater than any of the values in array[y]
				 * then we know that the value in array[x] is not the minimum
				 * 
				 * remember that the 2 arrays are exactly the same, we are just
				 * taking out one value with index 'x' and comparing to the
				 * other values in the array with index 'y'
				 */
				if (array[x] > array[y]) {
					min = false;

				}
				if (min) {
					break;
				}
			}
		}
		return array[x];
	}

}
