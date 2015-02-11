package Hashtable;

public class HashMap {
	
	private final static int Table_Size = 128;
	
	HashEntry[] table;
	
	/**
	 * 
	 */
	public HashMap() {
		table = new HashEntry[Table_Size];
		
		for (int i=0;i<Table_Size;i++)
		{
			table[i] = null;
		}		
	}	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public int get(int key)
	{
		int hash = (key % Table_Size);
		while(table[hash] != null && table[hash].getKey() != key)
			hash= (hash +1 ) % Table_Size;
		if(table[hash] ==null)
			return -1;
		else
			return table[hash].getValue(); 	
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void put(int key, int value)
	{
		int hash = (key % Table_Size);
		while(table[hash] != null && table[hash].getKey() != key)
			hash = (hash+1) % Table_Size;
		table[hash] = new HashEntry(value, key);
	}
}
