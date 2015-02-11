package Hashtable;

public class HashEntry {
	
	private int value;
	private int key;
	
	public HashEntry(int value, int key) 
	{
		this.value = value;
		this.key = key;
	}
	public int getKey()
	{
		return key;
	}
	public int getValue()
	{
		return value;
	}
	
	
}
