package Chapter_1;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysAndStrings 
{
	//ArrayList (Dynamically Resizing Array):
	public ArrayList<String> merge (String[] words, String[] more)
	{
		ArrayList<String> sentance = new ArrayList<String>();
		for(String w:words )sentance.add(w);
		for(String w: more) sentance.add(w);
		return sentance;
		
	}
	// StringBuffer / StringBuilder
	// Question: What is the running time of this code?
	
	public String makeSence(String[] words)
	{
		
		StringBuffer sentance = new StringBuffer();
		for(String w:words) sentance.append(w);		
		return sentance.toString();
	}
	// ANSWER: o(n^2) 
	/**
	 * where n is the number of letters in sentence. 
	 * Here’s why: each time you append a string to sentence, you create a copy of sentence and
	 *  run through all the letters in sentence to copy them over. 
	 *  If you have to iterate through up to n characters each time in the loop,
	 *  and you’re looping at least n times, that gives you an O(n^2) run time. Ouch
	 * 
	 */
	
	public String MakeSence(String[] words)
	{
		StringBuffer sentance = new StringBuffer();
		for(String w: words) sentance.append(w);
		return sentance.toString();
	}
}
