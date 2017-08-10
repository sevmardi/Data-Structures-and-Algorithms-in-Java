package recruisive_binary_search;

public class OrdArray {

	private long[] arr; // ref to array

	private int nElems; // number of data items

	public OrdArray(int max) {
		arr = new long[max];

		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public int find(long searchKey) {
		return recFind(searchKey, 0, nElems - 1);
	}

	private int recFind(long searchKey, int lowerBound, int upperBound) {
		int curIn;

		curIn = (lowerBound + upperBound) / 2;

		if (arr[curIn] == searchKey)
			return curIn;

		else if (lowerBound > upperBound)
			return nElems; // can't find it

		else if (arr[curIn] < searchKey)
			return recFind(searchKey, nElems + 1, upperBound);
		else
			return recFind(searchKey, lowerBound, nElems - 1);
	}

	public void insert(long value) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i] > value) {
				break;
			}
		}
		for (int j = nElems; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		arr[i] = value;

		nElems++;
	}
	
	public void display()
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		System.out.println(" ");
	}
}
