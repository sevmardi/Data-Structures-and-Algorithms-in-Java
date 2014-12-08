package Palantir_Interview_Questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class anagram {
	

/**
* Main method to see if two strings are anagrams
*
* @param args - No arguments needed
* @throws Exception
*/
	
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		
		if((a.length() != b.length() || a.length() == 0 || b.length() == 0))
		{
			System.out.println("Not Anagrams");		
		}
		else
		{
			run(a, b);
		}
	}
	
	/**
	* Runs the business logical to determine if two strings are
	* anagrams. This should be run after determining that the
	* both strings aren't empty and their length are equivalent
	*
	* @param a - First string
	* @param b - Second string
	*/
	
	public static void run(String a, String b)
	{
		HashMap<Character, Integer> hashmapA = buildHashmap(a);
	}

	private static HashMap<Character, Integer> buildHashmap(String a) {
		// TODO Auto-generated method stub
		return null;
	}

}
