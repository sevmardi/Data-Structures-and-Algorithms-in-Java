package Palantir_Interview_Questions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostFrequentCharacters {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(FrequentCharacters("these doors", 2));
		System.out.println(FrequentCharacters("today is that saturday", 3));
	}
	/**
	* Returns a string that contains the most frequent characters in order as
	* a string. The characters displayed have to be greater than the frequencyThreshold
	*
	* @param input - The string that we get the most frequent characters
	* @param frequencyThreshold - The number which the characters have to be greater
	* than in the string
	*
	* @return The most frequent characters in sorted order as a string
	*/
	
	public static String FrequentCharacters(String input, int freq)
	
	{
		HashMap<Character, Integer> hashmap = buildHashmap(input);
		List<Character> list = buildFrequencyCharList(hashmap, freq);
		
		Collections.sort(list);
		
		return ListToString(list);
		
	}
	/**
	* Builds a hashmap corresponding to the characters and the amount
	* of times the character is in the string
	*
	* @param input - The string that we get the most frequent characters
	* @return The hashmap corresponding to the characters/frequency
	*/
	
	public static HashMap<Character, Integer> buildHashmap(String input)
	{
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i< input.length(); i++)
		{
			Character character = input.charAt(i);
			if(hashmap.containsKey(character))
			{
				hashmap.put(character, hashmap.get(character)+i);
			}
			else{
				hashmap.put(character, 1);
			}
			
		}
		return hashmap;
	}
	
	/**
	* Builds a list corresponding to the characters that are above the frequency threshold
	*
	* @param hashmap - Hashmap with all the characters and their frequency
	* @param frequencyThreshold - The threshold we want to set for the characters
	* @return list of most used characters above frequency threshold
	*/
	
	public static List<Character> buildFrequencyCharList(HashMap<Character, Integer>hashmap,int freq)
	{
		List<Character> list = new ArrayList<Character>();
		
		for(Map.Entry<Character, Integer> entry :hashmap.entrySet())
		{
			Character key = entry.getKey();
			Integer value = entry.getValue();
			
			
			if(value >= freq)
			{
				list.add(key);
			}
		}
		return list;
	}
	
	/**
	* Returns the string representation of a list
	*
	* @param list - List we want to print
	* @return - printed list without the commas or brackets
	*/
	
	public static String ListToString(List<Character>list)
	{
		StringBuffer sb = new StringBuffer();
		for(Character c: list)
		{
			sb.append(c);
		}
		return sb.toString();
	}
	
	
}
