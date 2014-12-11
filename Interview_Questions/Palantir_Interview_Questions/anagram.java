package Palantir_Interview_Questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
		HashMap<Character, Integer> hashmapB = buildHashmap(b);
		
		boolean isAnagram = isAnagram(hashmapA, hashmapB);
		
		if(isAnagram)
		{
			System.out.println("Anagrams :) ");
		}
		else
			System.out.println("is not Anagrams :(  ");
		
	}
	 /**
	* Compares two hashmaps to determine if they contain the
	* equivalent amount of characters
	*
	* @param hashmapA - Built from first string
	* @param hashmapB - Built from second string
	*
	* @return true if the two hashmaps contain the same amount of characters
	*/
	public static boolean isAnagram(HashMap<Character, Integer> hashmapA, HashMap<Character, Integer>	hashmapB)
	{
		boolean isAnagram = true;
		
		for(Map.Entry<Character, Integer> entry : hashmapA.entrySet())
		{
			Character key = entry.getKey();
			Integer value = entry.getValue();
			
			if(hashmapB.containsKey(key))
			{
				int hashmapBValue = hashmapB.get(key);
				
				if(value != hashmapBValue )
				{
					isAnagram = false;
					break;
				}
			
					
			}
			else
			{
				isAnagram = false;
				break;
			}
			
		}
		return isAnagram;
	}
	
	 /**
	* Builds a hashmap from the string which contain the
	* amount the character (key) and the amount of times it
	* is used in the string (value)
	*
	* @param inputString - String you want to convert into a hashmap
	* @return Hashmap of the string
	*/
	public static HashMap<Character, Integer> buildHashmap(String inputString) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i =0; i<inputString.length(); i++)
		{
			char character  = inputString.charAt(i);
			
			if(hm.containsKey(character))
			{
				hm.put(character, hm.get(character) +2 );
				
			}
			else
				hm.put(character, 1);
		}
		
		
		
		return hm;
	}

}
