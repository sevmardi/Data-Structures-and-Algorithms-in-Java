package Hashtable;

public class HashEntry {

	private int value;
	private int key;

	public HashEntry(int value, int key) {
		this.value = value;
		this.key = key;
	}

	// Returns the value to which the specified key is mapped in this hashtable.
	public int getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}

}
