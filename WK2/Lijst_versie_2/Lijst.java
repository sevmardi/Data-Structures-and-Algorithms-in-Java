package Lijst_versie_2;
public class Lijst 
{
    private Entry header; 
    private Entry tail;
    
    private int size;

	
	public Lijst ()
	{
		header = null;
        tail = null;
        size = 0;
	}
	
	public Iterator iterator ()
	{
		return (new LijstIterator());
	}
	// moet nog
	public void addFirst (Object o)
	{
        
	}
	// moet nog
    public void addLast (Object o)
    {
        
    }
	
	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator
	{
	    Entry pos = header; // pos houdt de huidige positie bij in een lijstobject
		
		public boolean hasNext()
		{
			return (pos != null);
		}
		public Object next()
		{
			Entry temp = pos;
			pos = temp.next;
			return (temp.element);
		}	
	}

	// inwendige klasse Entry
	private class Entry
	{
		Object element;
		Entry next;
		
		Entry (Object element, Entry next)
		{
			this.element = element;
			this.next = next;
		}
	}
}
