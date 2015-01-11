package LinearSearch;

public class LinearSearch {

	private long[]a;			// ref to array a
	private int nElems;			// number of data items
	
	public LinearSearch(int max) 		// constructor
	{
		a =  new long[max];		// create the array. 
		nElems = 0;				// no items assigned yet
	}
	//...........................................................................................................
	public boolean find(long searchKey)	// find specified value
	{
		int j;
		for(j=0;j<nElems;j++)			// for each element
		{				
			if(a[j] == searchKey)		// found item?
			{
				System.out.println("Found the right one!" + searchKey);	
				break;		// exit the loop before end
			}
		}
		if(j == nElems)		// gone to the end? if yes?
		{
			return false;	// can't find it 
		}
		else
		{
			return true;	// no, found it! 
		}
		
	}
	//..........................................................................................................
	public void insert(long value)		// put element into array
	{
		a[nElems] = value;				// insert it
		nElems++;						// incremnt size
	}
	//..........................................................................................................
	public boolean delete(long value)
	{
		int j;
		for(j=0;j<nElems;j++)		// look for it. 
		{
			if(value == a[j])
			{
				System.out.println("deleted the one");	
				break;
			}
		}
		if(j ==nElems)			// can't find it
		{
			return false;		//found it
		}
		else
		{
			for(int k=j;k<nElems;k++)		// move higher ones down
			{
				a[k] = a[k+1];
			}
			nElems--; 
			return false;
		}
		
	}
	//..........................................................................................................
	public void display()	// display array contents
	{
		for(int j=0;j<nElems;j++)		// for each element
		{
			System.out.print(a[j] + " "); // display it	
		}
		System.out.println("");
	}
	//..........................................................................................................
	//end class
}

