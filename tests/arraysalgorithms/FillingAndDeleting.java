package arraysalgorithms;

import java.util.Arrays;

/**
 * 
 * @author HUNTED23
 * Filling and Deleting Arrays Element
 *
 */

public class FillingAndDeleting {
	public static void main(String[] args) {
		
		// filling arrays 
		
		int[] oneToTen = new int[10];
		
		for( int i = 0; i < oneToTen.length;i++)
		{
			oneToTen[i] = i+1;
		}
		System.out.println(Arrays.toString(oneToTen));
		
		
		String[] names ={"John","nancy","Bob"};
		names[1] = names[names.length-1];
		String[] newNames = new String[names.length-1];
		
		for(int i = 0; i <newNames.length;i++)
		{
			newNames[i] = names[i];
		}
		
		System.out.println(Arrays.toString(names));
		
	}

}
