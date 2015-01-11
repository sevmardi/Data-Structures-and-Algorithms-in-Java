package BinarySearch;

public class BinarySearch 
{
	private long[]a;
	private int nElems;
	
	public BinarySearch(int max) 
	{
		a = new long[max];
		nElems = 0;
	}
	public int size()
	{
		return nElems;
	}
	public int find(long searchKey)
	{
		int lowerbound = 0;
		int upperbound = nElems-1;
		int curln;
		
		while(true)
		{
			curln= (lowerbound + upperbound) /2;
			if(a[curln] == searchKey)
			{
				return curln;			// found it
			}
			else if(lowerbound > upperbound)
			{
				return nElems;
			}
			else
			{
				if(a[curln] < searchKey)
				{
					lowerbound = curln+1 ; // it's in the upper half
				}
				else
				{
					upperbound  = curln + -1;	// it's in lower half
				}
			}
		}// end while
	}//end find
	
	public void insert(long value)
	{
		int j ;
		for(j = 0; j<nElems;j++)
		{
			if(a[j] >value )
			{
				break;
			}
		}
		for(int k=nElems;k>j;k--)
		{
			a[k] = a[k-1];
		}
		a[j] = value;
		nElems--;
		
	}
	
	public boolean delete(long value)
	{
		int j = find(value);
		if(j==nElems)
		{
			return false;
		}
		else
		{
			for(int k=j;k<nElems;k++)
			{
				a[k] = a[k+1];
			}
			nElems--;
			return false;
		}
		
	}
	
	public void display()
	{
		for(int j=0;j<nElems;j++)
		{
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
}
